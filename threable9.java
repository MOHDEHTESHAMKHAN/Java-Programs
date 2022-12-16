class threable9 extends Thread{
    public void run(){
        for (int i= 0; i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}

        }
    }

    public static void main(String[] args) {
        threable9 mtc = new threable9();
        threable9 mtc1 = new threable9();
        mtc.start();
        mtc1.start();
    }
}

