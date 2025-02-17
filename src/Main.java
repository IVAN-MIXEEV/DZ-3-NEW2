public class Main {
    public static void main(String[] args) {
//№1
        int numberOne = 6;
        byte numberTwo = 66;
        short numberThree = 666;
        long numberFour = 6666;
        float numberFive = 6.6666f;
        double numberSix = 6.66666;
        System.out.println("Значение переменной numberOne с типом int равно " + numberOne);
        System.out.println("Значение переменной numberTwo с типом byte равно " + numberTwo);
        System.out.println("Значение переменной numberThree с типом short равно " + numberThree);
        System.out.println("Значение переменной numberFour с типом long равно " + numberFour);
        System.out.println("Значение переменной numberFive с типом float равно " + numberFive);
        System.out.println("Значение переменной numberSix с типом double равно " + numberSix);
//№2
        float a = (float) 27.12;
        long b = 987678965549L;
        float c = (float) 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
//№3
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        short paperOne = 480;
        byte totalStudents = (byte) (teacherLP + teacherAS + teacherEA);
        byte sheetsForEach = (byte) (paperOne / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги.");
//№4
        int oneMinutesBottle = 16 / 2;
        int oneDay = 24 * 60;
        int threeDay = oneDay * 3;
        int oneMonth = oneDay * 30;
        int twentyMinutes = oneMinutesBottle * 20;
        int oneDayBottle = oneMinutesBottle * oneDay;
        int threeDaysBottle = oneMinutesBottle * threeDay;
        int oneMonthBottle = oneMinutesBottle * oneMonth;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + oneDayBottle + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDaysBottle + " штук бутылок.");
        System.out.println("За месяц машина произвела " + oneMonthBottle + " штук бутылок.");
//№5
        int totalCansOfPaint = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int totalPaintOneClass = whitePaintOneClass + brownPaintOneClass;
        int totalClasses = totalCansOfPaint / totalPaintOneClass;
        int totalWhitePoint = whitePaintOneClass * totalClasses;
        int totalBrownPoint = brownPaintOneClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePoint + " банок белой краски и " + totalBrownPoint + " банок коричневой краски");
//№6
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfast = banana + milk + iceCream + eggs;
        float breakfastKG = (float) breakfast / 1000;
        System.out.println(+breakfast + "грамм");
        System.out.println(+breakfastKG + " килограмм");
//№7
        int weight = 7 * 1000;
        int weightMinus250 = weight / 250;
        int weightMinus500 = weight / 500;
        int average = (weightMinus250 + weightMinus500) / 2;
        System.out.println("Для похудения на 7 килограмм по 250 грамм в день, спортсмену потребуется " + weightMinus250 + " дней");
        System.out.println("Для похудения на 7 килограмм по 500 грамм в день, спортсмену потребуется " + weightMinus500 + " дней");
        System.out.println("В среднем спортсмену для похудения на 7 килограмм потребуется " + average + " день");
//№8
        int masha = (int) (67760 * 1.1);
        int denis = (int) (83690 * 1.1);
        int kristina = (int) (76230 * 1.1);
        System.out.println("Маша теперь получает " + masha + " рублей в месяц.");
        System.out.println("Денис теперь получает " + denis + " рублей в месяц. ");
        System.out.println("Кристина теперь получает " + kristina + " рублей в месяц. ");
        int mashaYear = 67760 * 12;
        int denisYear = 83690 * 12;
        int kristinaYear = 76230 * 12;
        int mashaYearNew = (int) (mashaYear * 1.1);
        int denisYearNew = (int) (denisYear * 1.1);
        int kristinaYearNew = (int) (kristinaYear * 1.1);
        int defferenceMashaYear = mashaYearNew - mashaYear;
        int defferenceDenisYear = denisYearNew - denisYear;
        int defferenceKristinaYear = kristinaYearNew - kristinaYear;
        System.out.println("Маша теперь получает " + mashaYearNew + " рублей в год.Годовой доход вырос на " + defferenceMashaYear + " рублей. ");
        System.out.println("Денис теперь получает " + denisYearNew + " рублей в год.Годовой доход вырос на " + defferenceDenisYear + " рублей. ");
        System.out.println("Кристина теперь получает " + kristinaYearNew + " рублей в год.Годовой доход вырос на " + defferenceKristinaYear + " рублей. ");
    }
}