//File not foumd Exception

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

    public static void main(String[] args) {
        int i = 0 ;
        int i1 = 1;
        try {
            FileReader fileReader = new FileReader("c:/text.txt");
            System.out.println(i1/i);
        }catch (ArithmeticException e){
            System.out.println("divide by zero is not allowed");
        }catch (FileNotFoundException e){
            System.out.println("file not found please read from existing one ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
