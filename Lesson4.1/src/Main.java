import java.util.Scanner;

/**
 * @author El Baron 22.07.2024
 */
public class Main {
    public static void main(String[] args) {
//        int barsic = 5;
//        int murzic = 7;
//        int usatPolosat = 9;
//        int smallTiger = 11;
//        int predator_cat = 13;
//        String moreCatz = "Catz!";
//        char a = 'a';
//        char b = 'b';
//        Integer cat = 10;
//        double c = 10.2;
//        System.out.println(barsic);
//        System.out.println(usatPolosat);
//        System.out.println(smallTiger);
//        System.out.println(predator_cat);
//        System.out.println(moreCatz);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(cat);
//        System.out.println(c);
        System.out.println("Введите первое число:");
        double firstNum = new Scanner(System.in).nextDouble();
        System.out.println("Введите необходимый оператор(+ - / *)");
        String operator = new Scanner(System.in).nextLine();
        System.out.println("Введите второе число:");
        double secondNum = new Scanner(System.in).nextDouble();
        double answer;
        switch (operator) {
            case "+":
                answer = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + answer);
                break;
            case "-":
                answer = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + answer);
                break;
            case "/":
                answer = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + answer);
                break;
            case "*":
                answer = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + answer);
                break;
            default:
                System.out.println("Ошибка ввода оператора");
                break;

        }

    }
}
