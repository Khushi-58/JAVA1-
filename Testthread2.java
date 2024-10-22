package pkg1;
class MultiThreadingTwo implements Runnable{
    public void run(){
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
    }
}
public class Testthread2 {
    public static void main(String[] arg){
        for(int i=0;i<8;i++){
            MultiThreadingTwo mt1=new MultiThreadingTwo();
            Thread t1=new Thread(mt1);
            t1.start();
        }
    }    
}
