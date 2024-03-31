package Ex2;

import java.util.Observable;
import java.util.Random;

class Square extends Observable {
    private int x, y; // position
    private int speed; // speed of square

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private boolean moving; // flag to track if square is moving

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = new Random().nextInt(5) + 1; // random speed between 1 and 5
        this.moving = false;
    }

    public void move() {
        moving = true;
        while (x < 600) { // exit of enclosure
            x += speed;
            setChanged();
            notifyObservers();
            try {
                Thread.sleep(50); // delay for smooth animation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        moving = false;
    }

    public boolean isMoving() {
        return moving;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}