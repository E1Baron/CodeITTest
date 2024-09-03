import java.util.Scanner;

/**
 * @author El Baron 03.09.2024
 */


public class PurityControl {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice();
            //addBook(name);
            //addBook(name, pageCount);
            //todo использовать новый метод тут
            addBook(name, pageCount, bookPrice);
            printInfo();
        }
    }


    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    private static double inputBookPrice() {
        System.out.println("Введите стоимость книги:");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.\n";
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + "Наименование книги: " + bookName + "\n" + "Количество страниц: " + (pageCount > 0 ? pageCount : "Неизвестно") +
                "\nСтоимость: " + (bookPrice > 0 ? bookPrice : " Неизвестно") + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
