import javax.swing.*;

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

        /* ImageIcon image = new ImageIcon("Jean Gulag.png"); //Create an ImageIcon on the top left
        frame.setIconImage(image.getImage());   //Change icon of the frame
        frame.getContentPane().setBackground(new Color(215,232,253)); //Change color of background
          */
        JLabel label = new JLabel(); // Create a label
        label.setText("How fat is your shmeat?"); // Set text of label
        frame.add(label); // Adds it manually

        ImageIcon image = new ImageIcon("Jean Gulag.png");
        label.setIcon(image);

    }
}