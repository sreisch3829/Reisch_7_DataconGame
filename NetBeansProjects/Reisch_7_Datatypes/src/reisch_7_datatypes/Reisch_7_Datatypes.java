/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_datatypes;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_Datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // space for comments
        //used to explain code
        //code explanation is an expectation
        int i = 1;
        float a = 2.5f;
        double b = 3.87;
        short c = 16;
        char d1 = ';';
        char d2 = 'a';
        char d3 = 42;
        char d4 = 145; 
        String e = d4+"";
        String e1 = "Amanda is the best";
        boolean f = true;
        boolean g = i % 2 == 0;
        // + adds two numbers and more
        // - subtracts two numbers and more
        // * multiplies two numbers and more
        // / divides two numbers and more
        // % also known as modulo, shows remainder
        
        System.out.println(i + " an integer");
        System.out.println(a + " a float");
        System.out.println(b + " a double");
        System.out.println(c + " a short");
        System.out.println(d1 + " a char");
        System.out.println(d2 + " a char");
        System.out.println(d3 + " a char");
        System.out.println(e + " a String");
        System.out.println(e1 + " a String");
        System.out.println(f + " a boolean");
        System.out.println(g + " a boolean");
        i = 22;
        a = 0;
        e = "ninja";
        System.out.println(e + i + " a string plus an integer");
        
        for (i = 0; i < 10; i++) { 
            if ((i == 3) & (i == 5))
            System.out.println( i + " is a prime");
        } else {
                System.out.println( i + " is a composite");
                }
        
        for (i = 10; i < 100; i++) {
            /*if is a conditional (flow) statement. If a condition is true then the command will be executed */
            if (( i % 3 != 0) & (i % 2 != 0) & ( i % 5 !=0) & (i % 7 != 0)) {
            System.out.println( i + " is prime");
        } else {
                System.out.println( i + " is composite");
                
          
        }
        }
        
       //System.out.println(i + a + " an integer / " + "plus a float ");
//        for(i = -123;i < 123; i++) {
//            System.out.println((char) i);
//      
//        }
        //for(i = -123;i < 123; i++) {
            //System.out.println(i % 3 == 0);
        }
        /* % checks for the remainder
        i % 2 checks if a number is even or odd
        */
 
        
    }
    

