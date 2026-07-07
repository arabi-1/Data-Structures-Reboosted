public class right_angeled_num_triangel {
    public static void main(String[] args) {
        num_right_angle(5);
        
    }
    public static void num_right_angle(int size){
        // int count=1;
        for (int i=0; i<=size; i++){
            // System.out.print(i+1);
            for(int j=1; j<=i;j++){
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
    
}
