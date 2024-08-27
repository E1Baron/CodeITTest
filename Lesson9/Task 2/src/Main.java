import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        numero();
    }
    public static void numero(){
        System.out.print("""
                Добро пожаловать в программу Определитель Чётности ! Введите любое число, и 
                наша программа определит чётное оно или нет !
                Пожалуйста, введите число:
                """);
        int a = new Scanner(System.in).nextInt();
        if (a % 2 == 0){
            System.out.println(true);
        }
        else if (a % 2 != 0){
            System.out.println(false);
        }

    }
}
