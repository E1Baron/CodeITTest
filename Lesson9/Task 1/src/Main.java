import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static String inputOperationSign;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        inputDouble();
        switch (inputOperationSign) {
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
            case "Y":

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
        System.out.println("""
                Добро пожаловать в КалькулятоМатик 3000 ! Наша программа может подсчитать что угодно!
                Введите первое число, затем второе число, затем знак необходимой
                арифметической операции (+-/*), после чего система выдаст результат вычислений
                """);
        System.out.println("""
                Введите первое число:
                """);
        a = new Scanner(System.in).nextDouble();
        System.out.println("""
                Введите второе число:
                """);
        b = new Scanner(System.in).nextDouble();
        System.out.print("""
                Введите знак необходимой арифметической операции:
                """);
        inputOperationSign = new Scanner(System.in).nextLine();
        return 0;
    }

}
