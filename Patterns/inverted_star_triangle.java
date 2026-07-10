public class inverted_star_triangle {
    public static void main(String[] args) {
        draw(5);
        
    }
    public static void draw(int size){
        for (int i=0; i<size; i++){
            for (int j=size-1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}