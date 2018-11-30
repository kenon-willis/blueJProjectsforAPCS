import javax.swing.JOptionPane;
public class Age
{
   public static void main()
   {//ask for age
    String age = JOptionPane.showInputDialog("Please enter your age");
    int num = Integer.parseInt(age);
    
   if(num <16)
   {
        System.out.println("You cannot drive");
    }
    else {
        System.out.println("You can drive");
    }
}
}