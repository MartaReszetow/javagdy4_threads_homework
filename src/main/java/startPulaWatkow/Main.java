package startPulaWatkow;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {


        // ExecutorService pulaWatków = Executors.newSingleThreadExecutor();
        // - pula składająca się z jednego wątku,który wykonuje krótkie zadania
        // - wątek żyje wiecznie

        //ExecutorService pulaWatków = Executors.newCachedThreadPool();
        // - pula składająca się ze zmiennej ilości wątków
        // - ilość wątków uzależniona jets od ilosci zadan - jak jest więcej zadań to dokłąda wątki - zasoby zwlaniają się jak nie są używane
        // - kryterium zabicia wątku - 60s nieaktywności


        // ExecutorService pulaWatków = Executors.newFixedThreadPool(5);
        // - stała iość wątków (5)
        // - nigdy nie umierają,(trzeba uśmiercić  pulę, żeby zamknac program)

        // ExecutorService pulaWatków = Executors.newScheduledThreadPool(2);
        // - pula wątków =2
        // - do wykonywania cyklicznych zadań


        ScheduledExecutorService pulaWatkow = Executors.newScheduledThreadPool(1);
        pulaWatkow.scheduleAtFixedRate(() -> {
                    System.out.println("Heloł!");
                },
                2L, // ile na początku czekamy
                1L, // co ile ma się wykonać
                TimeUnit.SECONDS);

    }
}
