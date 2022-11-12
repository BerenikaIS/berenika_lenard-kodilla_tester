import java.util.Random;

import static java.lang.System.out;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();
        int min = 0;
        int max = 30;
        int sum = 0;
        while (sum <= 5000) {
            int randomNumber = random.nextInt(31);
            sum = sum + randomNumber;
            System.out.println(sum);

        int maximum = 30;
        int minimum = 0;
        int number = 0;
        while (number > maximum) {
            int highestNumber = Integer.MIN_VALUE;
            number = number + highestNumber;
            System.out.println(number);

        while (number > minimum) {
            int lowestNumber = Integer.MAX_VALUE;
            number = number + lowestNumber;
            System.out.println(number);
        }
        }
        }
    }
}
