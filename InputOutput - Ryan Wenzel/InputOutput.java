import javax.swing.JOptionPane;





/**
 * Write a description of class InputOutput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputOutput
{
    public static void main(){
        
        //comment, compiler doesn't read this
        //comments are for humans
        String username = JOptionPane.showInputDialog("Please enter your username:");
        String password = JOptionPane.showInputDialog ("Password");
        if(username.equals ("YaBoy") && password.equals("1"))
        {
            System.out.println("Access Granted");
            
        }
        else{
            System.out.println("Access Denied");
        }
        
       
}
}