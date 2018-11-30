import javax.swing.JOptionPane;
/**
 * Write a description of class qaudraticFormula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class qaudraticFormula
{

    public static void Main(){
float a = Float.parseFloat(JOptionPane.showInputDialog("Enter a"));
float b = Float.parseFloat(JOptionPane.showInputDialog("Enter b"));
float c = Float.parseFloat(JOptionPane.showInputDialog("Enter c"));
System.out.println("b^2= "+(b*b));
System.out.println("4AC= "+(4*a*c));
System.out.println("b^2-4ac= "+(Math.sqrt((b*b)-(4*a*c))));




if (((b*b)-(4*a*c))>0){
System.out.println("the first two roots are");
System.out.println((-b)+"/"+ (2*a)+"+"+(Math.sqrt((b*b)-(4*a*c)))+"/"+(2*a));
System.out.println((-b)+"/"+ (2*a)+"-"+(Math.sqrt((b*b)-(4*a*c)))+"/"+(2*a));
System.out.println(((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a)));
System.out.println(((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a)));
}else{
    System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
    
}

}
}
