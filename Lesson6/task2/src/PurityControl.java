import java.util.Scanner;

/**
 * @author El Baron 05.08.2024
 */
public class PurityControl {
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

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        //todo дописать логику программы ниже
        /*
        Логика для вычисления наибольшего, среднего и наименьшего из введённых чисел
        написанная с применением if
         */
        if (first > second && first > third){
            greatest = first;
        } else if (second > first && second > third) {
            greatest = second;
        } else if (third > first && third > second) {
            greatest = third;
        }

        if ( first < second && first < third){
            smallest = first;
        } else if (second < first && second < third) {
            smallest = second;
        } else if (third < first && third < second) {
            smallest = third;

        }
        if ((first > second && first < third) || (first < second && first > third)){
            average = first;
        }
        if ((second > third && second < first) || (second < third && second > first)){
            average = second;
        }
        if ((third > first && third < second) && (third > first && third < second)){
            average = third;
        }

        //todo
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
