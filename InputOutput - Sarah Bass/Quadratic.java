import javax.swing.JOptionPane;
public class Quadratic
{
  public static void main(){
      Double A = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for 'a':"));
      Double B = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for'b':"));
      Double C =  Double.parseDouble(JOptionPane.showInputDialog("Enter a value for'c':"));
      Double Bv2 = B * B;
      System.out.println("The value of b squared is " + Bv2);
      Double Av2 = 4*A*C;
      System.out.println("The value of 4*a*c is " + Av2);
      Double Cv2 = Math.sqrt(Bv2-Av2);
      System.out.println("The square root of b squared minus four times a times c is " + Cv2);
      System.out.println("The first root is " + (((B * -1) + Cv2)/(2*A)));
      System.out.println("The second root is " + (((B * -1) - Cv2)/(2*A)));
      
    }
}
