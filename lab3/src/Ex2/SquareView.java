package Ex2;

import javax.swing.*;
import java.awt.*;

class SquareView extends JPanel {
    private int squareSize = 20;
    private Square square;

    public SquareView(Square square) {
        this.square = square;
    }

    public void drawSquare(int x, int y) {
        this.repaint();
        square.setX(x);
        square.setY(y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(square.getX(), square.getY(), squareSize, squareSize);
    }
}

