package Training;

import java.util.Scanner;



public class CalculateSingleDigitValuesUserEntered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements separated by spaces: ");

        String inputLine = scanner.nextLine();
        String[] inputValues = inputLine.split(" ");

        int[] array = new int[inputValues.length];

        // Convert input values to integers and populate the array
        for (int i = 0; i < inputValues.length; i++) {
            try {
                array[i] = Integer.parseInt(inputValues[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers separated by spaces.");
                return;
            }
        }

        int maxDigitSum = -1;
        int indexWithMaxDigitSum = -1;

        for (int i = 0; i < array.length; i++) {
            int digitSum = calculateDigitSum(array[i]);

            if (digitSum > maxDigitSum) {
                maxDigitSum = digitSum;
                indexWithMaxDigitSum = i;
            }
        }

        if (indexWithMaxDigitSum != -1) {
            int originalNumber = array[indexWithMaxDigitSum];
            System.out.println("Index " + indexWithMaxDigitSum + " has the highest digit sum: " + maxDigitSum
                    + " for the number " + originalNumber);
        } else {
            System.out.println("No valid elements in the array.");
        }

        scanner.close();
    }

    // Function to calculate the sum of digits of a number
    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

