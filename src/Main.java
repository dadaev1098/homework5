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
    public static void task1() {
        System.out.println("task1");

        int age = 17;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");

        }
    }

    public static void task2(){
        System.out.println("task2");
        int temperature = 5;
        if (temperature>6) {
            System.out.println("нужно надеть шапку");
        }else {
            System.out.println("не нужно надеть");
        }
    }
    public static void task3() {
        System.out.println("task3");
        int speed = 220;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придеться заплатить щтраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("task4");
        int age = 3;
        if (age >= 2 && age <= 6) {
            System.out.println("детский сад ");
        } else if (age > 6 && age <= 18) {
            System.out.println("то в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("то универститет");
        }else if (age > 26){
            System.out.println("работа");
        }

        }
    public static void task5() {
        System.out.println("task5");
        int age = 10;
        if (age<5) {
            System.out.println("не может кататься на аттракционе");
        }else if (age >= 5 && age < 14) {
            System.out.println(" он может кататься только в сопровождении взрослого");
        }else if (age >= 14){
            System.out.println("он может кататься без сопровождения взрослого");
        }
        
    }
    public static void task6(){
        System.out.println("task6");
        int capacity = 120;
        int seatPlace = 60;
        int peopleNumber  = 70;

        if (peopleNumber == capacity) {
            System.out.println("вагон полностью забит");
        }else if (peopleNumber < seatPlace) {
            System.out.println("есть сидячее место");
        }else {
            System.out.println("есть стоячее место");

        }



    }
    public static void task7(){
        System.out.println("task7");
        int one = 10, two = 20 , tree = 30;
        if (one > two && one > tree ) {
            System.out.println(one);
        }else {
            System.out.println(tree);

        }

    }

    }


















