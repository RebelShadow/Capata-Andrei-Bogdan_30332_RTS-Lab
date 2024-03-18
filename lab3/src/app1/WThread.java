package app1;

public class WThread extends Thread{

    FileService service;

    public WThread(FileService service) {

        this.service = service;

    }

    public void run(){

        while(!Main.isStopThreads()){

            synchronized (this) {

                String msg =

                        String.valueOf(Math.round(Math.random() * 100));

                service.write(msg);

                try {

                    Thread.sleep(2000);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }
            }

        }

    }

}