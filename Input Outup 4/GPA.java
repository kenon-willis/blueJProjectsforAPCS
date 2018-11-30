import javax.swing.JOptionPane;
public class GPA{
 public static void main(){
     String answer = JOptionPane.showInputDialog("Please enter your GPA");
     //asking for name
     
     double grade = Double.parseDouble(answer);
     //converting answer to a number variable
     
     if(grade <0){
          System.out.println("That's impossible!");
          
        }
     
        
     else if(grade <4){
          
              System.out.println("Nice");
            }
     else{
              System.out.println("You must have taken AP classes!");
            }
            
        
     
     
    }

}
