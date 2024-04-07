import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    
//      Original integer array. Modify array values as needed
	    int[] arr = {0,0,3,4,7,-10,78};
	    
//      Set original array as resized array. Modify new array length parameter as needed
	    arr = resize(arr, 3);               

//      Print resized array to console
        System.out.println("Resized Array size: " + arr.length + " | Elements : " + Arrays.toString(arr)); 
	}

    public static int[] resize(int[] arr, int new_length){
        if(new_length<=0){                 //Check for edge values
            return null;                   //Stop method execution by returning null
        }
        
        int[] temp = new int[new_length];  //Initialize resized array with new length
        int dif = new_length-arr.length;   //Set difference between resize length and original array length
        int i;                             //Declare array index val
        
        if(dif<=0){                        //Check if difference <= 0
           for(i=0; i<new_length; i++){
               temp[i] = arr[i];           //If so, copy over original array until capacity val is reached
           } 
        }
        else {                             //If difference >0
            for(i=0; i<arr.length; i++){
                temp[i] = arr[i];          //Copy over original array until original array length is reached 
                if(dif>0){                 //If difference is still > 0
                    temp[i] = 0;           //Assign default val;
                    dif--;                 //Decrement difference after each of the non copied temp array values is asigned 
                }
            }
        }
        arr=temp;                          //Set original array as resized array
        return arr;                        //Return resized array
    }
}