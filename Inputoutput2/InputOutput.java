import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main(){
        
        //comment, complier does not read this cuz its not a human
        //a winder that asks for the user's name
        String password = JOptionPane.showInputDialog("Why are The Frogs Gay?");
       
        if(password.equals("flouride in the water")) {
            System.out.println("Ur in");
            
        }
      
        else {
            System.out.println("Decline");
            System.out.println("Why are The Frogs Gay?");
        }
        
        
        
        
    }    
}    
