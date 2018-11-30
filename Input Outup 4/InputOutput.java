import javax.swing.JOptionPane;
public class InputOutput
{
  public static void main()
  {
      //comment, compiler doesn't read this, comments are for humans
      //window that asks for user password
      String username = JOptionPane.showInputDialog("Please enter your username!");
      
    if(username.equals("mickeymouse1234"))
      {
      
      String password = JOptionPane.showInputDialog("Please enter password");
      if(password.equals("myers")){
          System.out.println("Access Granted");
        }
        else{
            System.out.println("Denied");
        }
    }
    else
    {
        System.out.println("Access Denied"); //only if password is wrong
    }
    

    }
}

