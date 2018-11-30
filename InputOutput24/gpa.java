
import javax.swing.JOptionPane;

public class gpa
{
    public static void main (){
        Float gpa=Float.parseFloat(JOptionPane.showInputDialog("Please enter your GPA"));
    
        if(gpa>=4.0){
            System.out.println("You must've taken AP classes");
        }
        else if(gpa>=0.0){//this only runs when the first "if" is false
        //this means GPA is between 0.0 and 4.0
        System.out.println("You have a valid gpa");
    }
    
      else{//means conditions above were false
            System.out.println(" Impossible!");
        }
        System.out.println("Thank you for using my program!!");
       
    
}
}
