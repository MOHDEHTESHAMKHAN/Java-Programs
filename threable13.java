class threable13 extends Thread {
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
    }


   public static void main(String args[]){
        threable13 mtc = new threable13();

        mtc.start();
    }


}
