
import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main(){
        
        //comments are things that exist
        
        String username = JOptionPane.showInputDialog("Please enter your username:");
        
        if(username.equals("username")) {
         
           //System.out.println("Access Granted");
                  
           String password = JOptionPane.showInputDialog("Enter password:");
            if(password.equals("password")) {
                System.out.println("Access Granted");
        
        }
        else {
            System.out.println("Incorrect Password");
        }
    }
        else {
            System.out.println("Incorrect username");
        }
        
        
    }
}
