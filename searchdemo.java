class user{
        boolean value= false;
        private String request= " ";
        user( String request)
         {
           value = true;
           this.request= request;
           System.out.println(" user request : " + request);
          }
             
          public String getrequest()
           {
                   return this.request;
           }
         }
        
class google{
           private String request;
           google(String request)
            {
                  this.request = request;
              System.out.println(" google search  " + request);
             }
           }
            
class searchdemo{
            public static void main(String args[])
             { user search = new user("java");
                if(search.value)
                    {
                     google g = new google(search.getrequest());
                    }
                  }
               }
