class Childthread implements Runnable {
    String name;
    Thread t;
    Childthread(String name){
        t= new Thread(this, name);
        t.start();
    }
    public void run(){
        for(int i =1; i<=5; i++){
            try{
                if(t.getName().equals("first thread"))
                {
                            Thread.sleep(1000);
                            System.out.println(t.getName()+ " + good morning");
                }
                else if (t.getName().equals("Second thread"))
                {
                    Thread.sleep(2000);
                    System.out.println(t.getName() + ": Hello");
                }
                else {
                    Thread.sleep(3000);
                    System.out.println(t.getName() + ": Welcome");
                }

            }
            catch (InterruptedException e){
                System.out.println(t.getName() + " is interrupted");
            }
        }
    }
}
