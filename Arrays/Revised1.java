class animals {
    public int rollNumber;
    public String name;

    animals(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }
}
public class Revised1{
    public static void main(String[] args){
        animals [] list = new animals[5];
        list[0]= new animals(1, "Kitty");
        list[1]= new animals(2, "Birdy");
        for (int i=0; i<list.length; i++){
            System.out.println("The roll number of animal is " + list[i].rollNumber+ ", and the name of animal is "+ list[i].name);
        }
    }
}