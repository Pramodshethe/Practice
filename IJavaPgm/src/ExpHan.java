//Null Pointer Exception

public class ExpHan {
    public static void main(String[] args) {
        try{
            //Arithematic exception
//            int a = 10/0;
            //Null Pointer exception
            String s = null;
            System.out.println(s.length());

            //Number Format exception
            String number = "8772652";
            System.out.println(Integer.parseInt(number));

            int b[] = {1,2,3,4,5};

            for (int i=0;i<b.length-1;i++){
                System.out.println("Array index out of bound exception");
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
