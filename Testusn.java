


public class Testusn {
    public static void main(String[] args){
        for(int i=1;i<=10;i++)
        {
            String usn=String.format("4MW23CS%03d",i);
                    //%03d ensures 3 digit with leadingzeros
            System.out.println(usn);
        }
        }
            
    }
       
