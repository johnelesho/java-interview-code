import java.util.*;

public class SmallestPositive {
    public static void main(String[] args) {

        int[] num = {1,2,3};
        int[] num2 = {-1,3};

        
        System.out.println(SmallestPositive.solution(num));
        System.out.println(SmallestPositive.solution(num2));

    }

    public static int solution(int[] arr) {
        int smallestInt = 1; 
   
       if(arr.length == 0) return smallestInt;
   
       Arrays.sort(arr);
   
    //    if the first element after sort is greater than 1, we can safely return 1
       if(arr[0] > 1) return smallestInt;

    // if the last element after sort is less than 1, we can return 1
       if(arr[ arr.length - 1] <= 0 ) return smallestInt; 
   
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == smallestInt){ 
            smallestInt++;}    
       }
   
       return smallestInt;
   }
}
