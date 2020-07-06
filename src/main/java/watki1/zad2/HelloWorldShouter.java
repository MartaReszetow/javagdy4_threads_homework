package watki1.zad2;

public class HelloWorldShouter implements Runnable {


    private String additionalText = "tekst";

    public void setAdditionalText(String additionalText) {
        this.additionalText = additionalText;
    }

       @Override
    public void run() {
        String exclamationMark = "!";
        String shoutedSentence = "Hello World";
        String currentlyShouted;
        for (int i = 0; i < 1000000; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shoutedSentence = shoutedSentence + exclamationMark;
            currentlyShouted = shoutedSentence + "-" + additionalText;
            System.out.println(currentlyShouted);

        }
    }
}
