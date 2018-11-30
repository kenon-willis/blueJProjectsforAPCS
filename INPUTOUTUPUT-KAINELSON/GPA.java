import javax.swing.JOptionPane;
/**
 * Write a description of class GPA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GPA
{
    public static void Main(){

    float gpa=0;
    boolean completed=true;
  while(true){
  try
  {
  String gpaS = JOptionPane.showInputDialog("What is your gpa");
  gpa= Float.parseFloat(gpaS);
  completed=true;
}
catch(NumberFormatException e)
{
    System.out.println("please enter a number");
     completed=false;
}
finally
{
    if(completed==true){
  if(gpa>=4){
      System.out.println("You are smart my dude");
    }else if(gpa>=3){
      System.out.println("You are average my dude");  
    }else if(gpa>=2){
        System.out.println("You are dumb my dude");
    }else if(gpa>=0){
         System.out.println("You are a neanderthal my dude");
    }else if(gpa<0){
        System.out.println("impossible");
    }
    break;
}
else
{
    
}
}

}
}
}
