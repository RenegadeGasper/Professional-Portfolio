import javax.swing.*; //Import the whole Swing Library that includes JFrame, JLabel and more!
import java.awt.*;

public class LearnSwingGUI 
{
    public static void main(String[] args)
    {
        //JFrame is a GUI window to add components into to show interactiveness with the user/coder

        JFrame frame = new JFrame(); //Creates a frame, you can also set the title here with double quotation inside the parenthesis
        frame.setTitle("JFrame Title goes here"); //Sets the Title of the Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allow to exit on application
        frame.setSize(420,420); //Set the size of the x-dimension and y-dimension of the frame 
        //frame.setResizable(false);     // If false you prevent the frame from being resized
        frame.setVisible(true);  //Make the Frame visible

        ImageIcon image = new ImangeIcon("Jean Gulag.png"); //Create an ImageIcon on the top left
        frame.setIconImage(image.getimage());   //Change icon of the frame
        frame.getContentPane().setBackground(Color.lightblue); //Change color of background
    }
}