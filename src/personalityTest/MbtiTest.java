package personalityTest;


public class MbtiTest {

    public String[] questions;
    public MbtiTest(){

        questions = new String[20];
        questions[0] = "1. A.expend energy, enjoy groups, B.conserve energy, enjoy one on one";
        questions[1] = "2. A.interpret literally, B. lok for meaning and possibilities";
        questions[2] = "3. A.logical, thinking, questioning, B. empathic, feeling, accommodating";
        questions[3] = "4. A.organized, orderly, B. flexible, adaptable";
        questions[4] = "5. A.more outgoing, think out loud, B. more reserved, think to yourself";
        questions[5] = "6. A.practical, realistic, experiential B. imaginative, innovative, theoretical";
        questions[6] = "7. A.candid, straight forward, frank B. tactful, kind, encouraging";
        questions[7] = "8. A.plan, schedule, B. unplanned, spontaneous";
        questions[8] = "9. A.seek many tasks, public activities, interaction with others, B. seek private, solitary activities with quiet to concentrate";
        questions[9] = "10. A.standard, usual, conventional B. different, novel, unique";
        questions[10]= "11. A.firm, tend to criticize, hold the line, B. gentle, tend to appreciate, conciliate";
        questions[11]= "12. A.regulated, structured, B.easygoing, live and let live";
        questions[12]= "13. A.external, communicative, express yourself, B.internal, reticent, keep to yourself";
        questions[13]= "14. A.focus on here and now, B.look to the future, global perspective, big picture";
        questions[14]= "15. A.tough minded, just, B.tender-hearted, merciful";
        questions[15]= "16. A.preparation, plan ahead, B.go with the flow, adapt as you go";
        questions[16]= "17. A.active, initiate, B.reflective, deliberate";
        questions[17]= "18. A.facts, things, what is, B.ideas, dreams, philosophical";
        questions[18]= "19. A.matter of fact, issue oriented, B.sensitive, people oriented, compassionate";
        questions[19]= "20. A.control, govern B.latitude, freedom";

    }

    public  String[] getQuestions(){
        return questions;
    }

//    public void determineForIntrovertAndExtrovert(){
//        int extrovert = 0;
//        int introvert = 0;
//
//        for (int index = 0; index < getResponses().length; index+=4){
//            if(getResponses()[index].toUpperCase() == "A"){
//                extrovert += 1;
//            }
//            else{introvert+=1;}
//            if(extrovert > introvert){
//                System.out.println("E");
//            }
//            else{
//                System.out.println("I");
//            }
//
//        }
//    }
//
//
//    public void determineForSensingAndIntuitive(){
//        int sensitive = 0;
//        int intuitive = 0;
//        for (int index = 1; index < getResponses().length; index+=4){
//            if(getResponses()[index].toUpperCase() == "A"){
//                sensitive += 1;
//            }
//            else{intuitive+=1;}
//            if(sensitive > intuitive){
//                System.out.println("S");
//            }
//            else{
//                System.out.println("N");
//            }
//
//        }
//    }
//
//
//    public void determineForThinkingAndFeeling(){
//        int thinking = 0;
//        int feeling = 0;
//        for (int index = 2; index < getResponses().length; index+=4){
//            if(getResponses()[index].toUpperCase() == "A"){
//                thinking += 1;
//            }
//            else{feeling+=1;}
//            if(thinking > feeling){
//                System.out.println("T");
//            }
//            else{
//                System.out.println("F");
//            }
//
//        }
//    }
//
//
//    public void determineForJudgingAndPerspective(){
//        int judging = 0;
//        int perspective = 0;
//        for (int index = 3; index < getResponses().length; index+=4){
//            if(getResponses()[index].toUpperCase() == "A"){
//                judging += 1;
//            }
//            else{perspective+=1;}
//            if(judging > perspective){
//                System.out.println("J");
//            }
//            else{
//                System.out.println("P");
//            }
//
//        }
//    }



}

