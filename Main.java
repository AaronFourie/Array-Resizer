import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
//      Int array
//      Change the values as needed
	    int[] arr = {0,0,3,4,7,-10,78}; 

//      Set original array as resized array
//      Change the size parameter as needed 
	    arr = resize(arr, 3); 

//      Print resized array to console
        System.out.println("Resized Array size: " + arr.length + " | Elements : " + Arrays.toString(arr)); 
	}

    public static int[] resize(int[] arr, int capacity){
        if(capacity<=0){ //check for edge values
            return null; 
        }
        
        int[] temp = new int[capacity]; 
        int i = 0; //val to hold array index
        int dif = capacity-arr.length; 

        if(dif<=0){
           for(i=0; i<capacity; i++){
               temp[i] = arr[i];
           } 
        }
        else {    
            for(int a=0; a<arr.length; a++){
                temp[i] = arr[i];
                i++;
                if(dif>0){
                    temp[i] = 0; //asign default val;
                    dif--;
                }
            }
        }
        arr=temp;
        return arr;
    }
}