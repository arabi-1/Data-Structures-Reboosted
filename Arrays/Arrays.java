
public class Arrays{
    public static void main(String[] args) {
        int[] arr;
arr = new int[]{1,2,3,4,5,6,7,8,9,10};
arr[0]=90;
int n = arr.length;
System.out.println("Here are the elements of the array:");
for (int i = 0; i<n; i++){
    System.out.println(arr[i]);
}
System.out.println("The length of the array is "+ n);
    }
}