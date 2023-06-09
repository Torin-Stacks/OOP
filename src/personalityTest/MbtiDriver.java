package personalityTest;

import java.util.Scanner;

public class MbtiDriver {
    public static void main(String[] args) {


        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        User user = new User(name);
        user.takeTest();
        MbtiTest test = new MbtiTest();
//        test.determineForIntrovertAndExtrovert();
//        test.determineForSensingAndIntuitive();
//        test.determineForThinkingAndFeeling();
//        test.determineForJudgingAndPerspective();

    }
}
