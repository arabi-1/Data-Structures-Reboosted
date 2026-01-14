import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                // 2. Read array size
                int n = scanner.nextInt();
                int[] a = new int[n];
                
                // 3. Fill the array
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                
                // 4. Two Pointer Logic
                int left = 0;
                int right = n - 1;
                
                while (left <= right) {
                    if (left == right) {
                        // If both pointers hit the middle element (odd length)
                        System.out.print(a[left] + " ");
                    } else {
                        // Print left, then print right
                        System.out.print(a[left] + " " + a[right] + " ");
                    }
                    
                    // Move pointers inward
                    left++;
                    right--;
                }
                
                // Print a new line after each test case
                System.out.println();
            }
        }
        
        scanner.close();
    }
}