package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        byte a = 125;
        short b = 12000;
        int c = 1222333444;
        long d = 5111222333444555666L;
        float f = 0.1234567f;
        double j = 0.12345678910;
        char mail = 64;
        boolean positiveNumber = true;

        // Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxersWeight = boxer1 + boxer2;
        System.out.println("Total boxers weight " + boxersWeight + " kg");
        double differenceWeight = boxer2 - boxer1;
        System.out.println("Boxers weight difference " + differenceWeight + " kg");

        // Задача 3
        short banana = 5;
        short weightBanana = 80;
        int weightBananas = banana * weightBanana;
        short milk = 2;
        short weightPortionMilk = 105;
        int weightMilk = milk * weightPortionMilk;
        short iceCream = 2;
        short weight1iceCream = 100;
        int weightIceCream = iceCream * weight1iceCream;
        short egg = 4;
        short weight1egg =70;
        int weightEggs = egg * weight1egg;
        int breakfastWeight = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("Weight breakfast " + breakfastWeight + " gr");
        float kg = 1000f;
        float weightInKg = breakfastWeight / kg;
        System.out.println("Weight breakfast " + weightInKg + " kg");

        // Задача 4
        short loseWeightKg  = -7;
        short condition1 = -250;
        short condition2 = -500;
        float lost1dayC1 = condition1 / kg;
        float lost1dayC2 = condition2 / kg;
        short daysC1 = (short) (loseWeightKg / lost1dayC1);
        System.out.println("Weight loss under provided 1 " + daysC1 + " days");
        short daysC2 = (short) (loseWeightKg / lost1dayC2);
        System.out.println("Weight loss under provided 2 " + daysC2 + " days");
        short average = (short) ((daysC1 + daysC2) / 2);
        System.out.println("Average quantity " + average + " days");

        // Задача 5
        int mashaSalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        int increaseMasha = mashaSalary / 100 * 10;
        int mashaSalaryNew = mashaSalary + increaseMasha;
        System.out.println("Masha`s salary after the promotion " + mashaSalaryNew);
        int differenceMashaSalary = (mashaSalaryNew * 12) - (mashaSalary * 12);
        System.out.println("Masha`s yearly income increased by " + differenceMashaSalary );
        int increaseDen = denSalary / 100 *10;
        int denSalaryNew = denSalary + increaseDen;
        System.out.println("Den`s salary after the promotion " + denSalaryNew);
        int differenceDenSalary = (denSalaryNew * 12) - (denSalary * 12);
        System.out.println("Den`s yerly income increased by " + differenceDenSalary );
        int increaseKris = krisSalary / 100 * 10;
        int krisSalaryNew = krisSalary + increaseKris;
        System.out.println("Kristina`s salary after the promotion " + krisSalaryNew);
        int differenceKrisSalary = (krisSalaryNew * 12) - (krisSalary * 12);
        System.out.println("Kristina`s yearly income increased by " + differenceKrisSalary);
    }
}
