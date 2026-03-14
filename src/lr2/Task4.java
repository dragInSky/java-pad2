package lr2;

import java.util.Scanner;

public class Task4 {

    static class Person {
        private String name;
        private int age;
        private String gender;

        Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя:");
        String name = scanner.nextLine();

        System.out.println("Возраст:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Пол:");
        String gender = scanner.nextLine();

        Person person = new Person(name, age, gender);

        System.out.println("Создан человек:");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Пол: " + person.getGender());
    }
}
