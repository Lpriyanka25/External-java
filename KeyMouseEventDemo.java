import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyMouseEventDemo extends JFrame implements KeyListener, MouseListener {
    private JLabel keyLabel;
    private JLabel mouseLabel;

    public KeyMouseEventDemo() {
        setTitle("Key and Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        keyLabel = new JLabel("Press a key on the keyboard.");
        mouseLabel = new JLabel("Perform a mouse action.");

        keyLabel.setPreferredSize(new Dimension(350, 30));
        mouseLabel.setPreferredSize(new Dimension(350, 30));

        add(keyLabel);
        add(mouseLabel);

        // Add KeyListener to the JFrame
        addKeyListener(this);

        // Add MouseListener to the JFrame
        addMouseListener(this);

        setVisible(true);
        setFocusable(true);
        requestFocusInWindow();
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyLabel.setText("Key Released: " + e.getKeyChar());
    }
