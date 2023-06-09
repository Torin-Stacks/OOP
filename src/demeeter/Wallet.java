package demeeter;

public class Wallet {
    private  float value;
    public float getValue(){
        return value;
    }
    public void setValue(float value){
        this.value = value;
    }

    public void decreaseValue(float amount){
        value = value - amount;
    }
    public void increaseValue(float amount){
        value = value + amount;
    }
}
