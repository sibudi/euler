// http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/

class E3 {

   static boolean isPrime( long n ) {
    
      if ( n % 2 == 0 ) return false;
    
      for ( long i = 3 ; i * i <= n ; i += 2 )
         if ( n % i == 0 )
               return false;
    
      return true;
   }

   public static void main ( String[] args ) {

      final long startTime = System.currentTimeMillis();
      long endTime = 0;
      long x = 600851475143L; // 600851475143 jawaban: 6857

      boolean cekPrime = false;

      if (isPrime (x)) {

         System.out.println (x);
         endTime = System.currentTimeMillis();
         System.out.println(endTime - startTime);
      } else {

         long a = 1, 
            b = x;

         while (a <= x) {

            if (cekPrime) {
            
               if (isPrime (b))
                  break;

               cekPrime = false;
            }

            a ++;
            if (x % a == 0) {

               b = x / a;
               cekPrime = true;
            }
         }

         System.out.println (b);
         endTime = System.currentTimeMillis();
         System.out.println(endTime - startTime);
      }
   }
}