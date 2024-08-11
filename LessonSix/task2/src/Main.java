import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Перенос в другой проект 11 августа
         */
        System.out.println("\t\t\t***Программа определения веса товаров***\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();
        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();
        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        //todo дописать логику программы ниже.

        double[] testArray = new double[]{first, second, third};
        Arrays.sort(testArray);
        double greatest = testArray[2];
        double average = testArray[1];
        double smallest = testArray[0];
        //todo
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}

