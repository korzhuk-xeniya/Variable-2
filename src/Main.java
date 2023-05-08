public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

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
        float potsOnClass = whiteColorPots + brownColorPots;
        float numberOfClasses = totalPots / potsOnClass;
        float whiteFraction = whiteColorPots / potsOnClass;
        System.out.println("Доля белых банок - " + whiteFraction);
        float totalWhitePots = whiteFraction * totalPots;
        float totalBrownPots = totalPots - totalWhitePots;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePots + " банок белой краски и " + totalBrownPots + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte numberOfBananas = 5;// в штуках
        byte bananaWeight = 80;// в граммах
        short amountOfMilk = 200;// В милилитрах
        byte weightOf100mlMilk = 105;// масса 100 мл молока в граммах
        byte numberOfPlombir = 2; // в брикетах
        byte weightOfPlombir = 100; // масса 1 брикета в гаммах
        byte numberOfEggs = 4;
        byte weightOfEgg = 70; // масса 1 яица в граммах
        int weightOfBreakfast = numberOfBananas * bananaWeight + amountOfMilk / 100 * weightOf100mlMilk + numberOfPlombir * weightOfPlombir + numberOfEggs * weightOfEgg; // масса завтрака в граммах
        float weightOfBreakfastInKg = weightOfBreakfast * 1f / 1000; // масса завтрака в килограммах
        System.out.println("Вес спортзавтрак составляет " + weightOfBreakfast + " грамм = " + weightOfBreakfastInKg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte loseWeightKg = 7; // масса, которую необходимо сбросить в кг
        int loseWeightG = loseWeightKg * 1000; // масса, которую необходимо сбросить в г
        short minDayLoseWeight = 250; // минимальная потеря массы в день в г
        short maxDayLoseWeight = 500; // максимальная потеря массы в день в г
        int minDays = loseWeightG / minDayLoseWeight; //количество дней при минимальной потере массы
        System.out.println("Спортсмену потребуется " + minDays + " дней, если он будет терять по " + minDayLoseWeight + " грамм в день");
        int maxDays = loseWeightG / maxDayLoseWeight; // количество дней при максимальной потере веса
        System.out.println("Спортсмену потребуется " + maxDays + " дней, если он будет терять по " + maxDayLoseWeight + " грамм в день");
        int middleDays = (minDays + maxDays) / 2; // среднее количество дней
        System.out.println("Спортсмену в среднем для похудения может потребоваться " + middleDays + " день");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760; //рублей в месяц
        int denisSalary = 83690;//рублей в месяц
        int kristinaSalary = 76230;//рублей в месяц
        int previousMashaIncome = mashaSalary * 12; // годовой доход Маши до повышения
        int previousDenisIncome = denisSalary * 12;// годовой доход Дениса до повышения
        int previousKristinaIncome = kristinaSalary * 12; // годовой доход Кристины до повышения
        double newMashaSalary = mashaSalary + mashaSalary * 0.1;
        double newDenisSalary = denisSalary + denisSalary * 0.1;
        double newKristinaSalary = kristinaSalary + kristinaSalary * 0.1;
        double newMashaIncome = newMashaSalary * 12; // годовой доход Маши после повышения
        double newDenisIncome = newDenisSalary * 12;// годовой доход Дениса после повышения
        double newKristinaIncome = newKristinaSalary * 12; // годовой доход Кристины после повышения
        double differenceMashaIncome = newMashaIncome - previousMashaIncome;
        double differenceDenisIncome = newDenisIncome - previousDenisIncome;
        double differenceKristinaIncome = newKristinaIncome - previousKristinaIncome;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + differenceMashaIncome + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + differenceDenisIncome + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + differenceKristinaIncome + " рублей");
    }

}