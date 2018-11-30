
import javax.swing.JOptionPane;

public class inputoutput24
{
    public static void main(){

        //comment, compiler does not read this
        //comments are for humans
        //a window that asks for user's name
        String username = JOptionPane.showInputDialog("Please enter your username:");
        
        if(username.equals("mickeymouse1234")){
          String password = JOptionPane.showInputDialog("Please enter your password:");
          if(password.equals("1234")){
              System.out.println("Access Granted");
            }
            else{
            System.out.println("Access Denied");
        }
    }
}
}
