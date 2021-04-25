public class Question2 {
    public static void main(String[] args) {

    }

    int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
        }

    void encodeArray(int *A, int *B, int n){
        for(int i=0;i<n;i++) {
         A[i] = encodeInteger(A[i], B[i]);
        }
        }
}
