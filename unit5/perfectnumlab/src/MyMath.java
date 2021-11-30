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
    for (int i =1; i<=(int)Math.sqrt(num); i++) {
      if (num % i ==0) {
        sum += num/i;
      }

    }
  }

  /**
   * Prints the first 4 perfect numbers
   */
  public static void printFourPerfectNums()
  {



  }

  /**
   * Prints the first 6 Mersenne primes and even perfect numbers
   */
  public static void printSixEvenPerfectNums()
  {


  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    printFourPerfectNums();
    printSixEvenPerfectNums();
  }
}
