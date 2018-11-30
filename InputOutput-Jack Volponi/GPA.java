import javax.swing.JOptionPane;

public class GPA
{
    public static void main(){
    String GPA = Double.parseDouble(JOptionPane.showInputDialog("Please Enter GPA:"));
    if(GPA > 4.0){
        System.out.println("You are smart!!!!");
    }
    else if(4.0 > GPA >= 2.0){
        System.out.println("you have an okay GPA");
    }
    else{
        System.out.println("you suck");
    }
}
}
