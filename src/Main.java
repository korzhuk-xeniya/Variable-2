public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 50000;
        byte b = 127;
        short c = 32000;
        long l = 3000000000L;
        float f = 3.5645F;
        double d = -26.2356896;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12F;
        long d = 987678965549L;
        float c = 2.786F;
        short k = 569;
        short p = -159;
        int x = 27897;
        byte s = 67;
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(k);
        System.out.println(p);
        System.out.println(x);
        System.out.println(s);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short totalPaper = 480;
        int sheetsPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte time1 = 20;//в минутах
        int productivity = time1 / minutes * bottles;
        System.out.println("За " + time1 + " минут машина произвела " + productivity + " штук бутылок");
        byte time2 = 1;//в сутках
        productivity = time2 * 24 * 60 / minutes * bottles;
        System.out.println("За " + time2 + " сутки машина произвела " + productivity + " штук бутылок");
        byte time3 = 3;//в днях
        productivity = time3 * 24 * 60 / minutes * bottles;
        System.out.println("За " + time3 + " дня машина произвела " + productivity + " штук бутылок");
        byte time4= 1;//в месяцах
        productivity = time4 * 30 * 24 * 60 /  minutes * bottles;
        System.out.println("За " + time2 + " месяц машина произвела " + productivity + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPots = 120;
        byte whiteColorPots = 2;
        byte brownColorPots = 4;
        int potsOnClass = whiteColorPots + brownColorPots;


    }
}