import java.util.Scanner;

public class Main {
    public static int scanInput;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        numero();
        evenOrNot();
    }
    public static void numero(){
        System.out.print("""
                Добро пожаловать в программу Определитель Чётности ! Введите любое число, и
                наша программа определит чётное оно или нет !
                Пожалуйста, введите число:
                """);
         scanInput = new Scanner(System.in).nextInt();
    }
    public static void evenOrNot(){
        System.out.println(scanInput % 2 == 0);
    }
}
