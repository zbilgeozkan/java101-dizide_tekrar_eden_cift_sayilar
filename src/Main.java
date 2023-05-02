
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {21, 31, 43, 24, 34, 22, 24, 54, 76, -54, 56, 34, 0, 234};
        System.out.println("Dizi: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sıralı Dizi: " + Arrays.toString(numbers));

        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] == numbers[i + 1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.print(evenNumber + " ");
                }
            }
        }
        
        if (counter == 0) {
            System.out.println("Kurala uygun çift sayı yok. ");
        }
    }
}