import java.util.Scanner;

/**
 * @author El Baron 15.07.2024
 */
public class Main {
    public static void main(String[] args) {
        /*
          Задание особой сложности *. Написать конвертер валют.
          Пользователь вводит рубли, а программа печатает значение в долларах и евро.
          Взять актуальный курс валют.
         */
        System.out.println("""
                Добро пожаловать в калькулятор валют Подсчётоматик 2000 !
                Введите значение в рублях и система рассчитает для вас
                эквивалентную сумму в долларах и евро
                1 доллар США стоит 87.74 рубля
                1 евро стоит 95.78 рублей""");
        Scanner sc = new Scanner(System.in);
        double rub = sc.nextDouble();
        double dollars = rub / 87.74;
        double euro = rub / 95.78;
        System.out.println(rub + " рублей по сегодняшнему курсу равны " + dollars + " долларов, " +
                "или " + euro + " евро");

    }
}
