
import java.util.Scanner;

public class CYOAbase {

    public static void main(String[] args) {
        
        Scanner questions = new Scanner(System.in);
        //Q1
        System.out.println("You need supplies, do you go"
            + " to the store and buy some, yes or no?");

        String store = questions.next();
        //Q1 Choice 1
        if (store.equalsIgnoreCase("yes")) {
            //Q2
            System.out.println(
                "You go to the store to get supplies. While at the store, "
                    + "you encounter a rush on toilet paper. Do you: 1. fight or 2. leave?");

            String tp = questions.next();
            //Q2 Choice 1
            if (tp.equalsIgnoreCase("1")) {
                System.out.println("You have won some toilet paper!");
                // mission
            }
            //Q2 Choice 2
            else if (tp.equalsIgnoreCase("2")) {
                //Q3
                System.out.println("On your way out of the store you "
                    + "encounter an anti-masker. Do you: 1. ask him to put on"
                    + " a mask or 2. leave him alone?");

                String mask = questions.next();
                //Q3 Choice 1
                if (mask.equalsIgnoreCase("1")) {
                    //Q4
                    System.out.println(
                        "He yells back, NO! Do you: 1. get everyone to "
                        + "publicly shame him or 2. leave him alone?");

                    String shame = questions.next();
                    //Q4 Choice 1
                    if (shame.equalsIgnoreCase("1")) {
                        System.out.println(
                            "He was embarrassed and put his mask on,"
                                + " you have protected the store from COVID-19.");
                        // mission
                    }
                    //Q4 Choice 2
                    else if (shame.equalsIgnoreCase("2")) {
                        System.out.println(
                            "You backed down and unfortunately contracted"
                                + " COVID-19 from him.");
                    }
                    else {
                        System.out.println("You entered an invalid response."
                            + "I am sorry, but game over.");
                    }

                }
                //Q3 Choice 2
                else if (mask.equalsIgnoreCase("2")) {
                    System.out.println("You unfortunately caught COVID-19"
                        + " because you did not ask the man to put a mask on.");
                }
                else {
                    System.out.println("You entered an invalid response."
                        + "I am sorry, but game over.");
                }
            }
            else {
                System.out.println("You entered an invalid response."
                    + "I am sorry, but game over.");
            }
        }
        //Q1 Choice 2
        else if (store.equalsIgnoreCase("no")) {
            System.out.println("Unfortunately you have died "
                + "of starvation because you ran out of supplies.");
        }
        else {
            System.out.println("You entered an invalid response."
                + "I am sorry, but game over.");
            }
        }
        questions.close();
        
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
                                    
                                    Scanner in = new Scanner(System.in);
        
                                    System.out.println("You must now face off against "
                                    + "Evil Vaccine Man. You have 3 choices: "
                                    + "\n 1. Convince the aliens to join you in exchange for human data."
                                    + "\n 2. Zoom call with the United Nations."
                                    + "\n 3. Battle the Evil Vaccine Man alone.");
        
                                    String answer = in.next();
        
                                    if (answer.equalsIgnoreCase("1")) {
                                    System.out.println("The Evil Vaccine Man is overpowered by Aliens,"
                                    + " so he has no choice but to give up the vaccines."
                                    + "Now that the Evil Vaccine Man is defeated"
                                    + " and the vaccine has been replicated and distributed all"
                                    + " over the world, the pandemic is finally over! In these"
                                    + " hard times, we have had to connect although we were"
                                    + " physically apart. By reaching out to your comrades, "
                                    + "you were able to band together to beat this pandemic :)");
                        }
            else if (answer.equalsIgnoreCase("2")) {
            System.out.println("The Evil Vaccine Man’s location is revealed "
                + "to the UN and they respond by sending their military forces,"
                + " so the Evil Vaccine Man is left with no choice but to give up"
                + " the vaccines. Now that the Evil Vaccine Man is defeated"
                + " and the vaccine has been replicated and distributed all"
                + " over the world, the pandemic is finally over! In these"
                + " hard times, we have had to connect although we were"
                + " physically apart. By reaching out to your comrades, "
                + "you were able to band together to beat this pandemic :)");
        }
        else if (answer.equalsIgnoreCase("3")) {
            System.out.println("You cannot face the Evil Vaccine Man alone,"
                + " so you are ultimately defeated.");
        }
        else {
            System.out.println("You have not chosen a valid option to face the"
                + "Evil Vaccine Man and have therefore failed your mission.");
        }
        in.close();
    }
                                
                                    
                                }
                           }//while North Korea or Pentagon bracket
                        }      
                
            } //while bracket
        }   
            keyboard.close();
        } 
}//Class bracket




