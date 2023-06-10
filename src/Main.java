// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия");
            System.out.println();
        } else {
            System.out.println("Вам не исполнилось 18 лет, нужно подождать");
            System.out.println();
        }

        // Задача 2
        int airTemperature = 4;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градуса, нужно надеть шапку");
            System.out.println();
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
            System.out.println();
        }

        // Задача 3
        int speed = 61;
        if (speed > 60) {
            System.out.println("Скорость составляет " + speed + " км/ч, придется заплатить штраф");
            System.out.println();
        } else {
            System.out.println("Скорость составляет " + speed + " км/ч, можно ездить спокойно");
            System.out.println();
        }

        // Задача 4
        int age2 = 467891;
        boolean toddlerAge = age2 < 2;
        boolean kindergartenAge = age2 >=2 && age2 <=6;
        boolean schoolAge = age2 >=7 && age2 <=18;
        boolean universityAge = age2 >18 && age2 <24;
        boolean workingAge = age2 >=24 && age2 <=60;
        if (toddlerAge) {
            System.out.println("Возраст человека равен " + age2 + ", ему пора спать");
            System.out.println();
        }
        if (kindergartenAge) {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в детсад");
            System.out.println();
        }
        if (schoolAge) {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в школу");
            System.out.println();
        }
        if (universityAge) {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в университет");
            System.out.println();
        }
        if (workingAge) {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить на работу");
            System.out.println();
        } else {
            System.out.println("Возраст человека равен " + age2 + ", ему можно отдыхать");
            System.out.println();
        }

        //Задача 5
        int age3 = 13;
        if (age3 < 5) {
            System.out.println("Возраст равен " + age3 + " годам. Нельзя кататься на аттракционе");
            System.out.println();
        } else if (age3 >=5 && age3 < 14) {
            System.out.println("Возраст равен " + age3 + " годам. Можно кататься на аттракционе, но только в сопровождении взрослого");
            System.out.println();
        } else {
            System.out.println("Возраст равен " + age3 + " годам. Можно кататься на аттракционе");
            System.out.println();
        }

        //Задача 6
        int passengerNumber = 4;
        int seats = 60;
        int standingRoom = 42;
        int carriageCapacity = seats + standingRoom;
        if (passengerNumber >= carriageCapacity) {
            System.out.println("Вагон полностью забит");
            System.out.println();
        } else if (passengerNumber < seats) {
            System.out.println("В вагоне осталось " + (carriageCapacity - standingRoom - passengerNumber) + " сидячих мест и " + standingRoom + " стоячих места");
            System.out.println();
        } else {
            System.out.println("В вагоне осталось " + (standingRoom - (passengerNumber - seats)) + " стоячих места");
            System.out.println();
        }

        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(one);
            System.out.println();
        } else if (two <= three) {
            System.out.println(three);
            System.out.println();
        } else {
            System.out.println(two);
            System.out.println();
        }
    }
}