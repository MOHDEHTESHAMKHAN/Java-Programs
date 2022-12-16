class alltest{
     int x = 10;
     static int y= 20;
     void M1(int a){
     System.out.println(" instance block ");
     }
     
     static void M2(String Str){
      System.out.println(" static method");
      }
      
      alltest(){
      System.out.println(" no argument constructor ");
       }
       
      alltest(int a)
       {
        System.out.println(" one argument constructor ");
        }
        {
         System.out.println(" instance block ");
        }
        
        static {
         System.out.println(" static block ");
        }
         
        public static void main(String args[]){
         alltest a= new alltest();
         alltest b= new alltest(5);
         a.M1(50);
         alltest.M2("Ehtesham");
         }
        }
