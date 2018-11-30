

public class FamilyArray
{
    public static void main()
    {
        String[] ageArray = {11, 14, 39, 42};
        
        ageArray[0] = "Diya";
        ageArray[1] = "Sri";
        ageArray[2] = "Mama";
        ageArray[3] = "Acha";
        
        for(int i=0; i<=ageArray.length; i++){
            System.out.println(ageArray[i] + " is " + i + " years old");
        }
        
        
    }
}
