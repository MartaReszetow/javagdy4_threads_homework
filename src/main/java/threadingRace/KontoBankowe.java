package threadingRace;

public class KontoBankowe {

    private double saldo = 0.0;
    private final Object lock = new Object();
    // LOCK - klucz który mają 2 operacje i dzieki temu czekają na siebie nawzajem,żeby operować na zsynchronizownaych danych

    // jeśli dopiszemy słówko synchronized do metody, to wyłącznie jeden wątek może wejść do metody
    public /*synchronized*/ void przelewPrzychodzacy(double kwota) {
        //sekcja krytyczna
        // synchronizacja wątków
        synchronized (lock) {
            saldo = saldo + kwota;
        }
    }

    public void przelewWychodzacy(double kwota) {
        synchronized (lock) {
            saldo = saldo - kwota;
        }
    }

    public void sprawdzSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
