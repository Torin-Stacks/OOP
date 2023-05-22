import java.util.ArrayList;

public class Person {

    ArrayList<Problem> probs = new ArrayList<>();

    public Person(ArrayList<Problem> probs){
        this.probs = probs;
    }

    public ArrayList<Problem> add(Problem wahala){
        probs.add(wahala);
        return probs;
    }

    public void solved(){
        for ( Problem prob : probs ){
            if(prob.getProblemStatus()){
                System.out.println("Problem solved");
            }
            else{
                System.out.println(" still a problem");
            }
        }

    }

    public ArrayList<Problem> tellProblem(){
        return probs;
    }
}
