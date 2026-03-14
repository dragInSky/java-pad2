package lr2;

public class Task8 {

    static class Animal {
        protected String name;
        protected int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sound() {
            System.out.println(name + " издает звук");
        }
    }

    static class Dog extends Animal {
        private String breed;

        Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        public void sound() {
            System.out.println(name + " лает");
        }

        public void info() {
            System.out.println("Порода: " + breed);
        }
    }

    static class Cat extends Animal {
        private String food;

        Cat(String name, int age, String food) {
            super(name, age);
            this.food = food;
        }

        public void sound() {
            System.out.println(name + " мяукает");
        }

        public void feed() {
            System.out.println(name + " ест " + food);
        }
    }

    static class Bird extends Animal {
        private boolean canFly;

        Bird(String name, int age, boolean canFly) {
            super(name, age);
            this.canFly = canFly;
        }

        public void sound() {
            System.out.println(name + " щебечет");
        }

        public void fly() {
            if (canFly) {
                System.out.println(name + " летит");
            } else {
                System.out.println(name + " не умеет летать");
            }
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бим", 3, "овчарка");
        Cat cat = new Cat("Мурка", 2, "корм");
        Bird bird = new Bird("Кеша", 1, true);

        dog.sound();
        dog.info();
        cat.sound();
        cat.feed();
        bird.sound();
        bird.fly();
    }
}
