// Polymorphism Example
// two ways achieve Polymorphism
// 1)Method overloading
// 2)Method overriding

class retail
{
 void price(int a)
 {
  System.out.println("1st price"+ a*a);
 }

 void price(int a,int b)
 {
  int c = a*b ;
  System.out.println("2nd price"+ c);
 }
}

class total
{
 public static void main(String args[])
 {
  retail r = new retail();
  r.price(20);
  r.price(10,10);
 }
}

