//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        sayHi(5);

    }

    public  static  void  sayHi(int n){
//        System.out.println("Hi!");
//        sayHi();
        if(n==0){
            System.out.println("Done!");
        } else {
            System.out.println("Hi");
            n--;
            sayHi(n);
        }
    }

    //Need a base case
}