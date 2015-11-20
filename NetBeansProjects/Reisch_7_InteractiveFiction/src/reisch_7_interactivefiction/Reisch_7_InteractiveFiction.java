/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reisch_7_interactivefiction;

import java.util.Scanner;

/**
 *
 * @author sreisch3829
 */
public class Reisch_7_InteractiveFiction {

    static int final_answer;
    static String theirname;
    static String first_answer;
    static String second_answer;
    static String lock_or_box;
    static String chemical_or_letter;
    static String press_or_not;
    static String take_key;
    static String choose_door;
    static String playagain;
    static boolean anew = false;
    static boolean currentlyfree = false;
    static boolean freeagain = false;
    static boolean keys = false;
    //#while - anew makes it so that the player can go back to the room with ease- and currentlyfree tells me
    //if the player has solved the puzzle - freeagain is when you solve the second puzzle - keys is true when the player has
    //the keys in order to unlock the doors
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        //attempts();
        end();
        part2();
    } 
    
    public static void attempts() {
        //method2() - I attempted to make a counter (it did not succeed)
        //int counter = 0;
        //System.out.println("You took " + counter + "tries!");
    }
    
    public static void end(){
        //method3() - this allows the player to quit the game early
        System.out.println("I'd like to play with you some more- if you could spare the time?");
        Scanner choice3 = new Scanner(System.in);
        playagain = choice3.nextLine().toLowerCase();
        if (playagain.contains("y")) {
        System.out.println("Okay, let's play more!!");
        currentlyfree = true;
        anew = true;
        freeagain = false;
        } else {
        System.out.println("Okay, bye!");
        freeagain = true;
        currentlyfree = true;
        anew = true;
                    
        }
    }
    public static void part2() {
        //method4() - this is the second part of the game- the second puzzle
        while (!freeagain) {
            System.out.println("In the next room, you see some engravings on a wall, and two doors on the right and left.");
        Scanner choice4 = new Scanner(System.in);
        second_answer = choice4.nextLine().toLowerCase();
        if (second_answer.contains("wall")) {
            //doors correlate to the keys
            System.out.println("Looking at the engravings on the walls, you recognize them as various letters in the Greek alphabet.");
            System.out.println("It seems like there is a picture of the following: ρυν ορ ςταυ. There also seems to be two keys on a small podium.");
            //the wall says run or stay- the keys correlate directly to the choice and the correct choice is to run and leave
            //this is because otherwise you will stay there forever
            Scanner choice5 = new Scanner(System.in);
            press_or_not = choice5.nextLine().toLowerCase();
            if (press_or_not.contains("key")) {
                System.out.println("One key is black with and engraving of ρυν while the other is white with ςταυ.");
                System.out.println("Take keys?");
                Scanner choice6 = new Scanner(System.in);
                take_key = choice6.nextLine().toLowerCase();
                if (take_key.contains("y")){
                    System.out.println("You take up both keys.");
                    keys = true;
                    //#forthewin - in order to win the game, you have to pick up the keys
                } else if (take_key.contains("n")){
                    System.out.println("You leave the keys where they are.");
                } else {
                    System.out.println("You look at the table for a while, =and then go back to the beginning of the room.");
                }
            } else {
                System.out.println("Look up the GREEK ALPHABET. I know you can do better than that, " + theirname + ".");
            }
        } else if (second_answer.contains("door")) {
            System.out.println("One door is black while the other is white.");
            System.out.println("When you try the doors they are locked.");
            System.out.println("You go back to the center of the room.");
            while (keys) {
                System.out.println("Having the keys, you face the doors.");
                System.out.println("Which door do you choose?");
                Scanner choice7 = new Scanner(System.in);
                choose_door = choice7.nextLine().toLowerCase();
                if (choose_door.contains("black")){
                    System.out.println("You approach the black door. You take out the black key, and you open the door.");
                    System.out.println("The door leads you outside. But I can't see you....You should probably leave.");
                    //#win - you win the game with the black door
                    freeagain = true;
                    keys = false;
                    } else if (choose_door.contains("white")){
                            System.out.println("You approach the white door. You take out the white key, and open the door.");
                            System.out.println("The door leads back to the this room again. You're not sure how.");
                            //#forthelose - you lose if you chose the white door
                            //#lose - choosing the white door makes you lose
            } else {
                        System.out.println("You sit and stare for a while.");
                        
                    }
            }
        } else {
            System.out.println("Try to look at the WALL. I know you can do better than that!");
                    }
        }
    }

    public static void start() {
        //#method1() - this is the first puzzle and the first part of the game
        System.out.println("Hello! My name is Qwerty! I am your friend- and I have a puzzle for you but first...");
        System.out.println("What's your name?");
        Scanner name = new Scanner(System.in);
        //#hero - the player or the game is the hero- making their way to solve a puzzle of wit.
        theirname = name.nextLine();
        while (!currentlyfree) {
            System.out.println("Hi " + theirname + "! It seems you are in a room. (Hint: use keywords while typing in your answer!)");
            System.out.println("What do are you going to do?");
            Scanner beginning1 = new Scanner(System.in);
            first_answer = beginning1.nextLine().toLowerCase();
            if (first_answer.contains("room")) {
                while (!anew) {
                    System.out.println("You investigate the blank room, seeing only two things. You see a lock and a box on the ground.");
                    Scanner choice1 = new Scanner(System.in);
                    lock_or_box = choice1.nextLine().toLowerCase();
                    if (lock_or_box.contains("room")) {
                        anew = false;
                        System.out.println("You are back to the room.");
                    } else if (lock_or_box.contains("box")) {
                        System.out.println("You investigate the box, as it has four chemical vials along with a letter.");
                        Scanner choice2 = new Scanner(System.in);
                        chemical_or_letter = choice2.nextLine().toLowerCase();
                        if (chemical_or_letter.contains("letter")) {
                            System.out.println("The letter reads: OHNO. That doesn't bode well...");
                        } else if (chemical_or_letter.contains("chemical")) {
                            System.out.println("The vials seem to have different labels- two neon pink, one neon green, and one neon yellow label. They don't seem to hold anything.");
                            System.out.println("The neon pink labeled vials have the number 16 written on them. The neon yellow label says 14.01. The neon green label says 1.01.");
                            System.out.println("I wonder what that means...");
                        } else if (chemical_or_letter.contains("room")) {
                            anew = false;
                            System.out.println("You are back to the room.");
                        } else {
                            System.out.println("Try to look at the LETTER or CHEMICALS. I know you can do better than that!");
                        }
                    } 
    
                    else if (lock_or_box.contains("lock")) {
                        //#enemyobject - this is the "enemy" of the game- you have to pass this in order to win
                        System.out.println("You investigate the lock, it seems to be electronic keypad with four number slots.");
                        System.out.println("What is the code?");
                        Scanner ending1 = new Scanner(System.in);
                        final_answer = ending1.nextInt();
                        if (final_answer == 8178) {
                            System.out.println("I suppose you're leaving me. Well, you're very smart, " + theirname + ". The door creaks open, letting you through.");
                            //#win - this is what happens when you when you win the game
                            //#forthewin - this is how you win the game by putting in the correct code
                            currentlyfree = true;
                            anew = true;
                        } else {
                            System.out.println("Unfortunatly, you're here forever, " + theirname + ". Now we play forever! The door remains closed.");
                            //#lose - this is what happens when you lose the game
                            //#forthelose - if you type the code incorrectly, you lose but go back to the beginning
                            currentlyfree = false;
                            anew = false;
                            //counter += 1;
                        }
                    } else {
                        System.out.println("You try, but nothing happens. Try to investigate the LOCK or the BOX. I know you can do better than that!");
                    }
                    }
                    //
                    // TODO code application logic here
                }
        }
    } 
}
            


        
    

