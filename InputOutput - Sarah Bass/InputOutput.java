
import javax.swing.JOptionPane;

public class InputOutput
{
         public static void main(){
                  
                  //comment, compiler does not read this
                  //comments are for humans
                  //a window that asks for the users name
            String username = JOptionPane.showInputDialog("Please enter your username:");
                  
             if (username.equals("Sarah")) {
                //if username is correct it will lead to asking what the password is
                 
                 String password = JOptionPane.showInputDialog("Please enter your password:");
                
                  if (password.equals("fire1234")) {
                      System.out.println("Hello " + username);
                    }
                    else {
                        System.out.println("Access Denied");
                        
                        
                }
                
               
            }
                else {
                    //if the password is incorrect it will lead to the denial of access and saying the access s denied.
                    
                    System.out.println("Access Denied");
        }
    }
}