public class Mathoperations {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        Mathoperations mathops=new Mathoperations();
        System.out.println("Addition of two integers:"+mathops.add(10,20));
        System.out.println("addition of three integers:"+mathops.add(10,20,30));
        System.out.println("addition of two doubles:"+mathops.add(10,5,20));
    }
    
}
