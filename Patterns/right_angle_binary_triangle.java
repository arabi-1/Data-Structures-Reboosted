public class practice{
    public static void main(String[] args) {
        draw(5);
        
    }
    public static void draw(int size){
        int start;
        for(int i=0; i<size; i++){
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0; j<=i;j++){
                System.out.print(start);
                    start = 1-start;
            }
            System.out.println();
        }

    }
}