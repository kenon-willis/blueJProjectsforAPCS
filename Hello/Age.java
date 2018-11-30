import javax.swing.JOptionPane;

public class Age
{
    public static void main() {
        String age = JOptionPane.showInputDialog("Please enter your age:");
        int years = Integer.parseInt( age );
       
        if (years >= 16){
            System.out.println("congratulations! you are of age to drive a car");
        }
        else {
            System.out.println("i'm sorry, it is illegal for you to drive.");
        }
    }

}

    
    //over 16, they can drive, under 16, can drive