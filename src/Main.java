import java.awt.*;
import java.awt.event.InputEvent;

public class Main {
    public static void main(String[] args) throws AWTException {
        wait(2500);
        for (int i = 0; i < 500; i++){ //i - amount of clicks
            mouseClick();
            wait(10);
        }
    }

    public static void wait(int x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) { //sleeps for 'x' amount of ms
            e.printStackTrace();
        }
    }

    public static void mouseClick() throws AWTException { // clicks using robot class
        Robot bot = new Robot();
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}