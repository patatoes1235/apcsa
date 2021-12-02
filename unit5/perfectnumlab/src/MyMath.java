public class MyMath
{
  /**
   * Returns true if num is a prime; otherwise returns false
   */
  public static boolean isPrime(int num)
  {
    if (num <= 1)
      return false;

    int m = 2;

    while (m * m <= num)
    {
      if (num % m == 0)
        return false;
      m++;
    }

    return true;
  }

   /**
   * Returns true if num is a perfect number, false otherwise
   */
  public static boolean isPerfect(int num)
  {
    int sum = 0;
    for (int i =2; i<=(int)Math.sqrt(num); i++) {
      if (num % i ==0) {
        sum += i + num/i;
      }
    }
    return sum+1 == num;
  }

  /**
   * Prints the first 4 perfect numbers
   */
  public static void printFourPerfectNums()
  {
    int i = 0;
    int test = 2;
    while (i<4) {
      if (isPerfect(test)) {
        System.out.println(test);
        i++;
      }
      test++;
    }


  }

  /**
   * Prints the first 6 Mersenne primes and even perfect numbers
   */
  public static void printSixEvenPerfectNums()
  {
    int test = 1;
    int i =0;
    while (i< 6) {
      if (isPrime((int)Math.pow(2, n) - 1)) {
        i++;
        long perfectNum =
        for (int j =2; j<=(int)Math.sqrt(test); i++) {
          if (test % j ==0) {
            test += j + test/j;
          }
        }
      }
      test++;
    }

  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    printFourPerfectNums();
    printSixEvenPerfectNums();
  }
}
