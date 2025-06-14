package g;


class Newones
{
	import javax.swing.*;
	import java.awt.event.*;

	public class SimpleEventListenerExample extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener 
	{
	    private JButton button;

	    public SimpleEventListenerExample() 
		{
	        setTitle("Simple Event Listener");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(null);

	        // Create a button and add ActionListener
	        button = new JButton("Click Me");
	        button.setBounds(100, 50, 100, 30);
	        button.addActionListener(this);
	        add(button);

	        // Add KeyListener, MouseListener, and MouseMotionListener to the JFrame
	        addKeyListener(this);
	        addMouseListener(this);
	        addMouseMotionListener(this);

	        // Ensure the JFrame is focusable for key events
	        setFocusable(true);
	        requestFocusInWindow();
	    }

	    // ActionListener method
	    @Override
	    public void actionPerformed(ActionEvent e) 
		{
	        System.out.println("Button clicked!");
	    }

	    // KeyListener methods
	    @Override
	    public void keyTyped(KeyEvent e) 
		{
	        System.out.println("Key typed: " + e.getKeyChar());
	    }

	    @Override
	    public void keyPressed(KeyEvent e) 
		{
	        System.out.println("Key pressed: " + e.getKeyChar());
	    }

	    @Override
	    public void keyReleased(KeyEvent e) 
		{
	        System.out.println("Key released: " + e.getKeyChar());
	    }

	    // MouseListener methods
	    @Override
	    public void mouseClicked(MouseEvent e) 
		{
	        System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    @Override
	    public void mousePressed(MouseEvent e) 
		{
	        System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    @Override
	    public void mouseReleased(MouseEvent e)
		{
	        System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) 
		{
	        System.out.println("Mouse entered the window");
	    }

	    @Override
	    public void mouseExited(MouseEvent e) 
		{
	        System.out.println("Mouse exited the window");
	    }

	    // MouseMotionListener methods
	    @Override
	    public void mouseDragged(MouseEvent e) 
		{
	        System.out.println("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
	    }

	    @Override
	    public void mouseMoved(MouseEvent e) 
		{
	        System.out.println("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
	    }

	    public static void main(String[] args) {
	        SimpleEventListenerExample example = new SimpleEventListenerExample();
	        example.setVisible(true);
	    }
	}
}