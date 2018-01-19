interface demo{
    void run();

}

public class InterDemo implements demo {
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        InterDemo i = new InterDemo();
        i.run();
    }
}
