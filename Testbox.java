public class Testbox {
    public static int box=0;
        double width;
        double height;
        double depth;
    public Testbox(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
        box++;
    }
    public static int getbox(){
        return box;
    }
    public double calculateVolume(){
        return width*height*depth;
    }
    public static void main(String args[]){
        Testbox box1=new Testbox(3,4,5);
        System.out.println("Volume of box 1:"+box1.calculateVolume());    
        }
    }
    

