public class Teststatic {
    static int a =a1();
    static{
        System.out.println("Inside static block");
    }
static int a1(){ 
    System.out.println("from a1");
    return 2;
}
public static void main(String args[]){
    System.out.println("a:"+a);
    System.out.println("from main");

}
}
