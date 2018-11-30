import javax.swing.JOptionPane;

public class RootsAndrewLuJackVolponi
{
   public static void main()
   {
       String a = JOptionPane.showInputDialog("What is a?");
       Double aNumber = Double.parseDouble(a);
       
       String b = JOptionPane.showInputDialog("What is b?");
       Double bNumber = Double.parseDouble(b);
       
       String c = JOptionPane.showInputDialog("What is c?");
       Double cNumber = Double.parseDouble(c);
    
       
       System.out.println ((-bNumber) + (Math.sqrt((bNumber * bNumber) - (4*aNumber*cNumber)) / (2*aNumber))) ;
       
       System.out.println ((-bNumber) - (Math.sqrt((bNumber * bNumber) - (4*aNumber*cNumber)) / (2*aNumber))) ;
       
   }
}
