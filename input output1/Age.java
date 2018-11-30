
import javax.swing.JOptionPane;

public class Age
{
    // instance variables - replace the example below with your own
    public static void main(){
           
        String age = JOptionPane.showInputDialog("How old are you?");
        
        //int x = Integer.parseInt(age);
        
      
        
        if(Integer.parseInt(age) >= 16){
             
           System.out.println("You are old eonugh to drive");
           
        }
        else {
            System.out.println("You are too young to drive");
        }

    }
}

