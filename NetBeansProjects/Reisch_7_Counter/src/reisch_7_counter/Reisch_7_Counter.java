/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_counter;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            //What happens in the loop, will happen again and again until the loop exits
            if (isEven(i))
                counter += 1;
             {
                System.out.println( "We have " + i + " evens");
            }
             if (isOdd(i))
                 counter += 1;
             {
               System.out.println( "We have " + counter + " odds");  
             }
             if (isPrime(i))
                 counter += 1;
             {
                 System.out.println( "We have " + counter + " primes");
             }
        }
        System.out.println( "We have " + counter + " total evens");
        System.out.println( "We have " + counter + " total odds");
        System.out.println( "We have " + counter + "total primes");
        // TODO code application logic here
    }
    // a method is like a little program, something you want to repeat (commuticates with overall program)
    static boolean isEven (int somenumber) {
        return  (somenumber % 2 == 0);
    }
    static boolean isPrime (int somenumber) {
        int divisor = 0;
        for (int i = 2; i < somenumber; i++) {
                divisor += 1;  
        }
        return (divisor == 0);
    }
    static boolean isOdd (int somenumber) {
        return  (somenumber % 2 != 0);
    }
}
