public class passing_arrays_to_methods {
    public static void main(String[] args) {
        int []arr = {3,2,1};
        sum(arr);
    }
    public static void sum(int[] array){
    int sum = 0;
    for (int i=0; i<array.length; i++){
        sum = sum + array[i];
    }
    System.out.println("Here is the sum of all the values: "+ sum);
}


}