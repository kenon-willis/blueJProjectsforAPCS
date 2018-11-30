
import javax.swing.JOptionPane;

public class GPA
{
    public static void main(){
        
        //ask for gpa
        //parse(change from a String to a Double)
        Double gpa = Double.parseDouble(JOptionPane.showInputDialog("Please enter your GPA: "));
        
        if (gpa>4.0){
            System.out.println("You must have taken an AP class and did well!");
        }
        else if (gpa>=0){ //this only runs when the first if is false
            //this means gpa is between 0.0 and 4.0
            System.out.println("You have a valid GPA :)");
        }
        else { //shovel after elephant act; all conditions above are false
            System.out.println("Haha nice try.");
        }
        
        System.out.println("Thanks for using my GPA program.");
    }
}
