import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            
            int left = 0;
            int right = n - 1;
            
            
            
            while (left < right && s.charAt(left) != s.charAt(right)) {
                left++;   // Move start pointer forward
                right--;  // Move end pointer backward
            }
            
           
            int remainingLength = right - left + 1;
            
            // Output result
            System.out.println(remainingLength);
        }
        
        sc.close();
    }
}