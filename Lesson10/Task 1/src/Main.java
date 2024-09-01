import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice();
            //todo использовать новый метод тут
            addBook(name, pageCount, bookPrice);
            printInfo();
        }
    }
    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") +
                " стр." + "\nСтоимость " + bookPrice + " руб\n";
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static double inputBookPrice() {
        System.out.println("Введите стоимость книги:");
        return new Scanner(System.in).nextDouble();
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
