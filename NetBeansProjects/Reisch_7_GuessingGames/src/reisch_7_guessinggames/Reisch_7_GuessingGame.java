/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_guessinggames;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sreisch3829
 */
public class Reisch_7_GuessingGame {
    static String theirname;
    static int theirguess;
    static int randomnumber;
    static Random random;
    static boolean stopplay = false;
    static boolean playagain = false;
    static String theiranswer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int counter = 0;
        Scanner name = new Scanner(System.in);
        System.out.println("Let's play a game! :D");
        System.out.println("What's your name?");
        theirname = name.nextLine();
        Random random = new Random();
           randomnumber = random.nextInt(99)+1;
        while (!stopplay) {
        playthegame();
        // TODO code application logic here
    }
    }
       static void playthegame(){
           System.out.println("Hello " + theirname + " pick a number from 1-100!");
           Scanner guess = new Scanner(System.in);
           theirguess = guess.nextInt();
           for (int i = 0; i < 101; i++) {
           if (randomnumber == theirguess){
               System.out.println("You win!!");
               //System.out.println("You took " + counter + " tries.");
               System.out.println("Do you want to play again?");
               Scanner playagain = new Scanner(System.in);
               theiranswer = playagain.nextLine();
               if (theiranswer.contains("n")) {
               stopplay = true; 
               } else {
                   System.out.println("Haha! You don't get a choice!");
                   stopplay = false;
                   
                   //playthegame();
               }
           } else if (randomnumber < theirguess){
               //counter += 1;
               System.out.println("Too high! Try again!");
           } else {
               //counter += 1;
           System.out.println("Too low! Try again!");
       }
               
       }
       }
}


