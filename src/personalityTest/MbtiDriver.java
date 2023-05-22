package personalityTest;

import java.util.Scanner;

public class MbtiDriver {
    public static void main(String[] args) {

        MbtiTest test = new MbtiTest();
        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        User user = new User(name);
        user.takeTest();
        test.determineForIntrovertAndExtrovert();
        test.determineForSensingAndIntuitive();
        test.determineForThinkingAndFeeling();
        test.determineForJudgingAndPerspective();

    }
}
