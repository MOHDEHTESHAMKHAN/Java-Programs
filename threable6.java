public class threable6{
    public static void main(String[] args) {
      Newthread1 obj1 = new Newthread1("one");
      Newthread1 obj2 = new Newthread1("two");
      Newthread1 obj3 = new Newthread1("three");
        System.out.println("Thread one is alive" + obj1.t.isAlive());
        System.out.println("Thread two is alive" + obj2.t.isAlive());
        System.out.println("Thread three is alive" + obj3.t.isAlive());
        try{
            System.out.println("waiting for thread to finish");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

    }
}
