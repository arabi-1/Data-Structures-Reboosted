public class square{
    public static void main(String[] args) {
        square(5);
        
    }
    public static void square(int sqr_size){
        for (int i=0; i<=sqr_size-1; i++){
            for (int j=0; j<=sqr_size-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}