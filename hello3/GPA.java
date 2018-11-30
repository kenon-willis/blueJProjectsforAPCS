import javax.swing.JOptionPane;

public class GPA
{
    public static void main() {
        String gpa = JOptionPane.showInputDialog("Please enter your GPA");
        double gradepoint = Double.parseDouble( gpa );
        if (gradepoint >= 4.0) {
            System.out.println("Way to f l e x on us with that gpa");
        }
        else if (gradepoint >= 0.0) { //only runs if previous styatement is false
            //refers to gpa being about 0.0 but less than 4.0
            System.out.println("keep it up comrade");
        }
        else { // all conditions above were false
            System.out.println("u need more than a tutor m8");
        }
    }
}
