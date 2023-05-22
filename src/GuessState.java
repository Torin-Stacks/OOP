import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuessState {

    public static void main(String[] args) {
        guessState();
    }

    public static void guessState() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your state: ");
        String state = input.next();
        Zones[] zones = Zones.values();
//        System.out.println(Arrays.toString(zones));
        for(Zones zone:zones){
            String[] array = zone.getState();
//            System.out.println(Arrays.toString(array));
            for(int index = 0; index < array.length; index++) {
                if (state.equals(array[index])){
                    System.out.println("you are from the " + zone + " zone");
                }


            }

        }

    }
}
