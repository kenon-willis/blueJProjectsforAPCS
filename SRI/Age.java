
import java.util.Scanner; 

public class Age
{
    public static void main(){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your age.");
        int i = reader.nextInt();
        
        if (i>=16){
            System.out.println("You are old enough to drive.");
        }
        else {
            System.out.println("You can't drive");
        }
    }
}
