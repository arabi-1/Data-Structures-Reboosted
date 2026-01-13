import java.util.Scanner;
public class Seeraj_and_dima_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seerajTurn= true;
        int pickCard;
         int seeraj_sum=0;
         int diraj_sum=0;       
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0;
            int right = n-1;
           while(left<=right){
            if (arr[left]>arr[right]){
                pickCard=arr[left];
                left++;             
            }else{
                pickCard=arr[right];
                right--;
            }       
            if (seerajTurn==true){
                seeraj_sum+=pickCard;
            }else{
                diraj_sum+=pickCard;
            }
            seerajTurn=!seerajTurn;
        } 
        System.out.println(seeraj_sum+ " "+ diraj_sum);
        sc.close(); 
        }
        
    }
}
