import javax.swing.JOptionPane;
//converting inputted numbers to their roots
public class FUNdamentals
{
   
    public static void main()
    {
        
        
        String a =JOptionPane.showInputDialog("Please give a value of 'a'");
        String b =JOptionPane.showInputDialog("Please give a value of 'b'");
        String c =JOptionPane.showInputDialog("Please give a value of 'c'");
        
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);
        
        System.out.print(B*B);
        double D = B*B;
        System.out.println(" is the value of b squared.");
        
        System.out.print(4*A*C);
        double E = 4*A*C;
        System.out.println(" is the value of 4ac");
        
        double N = D-E;
        
        if(N > 0){
        System.out.print(Math.sqrt(N));
        System.out.println(" is the value of b squared minus 4ac");
        
        double F = Math.sqrt(D-E);
        double G = -B+F;
        double T = G/2*A;
        System.out.print(T);
        System.out.println(" is the value of the first root");
    
       
        double I = -B-F;
        double M = I/2*A;
        System.out.print(M);
        System.out.println(" is the value of the second root");
    }
    else{
        System.out.println("Sorry, your discriminant is negative. We cannot process imaginary numbers now...");
    }
    
    
    }
}
