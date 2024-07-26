import java.util.Scanner;

/**
 * @author El Baron 15.07.2024
 */
public class Main {
    public static void main(String[] args) {
        /*
        Написать программу, в которую пользователь будет вводить температуру по Цельсию,
        а программа должна преобразить ее в температуру по фаренгейту.
        Формула преобразования: (F = C * 1.8 + 32).
         */
        System.out.println("Введите температуру по Цельсию");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f =  ((c * 1.8) + 32);
        System.out.println("Температура по Фаренгейту: " + f);
    }
}
