package Ex2;

import java.util.Observable;
import java.util.Observer;

class SquareObserver implements Observer {
    private Square square;
    private SquareView view;

    public SquareObserver(Square square, SquareView view) {
        this.square = square;
        this.view = view;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (square.isMoving()) {
            view.drawSquare(square.getX(), square.getY());
        }
    }
}