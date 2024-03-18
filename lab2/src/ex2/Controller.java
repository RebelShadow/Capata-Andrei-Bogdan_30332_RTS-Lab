package ex2;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Controller extends Observable{

    Window window;
    public void start(int noOfThreads, int processorLoad) {
        window = new Window(noOfThreads);

        for (int i = 0; i < noOfThreads; i++) {
            Fir fir = new Fir(i, processorLoad);
            fir.addObserver(window);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread firThread = new Thread(fir);
            if (i + 2 > Thread.MAX_PRIORITY) {
                break;
            } else {
                firThread.setPriority(i + 2);
                firThread.start();
            }
        }
    }


}