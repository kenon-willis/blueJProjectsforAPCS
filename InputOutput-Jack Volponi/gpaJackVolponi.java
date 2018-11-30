import javax.swing.JOptionPane;
public class gpaJackVolponi
{
    public static void main() 
    {
    
        String gpa = JOptionPane.showInputDialog("What is you Gpa?");
        Double gpaAsNumber = Double.parseDouble(gpa);
        if(gpaAsNumber > 5.0)
        {
            System.out.println("stop lying fake boi");    
        }
        if(gpaAsNumber <= 5.0 && gpaAsNumber >= 4.0)
        {
            System.out.println("Nice job you're a smart boi in aps");
        }
        if(gpaAsNumber < 4.0 && gpaAsNumber >= 3.0)
        {
            System.out.println("Nice job you're a smart boi");
        }    
        if(gpaAsNumber < 3.0 && gpaAsNumber >= 2.0)
        {
            System.out.println("you almost a smart boi. Come on you can do it!");
        }
        if(gpaAsNumber < 2.0 && gpaAsNumber > 0.0)
        {
            System.out.println("boi come on do some work it will help in the future");
        }
        if(gpaAsNumber <= 0.0)
        {
            System.out.println("stop lying fake boi");    
        }   
    
}
}
