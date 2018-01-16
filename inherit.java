//Inheritance Example

class bus
 {
  void ride()
  {
   System.out.println("Riding Bus");
  }
 }

class human extends bus
 {
  void run()
  {
   System.out.println("Running Human");
  }
 }

class inherit
 {
  public static void main(String args[])
  {
   bus b = new bus();
   b.ride();
   human h = new human();
   h.ride();
   h.run();
  }
 }