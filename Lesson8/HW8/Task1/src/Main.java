import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo

        int[] testArray = new int[]{10, 12, 13, 34, 55, 33, 49, 59, 14, 79};
        System.out.println();

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        System.out.println("Распечатать все значения массива начиная с 0 до последнего индексов");
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = testArray.length - 1; i >= 0; i--) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        System.out.println("Распечатать все значения массива с конца " +
                "(начиная с последнего до 0 индексов)");
        System.out.println();

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        int[] testArrayRevers = new int[testArray.length];
        int j = 0;
        for (int i = testArray.length - 1; i >= 0; i--) {
            testArrayRevers[j] = testArray[i];
            j++;
        }
        System.out.println("Реверс изначального массива:  " + Arrays.toString(testArrayRevers));
        System.out.println();
        System.arraycopy(testArrayRevers, 0, testArray, 0, testArray.length);
        System.out.println("Элементы изначального массива подвергли реверсу" +
                " и записали в изначальный массив \n" + Arrays.toString(testArray));
        System.out.println();
        //todo
        //Ниже решение задачи особой сложности - так как НУЖНО было её решить, без фокусов

        int[] mass2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Массив 2 в изначальном виде");
        for ( int i : mass2){
            System.out.print(i + " ");
        }
        System.out.println();
        int changer = 0;
        for (int i = 0; i < mass2.length / 2; i++) {
            changer = mass2[i];
            mass2[i] = mass2[mass2.length - (1 + i)];
            mass2[mass2.length - (1 + i)] = changer;
        }
        System.out.println();
        System.out.println("Наконец развёрнутый Массив 2");
        for(int i : mass2){
            System.out.print(i + " ");
        }


    }

}

