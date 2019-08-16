package dialog1;

import javax.swing.JOptionPane;

public class Dialog1 {

   
    public static void main(String[] args)
    {
        //JOptionPane.showMessageDialog(null, "welcome to java");
        String name = JOptionPane.showInputDialog("What is your name?");
        
        String message = 
                String.format("Welcome,%s, to java programming", name);
        JOptionPane.showMessageDialog(null,message);
    }
    
}
