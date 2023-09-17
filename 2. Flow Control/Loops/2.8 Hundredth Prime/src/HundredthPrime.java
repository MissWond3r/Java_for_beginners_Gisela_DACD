public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0; // To keep track of the number of prime numbers found
      int value = 2; // The first number to check for primality

      while (count < 100)
      {
         if (isPrime(value))
         {
            count++;
         }
         value++;
      }
      value--;
      System.out.println(value);
   }

   // Method to check if a number is prime
   public static boolean isPrime(int num)
   {
      if (num <= 1)
         return false;
      if (num <= 3)
         return true;

      if (num % 2 == 0 || num % 3 == 0)
         return false;

      for (int i = 5; i * i <= num; i += 6)
      {
         if (num % i == 0 || num % (i + 2) == 0)
            return false;
      }

      return true;
   }
}
