class BMS extends Thread
{
    public void run()
{
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

class CSE extends Thread
 {
    public void run()
 {
        try{
            for (int i = 0; i < 5; i++){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
       catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class ThreadExample{
    public static void main(String[] args){
       System.out.println("Aishwarya K");
       BMS bms=new BMS();
       CSE cse=new CSE();
        bms.start();
        cse.start();
    }
}

