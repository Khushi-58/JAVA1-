class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    }
interface CanFly{
    void fly();
}
interface Canswim{
    void swim();
}
class Bird extends Animal implements CanFly,Canswim{
    public void fly(){
        System.out.println("birds are flying");
    }
    public void swim(){
        System.out.println("birds is swimming");
    }
    public void chirp(){
        System.out.println("birds is chirping");
        
    }
    
}
public class Testanimal {
    public static void main(String[] args){
        Bird bird=new Bird();
        bird.eat();
        bird.fly();
        bird.chirp();
        bird.swim();
        System.out.println("all actions are performed by the birds");
        
        
    }
    
}
