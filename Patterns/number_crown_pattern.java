public class number_crown_pattern {
    public static void main(String[] args) {
        draw(10);
    }
    public static void draw(int size){
        int spaces = 2* (size -1);
        for (int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces = spaces-2;
        }
    }
    
}
