public class inverted_pyramid {
    public static void main(String[] args) {
        draw(5);
    }
    public static void draw(int size){
        for(int i=0; i<size; i++){    
            for(int j=0; j<i; j++){
                System.out.print("   ");
            }
            for(int k=0; k<2*size-(2*i+1); k++){
                System.out.print(" * ");
            }
            System.out.println();
            for(int l=0; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
