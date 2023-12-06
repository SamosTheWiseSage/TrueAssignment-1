// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // Scanners and varibles
         Scanner boi = new Scanner(System.in);

        System.out.println("guess a number between 0 and 100" +
                " what is your guess");

        Random random = new Random();
        //AnnaGissning is the number generator, its set to 101 to beacuse otheriwise you would never get 100 as a number
        int AnnaGissning = random.nextInt(101);
        // ReikoEndlessZero is to make sure the loop contineus forever and lets you keep playing
        int ReikoEndlessZero = 0;
        // Counts how many times you guessed a number
        int MariaCounter = 0;

        myMethod(AnnaGissning,MariaCounter,ReikoEndlessZero);
    }
        static void myMethod( int AnnaGissning, int MariaCounter, int ReikoEndlessZero ) {
            Scanner boi = new Scanner(System.in);
            Random random = new Random();
        do {

            MariaCounter++;
            int Daisy = boi.nextInt();
            if (Daisy == AnnaGissning) {
                AnnaGissning = random.nextInt(101);
                System.out.println("ya did it, it took you " + MariaCounter + " tries");
                MariaCounter = 0;

            } // if its too low then it says this
          else if (Daisy <= AnnaGissning) {
                System.out.println("you were close fool but my Number is bigger");

            } //if its too big it will say this
            else if (Daisy >= AnnaGissning) {
                System.out.println("way too far dudes! my number is lower");

            }
        }
        while (ReikoEndlessZero == 0);
    }
        }
       /* for (int Reiko = 0; Reiko < 100 ; Reiko++) {

        // if its correkt it will say this
        if (Daisy == Anna){
        System.out.println("ya did it it took you "+ Reiko + " tries");
        } // if its too low then it says this
      else if (Daisy <= Anna) {
            System.out.println("you were close fool but my Number is bigger");
        } //if its too big it will say this
        else if (Daisy >= Anna) {
                System.out.println("way too far dudes! my number is lower");
            } else if (Reiko == 15) {
            System.out.println("you seem to be struggeling here champ. try and increase or decrease your number more slowly.");
        }
        }*/


