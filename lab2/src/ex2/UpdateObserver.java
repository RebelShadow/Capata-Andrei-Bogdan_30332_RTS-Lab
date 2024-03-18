package ex2;

import java.util.Observable;

public class UpdateObserver extends Observable {
    public int id;
    public int progress;

    public int getId() {
        return id;
    }

    public int getProgress() {
        return progress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public UpdateObserver(int id, int progress) {
        this.id = id;
        this.progress = progress;
    }
}