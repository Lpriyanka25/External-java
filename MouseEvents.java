import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    private JTextArea textArea;

    // Constructor
    public MouseEvents() {
        // Set up the frame
        setTitle("Mouse Events Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        // Create content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // Create a text area
        textArea = new JTextArea();
        textArea.setEditable(false); // Make the text area non-editable
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        // Add mouse listener and motion listener to the text area
        textArea.addMouseListener(this);
        textArea.addMouseMotionListener(this);

        // Add text area to content pane
        JScrollPane scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        display("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        display("Mouse entered the text area.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        display("Mouse exited the text area.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        display("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        display("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        display("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        display("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    // Method to display messages in the text area
    private void display(String message) {
        textArea.append(message + "\n");
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEvents());
    }
}