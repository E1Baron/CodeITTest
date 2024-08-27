import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static boolean isEndProgramFlag = false;

    public static void main(String[] args) {

        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        while (isEndProgramFlag == false) {
            System.out.print("""
                    Добро пожаловать в КалькуляторМатик 3000 ! Наша программа может подсчитать что угодно!
                    Введите первое число, затем второе число, затем знак необходимой
                    арифметической операции (+-/*), после чего система выдаст результат вычислений
                    Введите первое число: 
                    """);

            a = inputDouble();
            System.out.print("""
                    Введите второе число: 
                    """);
            b = inputDouble();
            System.out.print("""
                    Введите знак необходимой операции (+-/*):
                    """);
            switch (inputOperationSign()) {
                case "+":
                    sum();
                    break;
                case "-":
                    diff();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    divide();
                    break;

            }
            System.out.println("Желаете продолжить ? y/n");
            switch (new Scanner(System.in).nextLine().toLowerCase()) {
                case "y":
                    break;
                case "n":
                    isEndProgramFlag = true;
                    break;
            }
        }
//        sum();      //Метод суммирования чисел
//        multiply(); //Метод умножения чисел
//        diff();     //Метод вычитания чисел
//        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    private static double inputDouble() {
        //todo дописать логику
        return new Scanner(System.in).nextDouble();
    }

    private static String inputOperationSign() {
        return new Scanner(System.in).nextLine();
    }


}
