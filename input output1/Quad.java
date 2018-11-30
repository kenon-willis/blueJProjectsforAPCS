import javax.swing.JOptionPane;

public class Quad
{
    public static void main() {
        Double a = new Double(JOptionPane.showInputDialog("Enter value a in ax^2+bx+c"));
        Double b = new Double(JOptionPane.showInputDialog("Enter value b in ax^2+bx+c"));
        Double c = new Double(JOptionPane.showInputDialog("Enter value c in ax^2+bx+c"));
        System.out.println("The value of b squared is " + (b*b));
        System.out.println("The value of 4*a*c is " + 4*a*c);
        System.out.println("The value of the square root of the discriminant is " + Math.sqrt(b*b-(4*a*c)));
        if((b*b)-(4*a*c)<0) {
            System.out.println("We don't support imaginary roots");
        } else if((b*b)-(4*a*c)==0){
            System.out.println(("The root is " + (-b+Math.sqrt(b*b-(4*a*c)))/(2*a)));
        } else{
            System.out.println(("The first root is " + (-b+Math.sqrt(b*b-(4*a*c)))/(2*a)));
            System.out.println(("The second root is " + (-b-Math.sqrt(b*b-(4*a*c)))/(2*a)));
        }
    }
}
