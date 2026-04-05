package lr3;

public class Task7 {

    public static void main(String[] args) {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Node headList = createFromHead(values);
        Node tailList = createFromTail(values);

        System.out.println("Список, созданный с головы:");
        printList(headList);

        System.out.println("Список, созданный с хвоста:");
        printList(tailList);
    }

    private static Node createFromHead(int[] values) {
        Node head = null;
        for (int i = 0; i < values.length; i++) {
            head = new Node(values[i], head);
        }
        return head;
    }

    private static Node createFromTail(int[] values) {
        if (values.length == 0) {
            return null;
        }

        Node head = new Node(values[0], null);
        Node tail = head;

        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }

        return head;
    }

    private static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
