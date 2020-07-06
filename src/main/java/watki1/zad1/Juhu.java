package watki1.zad1;

public class Juhu  implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Juhu!");
    }
}
