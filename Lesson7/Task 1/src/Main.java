import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени
        boolean isCanCook = false;

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("""
                Вас приветствует Эликсироматик, лучший автоматический смешиватель зелий !
                Наш автомат принимает следующие ингредиенты:
                Жабьи глаза
                Кости ворона
                Слезы вурдалака
                Пельмени\n
                Пожалуйста введите по списку то количество ингредиентов которые вы хотите использовать,
                для этого наберите нужное число и нажмите клавишу Enter
                После чего система рассчитает и покаже наименования зелий которые
                можно изготовить из введённых компонентов
                """);
        System.out.println("Введите количество жабьих глаз которое хотите использовать:");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество слёз вурдалака которое хотите использовать:");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество костей ворона которое хотите использовать:");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите количество пельменей которое хотите использовать:");
        dumplingsCount = new Scanner(System.in).nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить Эликсир зоркости !");
            isCanCook = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить Эликсир стойкости !");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить Эликсир скрытности !");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить ЗАПРЕТНЫЙ ЭЛИКСИР !");
            isCanCook = true;
        }
        if (isCanCook == false) {
            System.out.println("Недостаточно компонентов !");
        }
    }
}

