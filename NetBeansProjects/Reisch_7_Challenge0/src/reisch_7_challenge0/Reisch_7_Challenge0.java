/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_challenge0;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 500; i++) {
        if(isDivisiblebyeleven(i) & isDivisiblebyfive(i)){
            System.out.println("Animate this!");
        } else if(isDivisiblebyeleven(i) & isDivisiblebythree(i)){
            System.out.println("Herr Direktor");
        } else if(isDivisiblebyeleven(i) & isDivisiblebytwo(i)){
            System.out.println("Ninja");
        } else if(isDivisiblebytwo(i) & isDivisiblebythree(i) & isDivisiblebyfive(i)){
            System.out.println("Team Building");
        } else if(isDivisiblebythree(i) & isDivisiblebyfive(i)){
            System.out.println("Old School");
        } else if(isDivisiblebythree(i) & isDivisiblebytwo(i)){
            System.out.println("Chismé");
        } else if(isDivisiblebyfive(i)){
            System.out.println("Vidal");
        } else if(isDivisiblebythree(i)){
            System.out.println("Claughton");
        } else if(isDivisiblebytwo(i)){
            System.out.println("Davis");
        } else {
            System.out.println(i);
        }
        // TODO code application logic here
      

    }
      
    
    
}
    static boolean isDivisiblebytwo (int somenumber) {
          return (somenumber % 2 == 0);
          // if divisable by 2
    // divisable by 22 must make ninja
      }
        static boolean isDivisiblebyfive (int somenumber) {
            return (somenumber % 5 == 0);

    // if divisable by 5
    // divisable by 55 must make Animate this!
}
        static boolean isDivisiblebythree (int somenumber) {
            return (somenumber % 3 == 0);
            
    // if divisable by 3
    // divisable by 33 must make Herr Direktor
}
        // if diviable by 2 & 3 must make chismé
        // if divisable by 3 & 5 must make Old School
        // if divisable by 2, 3, & 5 must make Team Building
        static boolean isDivisiblebyeleven (int somenumber) {
            return (somenumber % 11 == 0);}
    
}
