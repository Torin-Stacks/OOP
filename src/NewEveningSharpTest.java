 public class NewEveningSharpTest extends eveningSharpTest {
    private int radius;
    public NewEveningSharpTest(int radius){
        this.radius = radius;
    }
    public String toString(){
        return  String.format("%d", radius);
    }
}

 class TestEvening {
     public static void main(String[] args) {
         NewEveningSharpTest obj = new NewEveningSharpTest(6);
         System.out.println(obj.toString());
     }

}