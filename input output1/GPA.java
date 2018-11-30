
import javax.swing.JOptionPane;

public class GPA
{
    // instance variables - replace the example below with your own
    public static void main(){
        
        String gpa = JOptionPane.showInputDialog("What is your GPA?");
        
        
        float number = Float.valueOf(gpa);
        
        if(number>=4 && number<=5){
            System.out.println("You took honors");
        }
        else if(number<4 && number>0){
            System.out.println("Nice");
        }
        else{
            System.out.println("That is impossible");
        }
            

    
}
}
