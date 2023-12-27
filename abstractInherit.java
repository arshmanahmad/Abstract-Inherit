
abstract class FirstClass{
    static int i = 5;
  
}
class SecondClass extends FirstClass{
    public static void main(String []args){
        System.out.println("This is the number" + i);
    }
}