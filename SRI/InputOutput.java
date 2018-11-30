
import javax.swing.JOptionPane;

public class InputOutput
{
    public static void main(){

        

        //comment, compiler does not read this
        //comments are for humans
        //a window that asks for name of user

        String name = JOptionPane.showInputDialog("Please enter your username: ");
      
        if (name.equals("sri")){
            String password = JOptionPane.showInputDialog("Password: ");
            if (password.equals("meow")){
                System.out.println("access grant");
            }
                else{
                    System.out.println("nah");
                }
        } else{
            System.out.println("nah");
        }
            
        }
}


