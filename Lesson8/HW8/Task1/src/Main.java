import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] testArray = new int[]{10, 12, 13, 34, 55, 33, 49, 59, 14, 79};
        System.out.println("Изначальный массив: " + Arrays.toString(testArray));
//
//        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
//        //todo
//        for (int i = 0; i < testArray.length; i++) {
//            System.out.print(testArray[i] + " ");
//        }
//        System.out.println();
//        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
//        //todo
//        for (int i = testArray.length - 1; i >= 0; i--) {
//            System.out.print(testArray[i] + " ");
//        }
//        System.out.println();
//
//        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
//        //todo
////        int backUp = 0;
////        backUp = testArray[0];
////        testArray[0] = testArray[10];
////        testArray[10] = backUp;
        int[] testArrayRevers = new int[testArray.length];
        int j = 0;
        for (int i = testArray.length - 1; i >= 0; i--) {
            testArrayRevers[j] = testArray[i];
            j++;
        }
        System.out.println("Реверс изначального массива:  " + Arrays.toString(testArrayRevers));
        System.arraycopy(testArrayRevers, 0, testArray, 0, testArray.length);
        System.out.println("Элементы изначального массива подвергли реверсу" +
                " и записали в изначальный массив \n" + Arrays.toString(testArray));
    }

}

