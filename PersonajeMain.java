import javax.swing.*;
import java.util.Scanner;

public class PersonajeMain {
    public static  void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("choose one number within 1 to 7");
        int n = reader.nextInt();

        if(n > 7) {
            System.out.println("Ooops! The number you choose is bigger than 7!");
        } else if ( n <+ 0) {
            System.out.println("Ooops! The number you choose is lower or equal to 0!");
        }


        switch (n) {
            case 1 :
                Personaje numberOne = new Personaje();
                numberOne.name = "Luther Hargreeves";
                numberOne.power = "super strong";
                numberOne.usePower(numberOne.name, numberOne.power);
                break;
            case 2 :
                Personaje numberTwo = new Personaje();
                numberTwo.name = "Diego Hargreeves";
                numberTwo.power = "knife Master";
                numberTwo.usePower(numberTwo.name, numberTwo.power);
                break;
            case 3 :
                Personaje numberThree = new Personaje();
                numberThree.name = "Allison Hargreeves";
                numberThree.power = "change your mind whit a whisper";
                numberThree.usePower(numberThree.name, numberThree.power);
                break;
            case 4:
                Personaje numberFour = new Personaje();
                numberFour.name = "Klaus Hargreeves";
                numberFour.power = "see and talk to dead people";
                numberFour.usePower(numberFour.name, numberFour.power);
                break;
            case 5:
                Personaje numberFive = new Personaje();
                numberFive.name = "The Boy";
                numberFive.power = "he can travel to the past and future";
                numberFive.usePower(numberFive.name, numberFive.power);
                break;
            case 6:
                Personaje numberSix = new Personaje();
                numberSix.name = "Ben Hargreeves";
                numberSix.power = "possess monsters from other dimensions";
                numberSix.usePower(numberSix.name, numberSix.power);
                break;
            case 7:
                Personaje numberSeven = new Personaje();
                numberSeven.name = "Vanya Hargreeves";
                numberSeven.power = "create destructive waves of force";
                numberSeven.usePower(numberSeven.name, numberSeven.power);
                break;
        }

















    }


}
