class  f{
    public static void main(String[] args) {
        try {
            Thread.sleep(10000);
            System.out.println("hello");
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
 }
