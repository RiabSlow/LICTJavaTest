import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionText {
    public static void main(String[] args){
        try{
            int a=1/0;
        }catch (Exception e){
            System.out.println("Exception "+e);
        }

        try{
            int a=new Scanner(System.in).nextInt();
        }catch (ArithmeticException e){
            System.out.println("Arithmatic excepion");
        }catch (NullPointerException e){
            System.out.println("Nullpointer Exception");
        }catch (InputMismatchException e){
            System.out.println("input mismatch");
        }
    }
}
