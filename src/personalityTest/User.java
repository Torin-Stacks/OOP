package personalityTest;


import java.util.Arrays;
import java.util.Scanner;


public class User {
    private String name;
    private MbtiTest personalityTrait;
    private String[] responses  = new String[20];

    public User(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public String[] getResponses(){
        return responses;
    }


    public void takeTest() {
        if (getName() != "") {
            int count = 0;
            while(count< 20){
                MbtiTest mbtiTest = new MbtiTest();
                System.out.println(mbtiTest.getQuestions()[count]);
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



//    public String getPersonalityTrait(){
//        personalityTrait = determinePersonalityTrait();
//        return personalityTrait;
//    }
}
