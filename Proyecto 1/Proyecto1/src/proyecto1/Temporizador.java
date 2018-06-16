
package proyecto1;

public class Temporizador implements Runnable {
    public static Thread t;
    int tiempo =0;
    public Temporizador(){
        t=new Thread(this,"Contador");
        t.start();
    }
    @Override
    public void run() {
    }
    
}
