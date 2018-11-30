
public class Arrays2
{
    public static void main()
    {
        // declare an array of size 100 that holds 100 integers
        int[] myArray = new int[100];
        
        //store the contents of the array in a loop
        for(int i=0; i<myArray.length; i++){
            //store the array as multiples of six
            myArray[i] = i*5;
        }
        
        //for loop for values of myArray
        for(int i=0; i<myArray.length; i++){
            int m = i+1;
            System.out.println("Item " + i + " is " + myArray[i]);
        }
    }
}
