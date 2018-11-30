

public class Array
{
    // instance variables - replace the example below with your own
    public static void main(){
        int [] myArray = new int[100];
        //System.out.println("The length of the array is " + myArray.length);
              
        for(int i=0; i<myArray.length; i++){
            
            myArray[i] = i*5;
                        
        }
        
        for(int i=0; i<myArray.length; i++){
            
            System.out.println("Item " + (i+1) + " is " + myArray[i]);
            
        }
    }
}

    

