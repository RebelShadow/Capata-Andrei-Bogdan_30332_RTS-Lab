package Ex2;
// not working


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Main extends JFrame implements KeyListener {
    private Square square1, square2, square3;
    private SquareView squareView1, squareView2, squareView3;

    public Main() {
        setTitle("Square Moving App");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        square1 = new Square(50, 100);
        square2 = new Square(50, 200);
        square3 = new Square(50, 300);

        squareView1 = new SquareView(square1);
        squareView2 = new SquareView(square2);
        squareView3 = new SquareView(square3);

        squareView1.setBounds(square1.getX(), square1.getY(), 20, 20);
        squareView2.setBounds(square2.getX(), square2.getY(), 20, 20);
        squareView3.setBounds(square3.getX(), square3.getY(), 20, 20);

        square1.addObserver(new SquareObserver(square1, squareView1));
        square2.addObserver(new SquareObserver(square2, squareView2));
        square3.addObserver(new SquareObserver(square3, squareView3));

        add(squareView1);
        add(squareView2);
        add(squareView3);

        addKeyListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 's') {
            Thread thread1 = new Thread(() -> square1.move());
            Thread thread2 = new Thread(() -> square2.move());
            Thread thread3 = new Thread(() -> {
                try {
                    thread1.join(); // wait for square 1 to finish moving
                    square3.move(); // then move square 3
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });

            thread1.start();
            thread2.start();
            thread3.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
