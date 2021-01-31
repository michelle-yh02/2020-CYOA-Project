

import java.util.Scanner;

public class CYOAbase {

    public static void main(String[] args) {
            System.out.println("Welcome to Jumanji!");
            System.out.println("Hah just kidding but 2020 wasn't any better...\n");
            System.out.println("A lot happened in 2020");
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Choose your Character");
            System.out.println("1. " + "Gen-Z TikToker");
            System.out.println("2. " + "Anti-Masker Karen");
            System.out.println("3. " + "Fabulous First Responder");
            
            String character = input.nextLine();
            if (character.equals("1"))
            {
                System.out.println("\nWe've got a celebrity among us");
            }
            else if (character.equals("2"))
            {
                System.out.println("\nUmm interesting choice, Karen.");
            }
            else if (character.equals("3"))
            {
                System.out.println("\nAmazing choice, thank you for your service");
            }
            else
            {
                System.out.println("\nThis is your end, farewell");
            }
            System.out.println("\nNow that we know who you are, let's continue "
                + "with our story\n");
            
            System.out.println("Press enter to continue...");
            try 
            {
                System.in.read();
            }
            catch (Exception e)
            {
            }
        
            System.out.println("It's March 13, 2020, life as we know it is changing. \n"
                + "People are beginning to walk around with masks on their faces, \n"
                + "gloves on their hands, it's getting weird out there. Are you going \n"
                + "to run and hide? Or are you going to save your world from \n"
                + "disaster? I guess we'll just have to see as you create your \n"
                + "journey and forge your path to victory... or death... the choice \n"
                + "is yours... good luck");
        Scanner keyboard = new Scanner(System.in);
        
        //The Start of Part I: The Shopping Trip
        System.out.println("You need supplies, do you want to:\n"
            + "1. Go to the store and buy some, \n"
            + "or\n"
            + "2. Stay at home and buy supplies later");       
        
      //Shopping scene
        boolean storeValid = true;
        while (storeValid) {
            int store = keyboard.nextInt();
            
            //Shopping trip Choice 2
            if (store == 2) {
                System.out.println("Unfortunately you have died "
                    + "of starvation because you ran out of supplies.");
                break;
            }
            else if (store != 1){
                System.out.println("Type 1 or 2 please");
                }
            //Shopping trip Choice 1
            else {
                //TP Choice
                System.out.println(
                    "You go to the store to get supplies. While at the store, "
                        + "you encounter a rush on toilet paper. Do you: \n"
                        + "1. fight\n"
                        + "or\n"
                        + "2. leave?");
    
                boolean tpValid = true;
                while(tpValid) {
                    int tp = keyboard.nextInt();
                    //Q2 Choice 1
                    if (tp == 1) {
                        System.out.println("You have won some toilet paper!");
                        // mission
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
                        boolean mission = true;
                    
                        while(mission) {
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
                                    boolean nKoreaOrPentagonValid = true;
                                    while(nKoreaOrPentagonValid) {
                                        int nKoreaOrPentagon = keyboard.nextInt();
                                        
                                        //Pentagon Choice
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
                                            
                                            boolean weaponsOrTikTokValid = true;
                                            while(weaponsOrTikTokValid) {
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
                                                        + "Out of admiration, for your dance moves they reveal Evil Vaccine \n"
                                                        + "Man's location in New Zealand.");
                                                
                                                    //New Zealand scene (confronting Evil Vaccine Man)
                                                    
                                                    System.out.println(" ");
                                                    System.out.println("You must now face off against "
                                                        + "Evil Vaccine Man!! Do you want to: "
                                                        + "\n 1. Convince the aliens to join you in exchange for human data."
                                                        + "\n 2. Zoom call with the United Nations."
                                                        + "\n 3. Battle the Evil Vaccine Man alone.");
                                                            
                                                        boolean answerValid = true;
                                                        while(answerValid) {
                                                            int answer = keyboard.nextInt();
                                                            
                                                            if (answer == 1) {
                                                                System.out.println("The Evil Vaccine Man is overpowered by Aliens,\n"
                                                                + " so he has no choice but to give up the vaccines.\n"
                                                                + "Now that the Evil Vaccine Man is defeated\n"
                                                                + " and the vaccine has been replicated and distributed all\n"
                                                                + " over the world, the pandemic is finally over! In these\n"
                                                                + " hard times, we have had to connect although we were\n"
                                                                + " physically apart. By reaching out to your comrades, \n"
                                                                + "you were able to band together to beat this pandemic :)");
                                                                
                                                                break;
                                                           }
                                                           else if (answer == 2) {
                                                               System.out.println("The Evil Vaccine Man’s location is revealed \n"
                                                                + "to the UN and they respond by sending their military forces,\n"
                                                                + " so the Evil Vaccine Man is left with no choice but to give up\n"
                                                                + " the vaccines. Now that the Evil Vaccine Man is defeated\n"
                                                                + " and the vaccine has been replicated and distributed all\n"
                                                                + " over the world, the pandemic is finally over! In these\n"
                                                                + " hard times, we have had to connect although we were\n"
                                                                + " physically apart. By reaching out to your comrades, \n"
                                                                + "you were able to band together to beat this pandemic :)");
                                                               
                                                               break;
                                                           }
                                                           else if (answer != 3) {                                            
                                                               System.out.println("Type 1, 2, or 3 please!");                                                
                                                           }
                                                            else {                                                
                                                                System.out.println("You cannot face the Evil Vaccine Man alone,"
                                                                    + " so you are ultimately defeated.");
                                                                    
                                                                    break;
                                                            }
                                                        }//while Boss battle bracket
                                                 }}}
                                                                                                                                                                                                                               
                                                                               
                                                else if (nKoreaOrPentagon != 2) {
                                                    System.out.print("Type 1 or 2 please");
                                                }
                                                else {
                                                    
                                                        System.out.println("Now that you're at the North Korea border patrol,\n"
                                                            + "you blackmail the border security with your knowledge of \n"
                                                            + "Kim Jong Un's whereabouts even though he's dead, at least \n"
                                                            + "that's what the world thinks\n");
                                                        System.out.println("With this secret knowledge in your hands, security \n"
                                                            + "felt you were trustworthy enough to reveal to you where the evil \n"
                                                            + "man was hiding with his vaccine\n");
                                                        System.out.println("But the question is, do you believe what they say"
                                                            + "?");

                                                        System.out.println("1. You believe they're telling the truth");
                                                        System.out.println("2. You don't believe they're telling the truth");

                                                        boolean choiceValid = true;
                                                        while(choiceValid) {
                                                            int choice = keyboard.nextInt();
                                                            if (choice == 1)
                                                            {
                                                                System.out.println("Oh no, it looks like they told the Evil Vaccine \n"
                                                                    + "Man to escape and find a new hiding place");
                                                                System.out.println("you have been arrested, you have failed to\n"
                                                                    + "save your world from this vaccine,"
                                                                    + " farewell");
                                                                break;
                                                            }
                                                            else if (choice ==2)
                                                            {
                                                                System.out.println("You're ready to call their bluff and say \n"
                                                                    + "'that's not his hiding place!'\n");
                                                                System.out.println("Border Security: How do you know where the Evil \n"
                                                                    + "Vaccine Man is hiding?!!\n");
                                                                System.out.println("Quick thinking on your part, tricking them into \n"
                                                                    + "confirming your guess, good job!");
                                                                
                                                              //New Zealand scene (confronting Evil Vaccine Man)
                                                                
                                                                System.out.println(" ");
                                                                System.out.println("You must now face off against "
                                                                    + "Evil Vaccine Man!! Do you want to: "
                                                                    + "\n 1. Convince the aliens to join you in exchange for human data."
                                                                    + "\n 2. Zoom call with the United Nations."
                                                                    + "\n 3. Battle the Evil Vaccine Man alone.");
                                                                        
                                                                    boolean answerValid = true;
                                                                    while(answerValid) {
                                                                        int answer = keyboard.nextInt();
                                                                        
                                                                        if (answer == 1) {
                                                                            System.out.println("The Evil Vaccine Man is overpowered by Aliens,\n"
                                                                            + " so he has no choice but to give up the vaccines.\n"
                                                                            + "Now that the Evil Vaccine Man is defeated\n"
                                                                            + " and the vaccine has been replicated and distributed all\n"
                                                                            + " over the world, the pandemic is finally over! In these\n"
                                                                            + " hard times, we have had to connect although we were\n"
                                                                            + " physically apart. By reaching out to your comrades, \n"
                                                                            + "you were able to band together to beat this pandemic :)");
                                                                            
                                                                            break;
                                                                       }
                                                                       else if (answer == 2) {
                                                                           System.out.println("The Evil Vaccine Man’s location is revealed \n"
                                                                            + "to the UN and they respond by sending their military forces,\n"
                                                                            + " so the Evil Vaccine Man is left with no choice but to give up\n"
                                                                            + " the vaccines. Now that the Evil Vaccine Man is defeated\n"
                                                                            + " and the vaccine has been replicated and distributed all\n"
                                                                            + " over the world, the pandemic is finally over! In these\n"
                                                                            + " hard times, we have had to connect although we were\n"
                                                                            + " physically apart. By reaching out to your comrades, \n"
                                                                            + "you were able to band together to beat this pandemic :)");
                                                                           
                                                                           break;
                                                                       }
                                                                       else if (answer != 3) {                                            
                                                                           System.out.println("Type 1, 2, or 3 please!");                                                
                                                                       }
                                                                        else {                                                
                                                                            System.out.println("You cannot face the Evil Vaccine Man alone,"
                                                                                + " so you are ultimately defeated.");
                                                                                
                                                                                break;
                                                                        }
                                                                    }//while Boss battle bracket
                                                                
                                                                
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Type 1 or 2 please");
                                                            }
                                                            

                                                    }
                                                }
                                           }//while North Korea or Pentagon bracket
                                        }      
                                
                            } //while bracket
                    }
                    else if(tp != 2){
                        System.out.println("Type 1 or 2 please");
                    }
                    //Q2 Choice 2
                    else {
                        //Q3
                        System.out.println("On your way out of the store you "
                            + "encounter an anti-masker. Do you: 1. ask him to put on"
                            + " a mask or 2. leave him alone?");
        
                        
                        
                        boolean maskValid = true;
                        while(maskValid) {
                            int mask = keyboard.nextInt();
                          //Mask Choice 2
                            if (mask == 2) {
                                System.out.println("You unfortunately caught COVID-19"
                                    + " because you did not ask the man to put a mask on.");
                                break;
                            }
                            else if (mask != 1){
                                System.out.println("Type 1 or 2 please");
                            }
                            //Mask Choice 1
                            else {
                                //Shaming Choice
                                System.out.println(
                                    "He yells back, NO! Do you: 1. get everyone to "
                                    + "publicly shame him or 2. leave him alone?");
            
                                
                                
                                boolean shameValid = true;
                                while(shameValid) {
                                    int shame = keyboard.nextInt();
                                    
                                    //Shame Choice 2
                                    if (shame == 2) {
                                        System.out.println(
                                            "You backed down and unfortunately contracted"
                                                + " COVID-19 from him.");
                                        break;
                                    }
                                    else if (shame != 1){
                                        System.out.println("TYpe 1 or 2 please");
                                    }
                                    //Shame Choice 1
                                    else {
                                        System.out.println(
                                            "He was embarrassed and put his mask on,"
                                                + " you have protected the store from COVID-19.");
                                        // mission
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
                                        boolean mission = true;
                                    
                                        while(mission) {
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
                                                    boolean nKoreaOrPentagonValid = true;
                                                    while(nKoreaOrPentagonValid) {
                                                        int nKoreaOrPentagon = keyboard.nextInt();
                                                        
                                                        //Pentagon Choice
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
                                                            
                                                            boolean weaponsOrTikTokValid = true;
                                                            while(weaponsOrTikTokValid) {
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
                                                                        + "Out of admiration, for your dance moves they reveal Evil Vaccine \n"
                                                                        + "Man's location in New Zealand.");
                                                                
                                                                    //New Zealand scene (confronting Evil Vaccine Man)
                                                                    
                                                                    System.out.println(" ");
                                                                    System.out.println("You must now face off against "
                                                                        + "Evil Vaccine Man!! Do you want to: "
                                                                        + "\n 1. Convince the aliens to join you in exchange for human data."
                                                                        + "\n 2. Zoom call with the United Nations."
                                                                        + "\n 3. Battle the Evil Vaccine Man alone.");
                                                                            
                                                                        boolean answerValid = true;
                                                                        while(answerValid) {
                                                                            int answer = keyboard.nextInt();
                                                                            
                                                                            if (answer == 1) {
                                                                                System.out.println("The Evil Vaccine Man is overpowered by Aliens,\n"
                                                                                + " so he has no choice but to give up the vaccines.\n"
                                                                                + "Now that the Evil Vaccine Man is defeated\n"
                                                                                + " and the vaccine has been replicated and distributed all\n"
                                                                                + " over the world, the pandemic is finally over! In these\n"
                                                                                + " hard times, we have had to connect although we were\n"
                                                                                + " physically apart. By reaching out to your comrades, \n"
                                                                                + "you were able to band together to beat this pandemic :)");
                                                                                
                                                                                break;
                                                                           }
                                                                           else if (answer == 2) {
                                                                               System.out.println("The Evil Vaccine Man’s location is revealed \n"
                                                                                + "to the UN and they respond by sending their military forces,\n"
                                                                                + " so the Evil Vaccine Man is left with no choice but to give up\n"
                                                                                + " the vaccines. Now that the Evil Vaccine Man is defeated\n"
                                                                                + " and the vaccine has been replicated and distributed all\n"
                                                                                + " over the world, the pandemic is finally over! In these\n"
                                                                                + " hard times, we have had to connect although we were\n"
                                                                                + " physically apart. By reaching out to your comrades, \n"
                                                                                + "you were able to band together to beat this pandemic :)");
                                                                               
                                                                               break;
                                                                           }
                                                                           else if (answer != 3) {                                            
                                                                               System.out.println("Type 1, 2, or 3 please!");                                                
                                                                           }
                                                                            else {                                                
                                                                                System.out.println("You cannot face the Evil Vaccine Man alone,"
                                                                                    + " so you are ultimately defeated.");
                                                                                    
                                                                                    break;
                                                                            }
                                                                        }//while Boss battle bracket
                                                                 }}}
                                                                                                                                                                                                                                               
                                                                                               
                                                                else if (nKoreaOrPentagon != 2) {
                                                                    System.out.print("Type 1 or 2 please");
                                                                }
                                                                else {
                                                                    
                                                                        System.out.println("Now that you're at the North Korea border patrol,\n"
                                                                            + "you blackmail the border security with your knowledge of \n"
                                                                            + "Kim Jong Un's whereabouts even though he's dead, at least \n"
                                                                            + "that's what the world thinks\n");
                                                                        System.out.println("With this secret knowledge in your hands, security \n"
                                                                            + "felt you were trustworthy enough to reveal to you where the evil \n"
                                                                            + "man was hiding with his vaccine\n");
                                                                        System.out.println("But the question is, do you believe what they say"
                                                                            + "?");

                                                                        System.out.println("1. You believe they're telling the truth");
                                                                        System.out.println("2. You don't believe they're telling the truth");

                                                                        boolean choiceValid = true;
                                                                        while(choiceValid) {
                                                                            int choice = keyboard.nextInt();
                                                                            if (choice == 1)
                                                                            {
                                                                                System.out.println("Oh no, it looks like they told the Evil Vaccine \n"
                                                                                    + "Man to escape and find a new hiding place");
                                                                                System.out.println("you have been arrested, you have failed to\n"
                                                                                    + "save your world from this vaccine,"
                                                                                    + " farewell");
                                                                                break;
                                                                            }
                                                                            else if (choice ==2)
                                                                            {
                                                                                System.out.println("You're ready to call their bluff and say \n"
                                                                                    + "'that's not his hiding place!'\n");
                                                                                System.out.println("Border Security: How do you know where the Evil \n"
                                                                                    + "Vaccine Man is hiding?!!\n");
                                                                                System.out.println("Quick thinking on your part, tricking them into \n"
                                                                                    + "confirming your guess, good job!");
                                                                                
                                                                              //New Zealand scene (confronting Evil Vaccine Man)
                                                                                
                                                                                System.out.println(" ");
                                                                                System.out.println("You must now face off against "
                                                                                    + "Evil Vaccine Man!! Do you want to: "
                                                                                    + "\n 1. Convince the aliens to join you in exchange for human data."
                                                                                    + "\n 2. Zoom call with the United Nations."
                                                                                    + "\n 3. Battle the Evil Vaccine Man alone.");
                                                                                        
                                                                                    boolean answerValid = true;
                                                                                    while(answerValid) {
                                                                                        int answer = keyboard.nextInt();
                                                                                        
                                                                                        if (answer == 1) {
                                                                                            System.out.println("The Evil Vaccine Man is overpowered by Aliens,\n"
                                                                                            + " so he has no choice but to give up the vaccines.\n"
                                                                                            + "Now that the Evil Vaccine Man is defeated\n"
                                                                                            + " and the vaccine has been replicated and distributed all\n"
                                                                                            + " over the world, the pandemic is finally over! In these\n"
                                                                                            + " hard times, we have had to connect although we were\n"
                                                                                            + " physically apart. By reaching out to your comrades, \n"
                                                                                            + "you were able to band together to beat this pandemic :)");
                                                                                            
                                                                                            break;
                                                                                       }
                                                                                       else if (answer == 2) {
                                                                                           System.out.println("The Evil Vaccine Man’s location is revealed \n"
                                                                                            + "to the UN and they respond by sending their military forces,\n"
                                                                                            + " so the Evil Vaccine Man is left with no choice but to give up\n"
                                                                                            + " the vaccines. Now that the Evil Vaccine Man is defeated\n"
                                                                                            + " and the vaccine has been replicated and distributed all\n"
                                                                                            + " over the world, the pandemic is finally over! In these\n"
                                                                                            + " hard times, we have had to connect although we were\n"
                                                                                            + " physically apart. By reaching out to your comrades, \n"
                                                                                            + "you were able to band together to beat this pandemic :)");
                                                                                           
                                                                                           break;
                                                                                       }
                                                                                       else if (answer != 3) {                                            
                                                                                           System.out.println("Type 1, 2, or 3 please!");                                                
                                                                                       }
                                                                                        else {                                                
                                                                                            System.out.println("You cannot face the Evil Vaccine Man alone,"
                                                                                                + " so you are ultimately defeated.");
                                                                                                
                                                                                                break;
                                                                                        }
                                                                                    }//while Boss battle bracket
                                                                                
                                                                                
                                                                            }
                                                                            else
                                                                            {
                                                                                System.out.println("Type 1 or 2 please");
                                                                            }
                                                                            

                                                                    }
                                                                }
                                                           }//while North Korea or Pentagon bracket
                                                        }      
                                                
                                            } //while bracket
                                    }
                                }//while shame 
        
                        }//while anti-masker
                    
                }//while tp
              
            }
            
            }//while loop store
        
        
        //////////////////////////////////////////////////////

        
        }   
            keyboard.close();
        }//main method bracket 
        
    }}//Class bracket



