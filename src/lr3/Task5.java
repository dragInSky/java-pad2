package lr3;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        fillMap(map);

        System.out.println("Строки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        StringBuilder zeroKeyValues = new StringBuilder();
        long product = 1;
        boolean hasLongStrings = false;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                if (zeroKeyValues.length() > 0) {
                    zeroKeyValues.append(", ");
                }
                zeroKeyValues.append(entry.getValue());
            }

            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                hasLongStrings = true;
            }
        }

        System.out.println("Строки с ключом 0: " + zeroKeyValues);
        if (hasLongStrings) {
            System.out.println("Произведение ключей, у которых длина строки > 5: " + product);
        } else {
            System.out.println("Строк длиннее 5 символов не найдено.");
        }
    }

    private static void fillMap(HashMap<Integer, String> map) {
        map.put(0, "код");
        map.put(1, "стол");
        map.put(2, "машина");
        map.put(3, "тетрадь");
        map.put(4, "дом");
        map.put(5, "телефон");
        map.put(6, "компьютер");
        map.put(7, "книга");
        map.put(8, "программа");
        map.put(9, "монитор");
    }
}
