public class Problem {

    private String name;
    private  boolean isSolved;

    public Problem(String name, boolean status){
        this.name = name;
        this.isSolved = status;
    }

    public void setProblemStatus(){
        isSolved = true;
    }
    public boolean getProblemStatus() {
        return isSolved;
    }
}
