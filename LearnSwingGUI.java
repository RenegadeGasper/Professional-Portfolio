import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LearnSwingGUI 
{
    public static void main(String[] args)
    {
//--------- Chapter 1 -- JFrame ------------------------------------------------------------------------------------------
        //JFrame is a GUI window to add components into to show interactiveness with the user/coder
        JFrame frame = new JFrame(); //Creates a frame, you can also set the title here with double quotation inside the parenthesis
        frame.setTitle("JFrame Title goes here"); //Sets the Title of the Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allow to exit on application
        frame.setSize(420,420); //Set the size of the x-dimension and y-dimension of the frame 
        //frame.setResizable(false);     // If false you prevent the frame from being resized
        frame.setVisible(true);  //Make the Frame visible

        /* ImageIcon image = new ImageIcon("Jean Gulag.png"); //Create an ImageIcon on the top left
        frame.setIconImage(image.getImage());   //Change icon of the frame
        frame.getContentPane().setBackground(new Color(215,232,253)); //Change color of background
          */

//--------- Chapter 2 -- JLabel ------------------------------------------------------------------------------------------       
        JLabel label = new JLabel(); // Create a label
        label.setText("How fat is your shmeat?"); // Set text of label
        frame.add(label); // Adds it manually
        
        ImageIcon image = new ImageIcon("Jean Gulag.png");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(123,50,250)); // Set Font color
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // Set Font text
        label.setIconTextGap(-25); //Set Gap of text to image
        label.setBackground(new Color(215,232,253)); // Set Background color
        label.setOpaque(true); //Display Background Color

        Border border = BorderFactory.createLineBorder(Color.blue, 3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //Set Vertical Position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); //Set Horizontal Position of icon + text within label 


    }
}