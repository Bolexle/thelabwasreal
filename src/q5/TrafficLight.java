package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program creates a traffic light using Graphics, and then allows you
 * to switch between active colours by pressing a button</p>
 *
 * @author Alex Holmes
 * @version 1.0
 */
public class TrafficLight  extends JFrame {

    private JButton button;
    private int stat;
    private Color redOff, yellowOff, greenOff;
    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("Alex Holmes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton("Change");
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(new DrawingPanel());
        panel.setBackground(new Color(236, 118, 0));


        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
        redOff = new Color(62, 13, 13);
        yellowOff = new Color(70, 70, 10);
        greenOff = new Color(15, 70, 15);
        stat = 0;
        button.setActionCommand("change");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		if (stat == 0) {
            		stat = 1;
            		repaint();
            	}
            	
            	else if (stat == 1) {
            		stat = 2;
            		repaint();
            	}
            	
            	else if (stat == 2) {
            		stat = 0;
            		repaint();
            	}
        	}
        });
    }
    
    class DrawingPanel extends JPanel {
        public DrawingPanel() {
            setPreferredSize(new Dimension(150, 340));
            setBackground(new Color(193, 97, 0));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.black);
            g.fillRect(10, 10, 130, 320);
            
            if (stat == 0) {
            	g.setColor(redOff);
            	g.fillOval(30, 22, 90, 90);
            	g.setColor(yellowOff);
            	g.fillOval(30, 124, 90, 90);
            	g.setColor(Color.green);
            	g.fillOval(30, 228, 90, 90);
            }
            
            else if (stat == 1) {
            	g.setColor(redOff);
            	g.fillOval(30, 22, 90, 90);
            	g.setColor(Color.yellow);
            	g.fillOval(30, 124, 90, 90);
            	g.setColor(greenOff);
            	g.fillOval(30, 228, 90, 90);
            }
            
            else if (stat == 2) {
            	g.setColor(Color.red);
            	g.fillOval(30, 22, 90, 90);
            	g.setColor(yellowOff);
            	g.fillOval(30, 124, 90, 90);
            	g.setColor(greenOff);
            	g.fillOval(30, 228, 90, 90);
            }
            
            else {
            	g.drawString("notworking", 25, 25);
            }
        }
    } 
    
    
    
    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
