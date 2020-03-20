public class PrimeNumberMethod {
  public static void main(String[] args) {
    System.out.println("The first 50 prime numbers are \n");
    printPrimeNumbers(50);
  }

  public static void printPrimeNumbers(int numberOfPrimes) {
    final int  NUMBER_OF_PRIMES_PER_LINE = 10;
    int count = 0;
    int number = 2;

    // Repeatedly find prime numbers
    while (count < numberOfPrimes) {
      // Print the prime numbers and increase the count
      if (isPrime(number)) {
        count++; // Increase the count

        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Print the number and advanced to the new line
          System.out.printf("%-5s\n", number);
        }
        else {
          System.out.printf("%-5s", number);
        }
      }

      // Check whether the next number is prime
      number++;
    }
  }

  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      if (number % divisor == 0) {
        return false;
      }
    }

    return true;
  }
}
