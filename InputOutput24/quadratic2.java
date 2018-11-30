import javax.swing.JOptionPane;
public class quadratic2
{ public static void main(){
    int a =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'a'"));
    int b =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'b'"));
    int c =Integer.parseInt(JOptionPane.showInputDialog("Please enter value for 'c'"));
    
    int bsquared=b*b;
    System.out.println("b^2 is "+bsquared);
    int fourac=4*a*c;
    System.out.println("4*a*c is" + fourac);
    
    double math=Math.sqrt(bsquared-fourac);
    System.out.println("The square root part is"+ math);
    double root1=
   
    
}
}

