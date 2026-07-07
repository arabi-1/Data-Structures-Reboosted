public class right_angle_triangle_const_num {
    public static void main(String[] args) {
        right_angle(5);
        
    }
    public static void right_angle(int size){
        for(int i=0; i<=size; i++){
            for(int j=1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
