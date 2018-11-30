import javax.swing.JOptionPane;

public class math
{
    public static void main() {
        String valuea = JOptionPane.showInputDialog("Please enter a integer for A");
        String valueb = JOptionPane.showInputDialog("Please enter a integer for B");
        String valuec = JOptionPane.showInputDialog("Please enter a integer for C");
        int a = Integer.parseInt( valuea ); // turns all input values into numbers
        int b = Integer.parseInt( valueb );
        int c = Integer.parseInt( valuec );
        
        // function variables
        int square = b * b;
        int partone = 4*a*c;
        int subtract = square - partone;
        double root = Math.sqrt(square - partone );
        double rootone = (-b + root)/(2*a);        
        double roottwo = (-b - root)/(2*a);
        
        //print system
        System.out.println( square + " is the squared value of b." );
        System.out.println( partone + " is the value of multplying 4 by a by c.");
        
        //determines if part one is negative
        
        if (subtract < 0) {
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
        }
        else {
            System.out.println( rootone + " is the value of a, b, & c with the entirety of the quadratic formlua, positivly.");
            System.out.println( roottwo + " is the value of a, b, & c with the entirety of the quadratic formlua, negatively.");        
        }
    }
}
