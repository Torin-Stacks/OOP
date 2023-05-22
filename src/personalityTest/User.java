package personalityTest;


import java.util.Arrays;
import java.util.Scanner;

import static personalityTest.MbtiTest.*;

public class User {
    private String name;
    private String personalityTrait;
    private static String[] responses  = new String[20];

    public User(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public static String[] getResponses(){
        return responses;
    }


    public void takeTest() {
        if (getName() != "") {
            int count = 0;
            while(count< questions.length){
                System.out.println(getQuestions()[count]);
                Scanner input = new Scanner(System.in);
                String response = input.nextLine();
                if(response.toUpperCase().equals("A") || response.toUpperCase().equals("B")){
                    responses[count] = response;
                    count++;
                }
                else{
                    System.out.println("Expected A Or B, pls try again: ");
                }

            }
            System.out.println(Arrays.toString(responses));
        }
    }


//    private void collateResponse(){
//        for (int index = 0;index< getQuestions().length; index++){
//            System.out.println(getQuestions()[index]);
//            Scanner input = new Scanner(System.in);
//            String response = input.nextLine();
//            acceptResponses(response);
//            System.out.println();
//        }
//    }
//    public String getPersonalityTrait(){
//        personalityTrait = determinePersonalityTrait();
//        return personalityTrait;
//    }
}
