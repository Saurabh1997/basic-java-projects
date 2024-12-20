



   class A extends Thread {
       public void run () { 	//   this method we have to override so that when we call start method, thread will run this method. 
           for(int i=0; i<100; i++){
           System.out.println(" from A");
           }
       }
   }
   class B extends Thread {
       public void run() {
           for(int i=0; i<100; i++){
               System.out.println(" from B");
           }
       }
       }

  

   public class basicMultithread {
       public static void main(String args[]) {
           System.out.println(" from basic");
              A a = new A();
              B b = new B();
              a.start();  //  to start the thread 1.	
              b.start();    //to start thread 2
     }
}

