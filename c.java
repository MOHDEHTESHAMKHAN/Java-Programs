interface a{
    public void display();
}
interface b{
    public void show();
}
class c implements a,b{
    @Override
    public void display() {
        System.out.println("HARRY");
    }

    @Override
    public void show() {
        System.out.println("POTTER");
    }

    public static void main(String[] args) {
        c obj = new c();
         obj.display();
         obj.show();
    }
}

