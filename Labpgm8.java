package pkg1;
class Outer1{
    void display(){
        System.out.println("outer class display method");
    }
    class Inner{
        void display(){
            System.out.println("inner class display method");
        }
    }
}
public class Labpgm8{
    public static void main(String[] args){
        String title0="Lab 8-Nested Class";
        String title1="Develop a java program to create an outer class with a function display";
        String title2="create another class inside the outer class named inner with a function called display";
        String title3="call the two functions in the main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=o1.new Inner();
        i1.display();
    }
    
}