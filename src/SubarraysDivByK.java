        import java.util.Scanner;
public class SubarraysDivByK {
        static Scanner sc = new Scanner(System.in);

        public static int[] arrInput(int n){
                int[] arr = new int[n]; 
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                return arr;
        }

        public static int subArray(int[] arr,int k){
                int res = 0;
                for(int i=0; i<arr.length; i++){
                        int sum = 0;
                        for(int j = i; j<arr.length; j++){
                                sum += arr[j];
                                if(sum%k == 0){
                                        res++;
                                }
                        }
                }
                return res;
        }
        
        // TODO: Read n and k
        // TODO: Read array elements
        // TODO: Count and print the number of subarrays with sum divisible by k
        
        public static void main(String[] args) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = arrInput(n);
                System.out.println(subArray(arr, k));
        }
}
