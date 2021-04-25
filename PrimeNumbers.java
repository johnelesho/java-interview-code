/**
 * PrimeNumbers
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        
        getAllPrime(8);
    }

    public static void getAllPrime (int n) {
        for (;n >= 1; n--)
    if (isPrime(n))
        System.out.println(n);
    }


private static boolean isPrime(int n) {
    for (int f = 2; f < n; f++) {
        if (isFactor(f, n))
            return false;
    }
    return true;
}

private static boolean isFactor(int factor, int number) {
    return number % factor == 0;
}
}


// public class PrimeNumbers {

//     public static void main(String[] args) {

//             //define limit
//             int limit = 100;

//             System.out.println("Prime numbers between 1 and " + limit);

//             //loop through the numbers one by one
//             for(int i=limit; i >= 1; i--){

//                     boolean isPrime = true;

//                     //check to see if the number is prime
//                     for(int j=2; j < i ; j++){

//                             if(i % j == 0){
//                                     isPrime = false;
//                                     break;
//                             }
//                     }
//                     // print the number
//                     if(isPrime)
//                             System.out.print(i + " ");
//             }
//     }
// }