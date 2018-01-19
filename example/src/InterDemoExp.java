public class InterDemoExp implements Inter2{

    public void run() {
        System.out.println("Running interface 1");

    }

    public void retrack() {
        System.out.println("retracking from interface 1");

    }

    public void summer(){
        System.out.println("summer");

    }

    public static void main(String[] args) {
        InterDemoExp e = new InterDemoExp();
        e.retrack();
        e.run();
        e.summer();
        }

}
