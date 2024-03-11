public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он  достиг совершеннолетия.");
        } else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        //надеюсь задание понял правильно.
        System.out.println("\nЗадача 2");

        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки. Наулице " + temperature + "градусов");
        } else System.out.println("На улице холодно, нужно надеть шапку. На улице " + temperature + "градусов");

        System.out.println("\nЗадача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("скорость " + speed + "  придется оплатить штраф");
        } else System.out.println("скорость " + speed + "  можно ехать спокойно");

        System.out.println("\nЗадача 4");
        //Напишите программу, которая помогает определить,
        // в какое учреждение нужно отправить человека в зависимости от его возраста:
        int humanAge = 16;
        if (humanAge <= 1) {
            System.out.println("Если возраст человка равен " + humanAge + " то пусть сидит дома :)");
        } else if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад.");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ",то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в универститет");
        } else if (humanAge > 24) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу.");
        }
        // Добавил вариант 1 год и меньше. :)
        System.out.println("\nЗвдача 5");
        // Как правило, на аттракционах действуют ограничения для детей по возрасту:
        int childAge = 17;
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататся на атракционе только в сопровождении взрослого");
        } else if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататся на атраеционе");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататся без сопровождения взрослого");
        }
        System.out.println("\nЗадача 6");

        var carriageCapacity = 102;
        var seatPlace = 60;
        var passengers = 10;
        if (passengers > seatPlace && passengers < carriageCapacity) {
            System.out.println("В вагоне есть стоячие места, но свободные сидячие места отстсвуют");
        } else if (passengers < seatPlace) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (passengers > carriageCapacity) {
            System.out.println("В вагоне нету свободных мест");
        }

        System.out.println("\nЗадача 7");

        int one = 178787;
        int two = 278787;
        int three = 3787878;
        if (three > two && three > one) {
            System.out.println("Число " + three + ", больше чем число " + two + " и " + one);
        } else if (one > two && one > three) {
            System.out.println("Число " + one + " больше чем число " + two + " и число " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше чем число " + one + " и число " + three);
        }

    }
}