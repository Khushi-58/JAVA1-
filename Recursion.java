class Factorial{
    int fact(int n){
        if(n==1)
            return 1;
        else
        int result=fact(n-1)*n;
        return result;  
}
}
public class Recursion {
    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println("FACTORIAL OF 3 is "+ f.fact(3));
        System.out.println("FACTORIAL OF 4 is "+ f.fact(4));
    }
    
}
