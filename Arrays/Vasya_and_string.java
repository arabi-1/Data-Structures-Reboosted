import java.util.Scanner;
public class Vasya_and_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        
        int n = sc.nextInt();
       
        int k = sc.nextInt();
        
        String s= sc.next();

        int answer_a = solve(n, k, s, 'a');
        int answer_b = solve(n, k, s, 'b');

        System.out.println(Math.max(answer_a, answer_b));
        sc.close();    
    }
    public static int solve(int n,int  k, String s, char target){
        int left =0;
        int wrong_account=0;
        int max_len=0;

        for (int j=0; j<n; j++){
            if (s.charAt(j)!=target){
                wrong_account++;
            }
            while(wrong_account>k){
                if (s.charAt(left)!= target){
                    wrong_account--; 
                }
                left++;
                

            }
            max_len=Math.max(max_len, j-left+1);
        }
            return max_len;
    }
}