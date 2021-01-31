
import java.util.Scanner;

public class CYOAbase {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // The start of Part II: The Mission
        System.out.println(
            "You come home with the rest of your groceries and take off your mask. \n"
            + "As you make your way back to your room for your next Zoom meeting, \n"
            +  "you find out on the news that a scientist known as \n"
            + "\"Evil Vaccine Man\" has developed a vaccine, but he is refusing to\n"
            + "share it with the world! He is currently in hiding...");
        System.out.println(' ');
        System.out.println("Do you want to:");
        System.out.println("1. Skip the meeting and try to find Evil Vaccine Man");
        System.out.println("or");
        System.out.println("2. attend your meeting?");
        System.out.println(" ");
        
        //The outcomes of deciding whether or not you go to the meeting
        boolean valid1 = true;
    
        while(valid1) {
            int attendMission = keyboard.nextInt();
    
            if(attendMission == 2) { 
                System.out.println("You decide to let Evil Vaccine Man be, and attend \n"
                + "your meeting hoping for the other scientists to develop the vaccine \n"
                + "as quickly as possible...");
                System.out.println(" ");
                System.out.println("You have a pretty boring year, and there are many deaths. \n"
                + "The vaccine comes out eventually, but you wonder what could've happened \n"
                + "if you tried to stop Evil Vaccine Man.");
                
                keyboard.close();
                break;
            }
            else if (attendMission != 1) {
                System.out.println("Type 1 or 2 please.");
            }
            else {
                System.out.println("Yes! You skip the Zoom meeting and set off on your \n"
                    + "adventure! You hear two rumours on the subreddits about the Evil \n"
                    + "Vaccine Man. The first rumour is that he is involved with the \n"
                    + "Pentagon. The second rumour is that he is friends with Kim \n"
                    + "Jong Un. \n"
                    + "Which rumour do you want to listen to? Do you want to:");
                System.out.println("1. Hack into the Pentagon");
                System.out.println("or");
                System.out.println("2. fly to North Korea to try to see Kim Jong Un?");
                
                //North Korea or Pentagon situation
                    //boolean valid2 = true;
                    //while(valid2) {
                        int nKoreaOrPentagon = keyboard.nextInt();
                        
                        if(nKoreaOrPentagon == 1) {
                            System.out.println("Okay! You are using your amazing \n"
                                + "hacking skills to break into the Pentagon! As you are trying to\n"
                                + " find information on Evil Vaccine Man, to your surprise \n"
                                + " you see UFO videos within the database! Pentagon employees catch \n"
                                + "you snooping and allow the aliens to attack you! ");
                            System.out.println(" ");
                            System.out.println("What will you do about these aliens?! Do you want to");
                            System.out.println("1. Fight them with weapons");
                            System.out.println("or");
                            System.out.println("2. challenge them to a TikTok dance battle?");
                            
                            boolean valid3 = true;
                            while(valid3) {
                                int weaponsOrTikTok = keyboard.nextInt();
                                
                                if(weaponsOrTikTok == 1) {
                                    System.out.println("The Alien's technology is superior\n"
                                        + "to human technology, so ultimately you are deafeated\n"
                                        + "and get captured by the Aliens! Now you can never\n"
                                        + "find Evil Vaccine Man!");
                                    break;
                                }
                                else if(weaponsOrTikTok != 2) {
                                    System.out.println("Type 1 or 2 please.");
                                }
                                else {
                                    System.out.println("When you begin to dance, the Aliens are both \n"
                                        + "confused and amazed because they don't know much about humans. \n"
                                        + "Out of admiration, for your dance moves they reaveal Evil Vaccine \n"
                                        + "Man's location in New Zealand.");
                                
                                    //New Zealand scene (confronting Evil Vaccine Man)
                                    
                                   
                                
                                    
                                }
                           }//while North Korea or Pentagon bracket
                        }      
                
            } //while bracket
        }   
            keyboard.close();
        } 
}//Class bracket




