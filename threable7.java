class threable7 extends  Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args) {
        threable7 t1 = new threable7();
        threable7 t2 = new threable7();
        threable7 t3 = new threable7();
        threable7 t4 = new threable7();
        threable7 t5 = new threable7();
        System.out.println("Name of t1: " +t1.getName());
        System.out.println("Name of t2: " +t2.getName());
        System.out.println("Name of t3: " +t3.getName());
        System.out.println("Name of t4: " +t4.getName());
        System.out.println("Name of t5: " +t5.getName());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.setName("Amity University");
        t2.setName("Delhi University");
        t3.setName("Kanpur University");
        t4.setName("Manipal University");
        t5.setName("BITS University");

        System.out.println("After Changing name of t1: "+ t1.getName());
        System.out.println("After Changing name of t2: "+ t2.getName());
        System.out.println("After Changing name of t3: "+ t3.getName());
        System.out.println("After Changing name of t4: "+ t4.getName());
        System.out.println("After Changing name of t5: "+ t5.getName());


    }
}

