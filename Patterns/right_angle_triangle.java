public class right_angle_triangle {
    public static void main(String[] args) {
        triangel(5);
        
    }
    public static void triangel(int size){
        for (int i=0; i<=size; i++){
            System.out.print("*");
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
