// Java1907.java
// This program demonstrates the <Sum> method.
// It also demonstrates recursion with return methods.


public class Java1907
{

   public static void main(String args[])
   {
      System.out.println("CALLING ITERATIVE SUM METHOD");
      System.out.println("1 + 2 + 3 + 4 + 5 + 6   =  " + sum1(6));
      System.out.println("\n\nCALLING RECURSIVE SUM METHOD");
      System.out.println("1 + 2 + ... + 99 + 100  =  " + sum2(100));
      System.out.println("\n\nEXECUTION TERMINATED");
   }

   /***** ITERATIVE SUM *************************************************/
   public static int sum1(int n)
   {
      int sum = 0;
      for (int k = 1; k <= n; k++)
         sum += k;
      return sum;
   }

   /***** RECURSIVE SUM **************************************************/
   public static int sum2(int n)
   {
      if (n == 0)
         return 0;
      else
         return n + sum2(n-1);
   }

}
