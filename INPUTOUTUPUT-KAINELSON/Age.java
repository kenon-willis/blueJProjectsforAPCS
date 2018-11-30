import javax.swing.JOptionPane;
/**
 * Write a description of class Age here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Age
{
    public static void Main(){
    String ageS = JOptionPane.showInputDialog("What is your age");
    int age= Integer.parseInt(ageS);

    if (age>=16)
    {
        System.out.println("You can drive");
    }else{
        System.out.println("You cannot drive");
    }

    

}
}
