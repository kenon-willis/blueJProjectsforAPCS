import javax.swing.JOptionPane; 
/**
 * Write a description of class Age here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Age
{
    public static void main () 
    {
        String age = JOptionPane.showInputDialog("Please enter your age to see if you are able to drive") ;
        int years = Interger.parseInt ( age ); 
        if (years >=16){
             System.out.println (" Yeah! You are able to drive") ;
            }
            else {
                System.out.println("Sad! You can't drive!") ;
            }
    
                    }
  
}
