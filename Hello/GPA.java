import javax.swing.JOptionPane;

public class GPA
{
    public static void main() {
        String gpa = JOptionPane.showInputDialog("Please enter your GPA");
        double gradepoint = Double.parsedouble( gpa );
        
        if (gradepoint >= 4.0) {
         System.out.println("Wow! That's awesome! You must've taken AP classes!");
        }    
        else 
    }
}
//above 4, you took ap class
//0-4 thanks but no cigar
// <0, not possible