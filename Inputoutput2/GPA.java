import javax.swing.JOptionPane;


public class GPA
{
    public static void main(){
        Double GPA= Double.parseDouble(JOptionPane.showInputDialog("Please Enter GPA"));
        
        if(GPA > 4.0){
        System.out.println("you must have taken an AP class and did well");
        }
        else if(GPA >=0.0)
        System.out.println("you have a valid Gpa");
        else{
        System.out.println("You screwed up");
    }
    System.out.println("thanks for using this");
}
}

        
