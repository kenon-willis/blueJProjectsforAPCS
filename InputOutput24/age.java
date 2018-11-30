
import javax.swing.JOptionPane;

public class age
{
    public static void main (){
        String age= JOptionPane.showInputDialog("Please enter your age:");
        int x = Integer.parseInt(age);
        if(x >=16){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You Can't Drive");
        }
        
    }
        
        
   
}
