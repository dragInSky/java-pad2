package lr3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + i + ": ");
            a[i] = scanner.nextInt();
        }

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.createHead(a);
        System.out.println("С головы: " + list1);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.createTail(a);
        System.out.println("С хвоста: " + list2);

        list2.addFirst(111);
        list2.addLast(222);
        list2.insert(1, 333);
        System.out.println("После добавления: " + list2);

        System.out.println("Удалили первый: " + list2.removeFirst());
        System.out.println("Удалили последний: " + list2.removeLast());
        if (n > 0) {
            System.out.println("Удалили по индексу: " + list2.remove(Math.min(1, n - 1)));
        }
        System.out.println("После удаления: " + list2);

        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.createHeadRec(a);
        System.out.println("С головы рекурсивно: " + list3.toStringRec());

        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.createTailRec(a);
        System.out.println("С хвоста рекурсивно: " + list4.toStringRec());
    }

    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    static class SinglyLinkedList {
        private Node head;

        public void createHead(int[] values) {
            head = null;
            for (int i = 0; i < values.length; i++) {
                addFirst(values[i]);
            }
        }

        public void createTail(int[] values) {
            head = null;
            for (int i = 0; i < values.length; i++) {
                addLast(values[i]);
            }
        }

        public void createHeadRec(int[] values) {
            head = null;
            createHeadRec(values, 0);
        }

        private void createHeadRec(int[] values, int index) {
            if (index >= values.length) {
                return;
            }
            addFirst(values[index]);
            createHeadRec(values, index + 1);
        }

        public void createTailRec(int[] values) {
            head = null;
            createTailRec(values, 0);
        }

        private void createTailRec(int[] values, int index) {
            if (index >= values.length) {
                return;
            }
            addLast(values[index]);
            createTailRec(values, index + 1);
        }

        public void addFirst(int value) {
            head = new Node(value, head);
        }

        public void addLast(int value) {
            Node node = new Node(value, null);
            if (head == null) {
                head = node;
                return;
            }

            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = node;
        }

        public void insert(int index, int value) {
            if (index < 0 || index > size()) {
                throw new IndexOutOfBoundsException("Неверный индекс: " + index);
            }
            if (index == 0) {
                addFirst(value);
                return;
            }

            Node ref = head;
            for (int i = 0; i < index - 1; i++) {
                ref = ref.next;
            }
            ref.next = new Node(value, ref.next);
        }

        public int removeFirst() {
            if (head == null) {
                throw new IllegalStateException("Список пуст");
            }
            int value = head.value;
            head = head.next;
            return value;
        }

        public int removeLast() {
            if (head == null) {
                throw new IllegalStateException("Список пуст");
            }
            if (head.next == null) {
                int value = head.value;
                head = null;
                return value;
            }

            Node ref = head;
            while (ref.next.next != null) {
                ref = ref.next;
            }
            int value = ref.next.value;
            ref.next = null;
            return value;
        }

        public int remove(int index) {
            if (index < 0 || index >= size()) {
                throw new IndexOutOfBoundsException("Неверный индекс: " + index);
            }
            if (index == 0) {
                return removeFirst();
            }

            Node ref = head;
            for (int i = 0; i < index - 1; i++) {
                ref = ref.next;
            }
            int value = ref.next.value;
            ref.next = ref.next.next;
            return value;
        }

        public String toStringRec() {
            return "[" + toStringRec(head) + "]";
        }

        private String toStringRec(Node node) {
            if (node == null) {
                return "";
            }
            if (node.next == null) {
                return String.valueOf(node.value);
            }
            return node.value + ", " + toStringRec(node.next);
        }

        public String toString() {
            String s = "[";
            Node ref = head;
            while (ref != null) {
                s += ref.value;
                if (ref.next != null) {
                    s += ", ";
                }
                ref = ref.next;
            }
            s += "]";
            return s;
        }

        private int size() {
            int count = 0;
            Node ref = head;
            while (ref != null) {
                count++;
                ref = ref.next;
            }
            return count;
        }
    }
}
