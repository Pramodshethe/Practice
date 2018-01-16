// Method overriding

class school
{
 void run()
 {
  System.out.println("school running");
  }
 }

class college extends school
{
 void run()
 {
  System.out.println("college running");
  System.out.println("THANK U");
 }
}

class student
{
 public static void main(String args[])
 {
  school c = new college();//upcasting
  c.run();
  school s = new school();
  s.run();
 }
}