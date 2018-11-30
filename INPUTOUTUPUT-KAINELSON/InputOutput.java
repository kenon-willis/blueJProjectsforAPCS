import javax.swing.JOptionPane;

public class InputOutput
{
    public static void main() {
       String user = JOptionPane.showInputDialog("Please enter your username and password");
        
           String pass = JOptionPane.showInputDialog("Please enter your password:");
           if (pass.equals("asdf")&&user.equals("Timmy")) {
       
               System.out.println(" You are in my guy ");

            }
            else
            {
       
                System.out.println(" You are not in my guy ");

            }
    
    }      
  
}


