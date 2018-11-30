import javax.swing.JOptionPane;

public class InputOutput
{
   public static void main(){
       String password = JOptionPane.showInputDialog("Please enter your password:");
       if (password.equals("Mickeymouse1234")) {
           System.out.println("Access Granted");
        }
        else {
            System.out.println("Access denied");
     
   
    }
}
}
