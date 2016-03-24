/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choose.your.own.adventure;
import java.util.Scanner;

/**
 *
 * @author AnnyCampbell
 */
public class ChooseYourOwnAdventure {
    private static final String UPSTAIRS = "upstairs";
    private static final String KITCHEN = "kitchen";
    private static final String BEDROOM = "bedroom";
    private static final String NURSERY = "nursery";
    private static final String FRIDGE = "fridge";
    private static final String STOVE = "stove";
    private static final String YES = "yes";
    private static final String NO = "no";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String location, room, choice, object;
        
        System.out.println("Choose your own adventure.");
        
        System.out.println("You are in a creepy old house. Would you like to go " + UPSTAIRS + " or to the " + KITCHEN + "?");
        location = keyboard.next();
        if(location.equals(UPSTAIRS)) {
            System.out.println("There are two rooms " + UPSTAIRS +". Which one would you choose. The " +
                    NURSERY + " or the " + BEDROOM + "?");
            room = keyboard.next();
            if(room.equals(NURSERY)){
               System.out.println("There are creepy dolls all around the room. Would you take one? (" + YES + " or " + NO + ")");
               choice = keyboard.next();
               if(choice.equals(YES)){
                   System.out.println("Oh no! The doll is honted by an agry ghost!");
               }
               else if(choice.equals(NO)){
                   System.out.println("Back out of the room slowly before the doll attack!");
               }
               else{
                   System.out.println("Choose either" + YES + " or " + NO + ".");
               }
            }
            else if (room.equals(BEDROOM)){
               System.out.println("The room is full of dust and old broken furnature. Would you spend the night in this room? (" + YES + " or " + NO + ")");
               choice = keyboard.next();
               if (choice.equals(YES)){
                  System.out.println("Oh no! There is a bogat in the closet!"); 
               }
               else if(choice.equals(NO)){
                   System.out.println("Run as fast as you can before the bogat find you!");
               }
            }
            else {
               System.out.println("Choose either + " + NURSERY + " or " + BEDROOM + "."); 
            }
        } 
        
        else if(location.equals(KITCHEN)){
            System.out.println("The light burnt out! Do you go to the " + FRIDGE + " or the " + STOVE + "?");
            object = keyboard.next();
            if (object.equals(FRIDGE)){
                System.out.println("The " + FRIDGE + " looks old. Do you open it? (" + YES + " or " + NO + ")");
                choice = keyboard.next();
                if (choice.equals(YES)){
                    System.out.println("The " + FRIDGE + " is full of bats! Run! ");
                }
                else if(choice.equals(NO)){
                    System.out.println("The " + FRIDGE + " bursts open and the bats chase you!");
                }
                else{
                    System.out.println("Choose either " + YES + " or " + NO + ".");
                }
            }
            else if(object.equals(STOVE)){
                System.out.println("It looks like someone is cooking something. Do you try it? (" + YES + " or " + NO + ")");
                choice = keyboard.next();
                if (choice.equals(YES)){
                    System.out.println("EWW! It's rotten and will make you sick!");
                }
                else if(choice.equals(NO)){
                    System.out.println("Good move. But run before the rats get you!");
                }
                else {
                    System.out.println("Choose either " + YES + " or " + NO + ".");
                }
            }
            else{
                System.out.println("Choose either" + FRIDGE + " or "+ STOVE +".");
            }
            
        }
        
        else {
            System.out.println("Choose either" + UPSTAIRS + " or " + KITCHEN +".");
        }       

    }
    
}
