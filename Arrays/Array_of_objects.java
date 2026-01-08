class toys{
    public int toyNumber;
    public String toyName;

    toys(int toyNumber, String toyName){
        this.toyNumber=toyNumber;
        this.toyName=toyName;
    }
}
public class Array_of_objects{
    public static void main(String[] args) {
        toys[] arr;//this is an array of objects i.e it's type is toys
        arr = new toys[4];
        arr[0]= new toys(1, "Car");
        arr[1]= new toys(2, "Doll");
        arr[2]= new toys(3, "Kitty");
        arr[3]= new toys(5, "Puppy");

        for (int i=0; i<arr.length; i++){
            System.out.println("Toy Number: "+ arr[i].toyNumber + " Toy Name: "+ arr[i].toyName);
        }
    }
}