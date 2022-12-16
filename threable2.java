public class threable2{
    public static void main(String[] args) {
      Newthread2 obj1 = new Newthread2("one");
      Newthread2 obj2 = new Newthread2("two");
      Newthread2 obj3 = new Newthread2("three");

        try{
            System.out.println("waiting for thread to finish");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");

    }
 }
