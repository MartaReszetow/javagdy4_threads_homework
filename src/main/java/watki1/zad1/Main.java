package watki1.zad1;

public class Main {
    public static void main(String[] args) {

        Juhu juhu = new Juhu();
        Thread thread = new Thread(juhu);
        thread.start();
    }
}
