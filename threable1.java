
public class threable1 {
    public static void main(String args[]) {
        new newthread();
        try{
            for(int i = 5; i>0; i--){
                System.out.println("Main thread: " +i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("Main Thread exiting.");
    }
}

