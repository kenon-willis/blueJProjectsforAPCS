
   import javax.swing.JOptionPane;

public class age
{
    public static void main() {
        String age = JOptionPane.showInputDialog("Please enter your age");
        int result = Integer.parseInt(age);
        if (result >= 16) {
        System.out.println("You can drive");
    }
    else {
        System.out.println("Nice bike!");
}
}
}


