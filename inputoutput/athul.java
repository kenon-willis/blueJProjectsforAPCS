import javax.swing.JOptionPane;

public class athul
{
   
    public static void main(){
           String username=JOptionPane.showInputDialog("Username") ;
           String password=JOptionPane.showInputDialog( "please enter thy password:");
        
            if(password.equals("hello")){
        
               System.out.println("come on in");
        
           }else{
               System.out.println ("Stay Away");
            }
       }
        
    }

