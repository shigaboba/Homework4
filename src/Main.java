public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = -5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 15;
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 8;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("Если возраст человека равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int number = 79;
        boolean SeatsAvailable = number <= 60;
        boolean onlyStand = number > 60 && number <= 120;
        boolean noSpace = number > 120;
        if (SeatsAvailable) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (onlyStand) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (noSpace) {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 5;
        int two = -9;
        int three = 56;
        boolean oneIsBiggest = one > two && one > three;
        boolean twoIsBiggest = two > one && two > three;
        if (oneIsBiggest) {
            System.out.println("Первое число самое большое");
        }
        else if (twoIsBiggest) {
            System.out.println("Второе число самое большое");
        }
        else {
            System.out.println("Третье число самое большое");
        }
    }
}