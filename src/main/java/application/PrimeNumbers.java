package application;

public class PrimeNumbers {
    private static int[] arr = new int[1];

    /**
     * This method calculates the first x prime numbers.
     * Example: amountOfPrimeNumbers = 3
     * Return: [2, 3, 5]
     *
     * @param amountOfPrimeNumbers
     * @return an array containing only the calculated prime numbers
     */
    public static int[] getPrimeNumbers(int amountOfPrimeNumbers) {
        boolean primeCheck = true;
        int primeCount = 0;
        if (amountOfPrimeNumbers >= 2) {
            arr[0] = 2;
            primeCount++;
        }

        for (int i = 3; primeCount < amountOfPrimeNumbers; i += 2) {
            primeCheck = isPrime(i);
            if (primeCount >= arr.length) {
                increaseArray();
            }
            if (primeCheck) {
                primeCount++;
                arr[primeCount - 1] = i;
            }
            primeCheck = true;
        }
        stripArray(primeCount);
        return arr;
    }

    private static boolean isPrime(int number) {
        for (int j = 3; j < number; j += 2) {
            if (number == 3) {
                break;
            }
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static void increaseArray() {
        int[] newArray = new int[2 * arr.length];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        arr = newArray;
    }

    private static void stripArray(int length) {
        int[] strippedArray = new int[length];
        for (int i = 0; i < length; i++) {
            strippedArray[i] = arr[i];
        }
        arr = strippedArray;
    }
}