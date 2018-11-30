import javax.swing.JOptionPane;

public class Age
{
    public static void main(){
         String age = JOptionPane.showInputDialog("Please state your age:");
         
         //Integer is a class
         int ageAsNumber = Integer.parseInt (age);
      
         if ( ageAsNumber >= 16){
             System.out.println("You can drive");
         }
            else {
                System.out.println("You can't drive");
            }
}
}