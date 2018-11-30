import javax.swing.JOptionPane;




public class InputOutput
{
    public static void main(){
        
        //comment, compiler does not read this
        //comments are for humans
        //a window thats asks for name
        String username = JOptionPane.showInputDialog("Please enter your username");
        String password = JOptionPane.showInputDialog("Please enter your password");
        
        
        if(username.equals("6789"))
        {
            
            if(password.equals("12345"))
                System.out.println("Access Granted");
                
            else {
                    System.out.println("Password incorect, Access Denied");
          
        }
        
       //System.out.println("Hello World " + password);
        
    }
}}