import java.util.Scanner;
public class Books {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int left=0;
        int max_books=0;
        
        int books_num= sc.nextInt();
       
        int minutes_for_book= sc.nextInt();
        int[] min_for_ith_book= new int[books_num];
        //inser the number of minutes for each book in the array
        
        for (int i=0; i<books_num; i++){
            min_for_ith_book[i]=sc.nextInt();
        }
        sc.close();
        //iterate over the loop to find the sum
        for (int j = 0; j<books_num; j++){
            sum= sum+ min_for_ith_book[j];
            while(sum>minutes_for_book){
                sum-=min_for_ith_book[left];
                left++;
            }
            if((j-left+1) > max_books){
                max_books=(j-left+1);
            }
          
        }

        // if(sum<=minutes_for_book){
        //     minutes_for_book=sum;
        // }
        
        System.out.print(max_books);
        
            

        

        // 



       

    }
    
}
