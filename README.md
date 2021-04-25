INTERVIEW QUESTIONS FOR A JAVA DEVELOPER
Question 1 
Write a simple Java function that given an array of N integers, return the smallest positive integer 
(greater than 0) that does not occur in A. For example, given A= [1,5,7,4,1,2] the function should 
return 3. 
- Given A = [1,2,3] the function should return 4 
- Given A = [-1, -3] the function should return 1 
i) Write an efficient algorithm for the following assumptions;
N is an integer within the range [1..100,000] 
each element of array A is an integer within the range [-1,000,000..1,000,000]
Question 2
Amaka is a little girl who loves playing with array. In her 10th birthday, she got two arrays as 
presents. Let’s call them A and B. Both arrays have the same size n and contains integers between 
0 to 30000.
Amaka’s hard-drive is almost full of presents and she barely has any space to keep the arrays. 
She discovered a brilliant function to merge the array into one:
int encodeInteger(int x, int n){
n = n<<(1<<(1<<(1<<1)));
x = x | n;
return x;
}
void encodeArray(int *A, int *B, int n){
for(int i=0;i<n;i++) {
 A[i] = encodeInteger(A[i], B[i]);
}
}Amaka passed A and B into the encodeArray function. After that she discarded array B and saved 
the modified version of array A in the hard-drive.
Now in her 15th birthday Amaka wants to play with those arrays again. She found the modified 
version of array A in the hard-drive but she forgot how to recover the original arrays from it.
Question 3
Write a JAVA program to generate Fibonacci series
Question 4
Write a Java program to print prime numbers between 1 and 100 backwardS