import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int weightMiddleSum = 0;
        int goodWeightCounter = 0;
        int[] testArrayPeopleWeight = new int[10];
        for (int i = 0; i < testArrayPeopleWeight.length; i++){
            testArrayPeopleWeight[i] = new Random().nextInt(40,101);
            weightMiddleSum = weightMiddleSum + testArrayPeopleWeight[i];
            if (testArrayPeopleWeight[i] >= 60 && testArrayPeopleWeight[i] <= 80){
                goodWeightCounter++;
            }
        }
        System.out.print("Числа массива: ");
        for (int i : testArrayPeopleWeight){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Средний вес людей равен: " + weightMiddleSum / testArrayPeopleWeight.length);
        System.out.println("Количество людей с хорошим средним весом: " + goodWeightCounter);


    }
}
