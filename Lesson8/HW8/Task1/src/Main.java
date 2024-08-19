public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int [] testArray = new int[]{10,12,13,34,55,33,49,59,14,79};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = testArray.length-1; i >= 0; i--){
            System.out.print(testArray[i] + " ");
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo



    }
}
