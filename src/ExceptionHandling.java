public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int myint = Integer.parseInt("pants");
        }
        catch(IllegalArgumentException | NullPointerException ex){
            System.out.println("pants is inconvertible to numbers");
        }
    }
}
