package Training;

public class CalculateSingleDigitValues {
    public static void main(String[] args) {
        int[] array = {123, 45, 789, 12, 456};

        for (int number : array) {
            int result = calculateSingleDigitValue(number);
            System.out.println("Value at index: " + number + " is " + result);
        }
    }

    // Function to calculate the sum of digits until a single digit is obtained
    public static int calculateSingleDigitValue(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

