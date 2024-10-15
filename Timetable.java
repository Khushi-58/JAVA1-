import java.util.List;
import java.util.ArrayList;
class Table{
    String dayofweek="Mon";
    String branch;
    String classsection;
    int period;
    String roomNo;
    boolean isLab=false;
    String faculty1;
    String faculty2;
    String subject1;
    String subject2;
    Table(String b1,String c,String r){
        this.branch=b1;
        this.classsection=c;
        this.roomNo=r;
    }
        public void printTable(){
        String classscection = null;
            System.out.println("this is time table for"+branch+"section"+classscection+"at"+roomNo);
        }
}

public class Timetable {
    public static void main(String[] args){
        System.out.println("time table");
        Table ttA=new Table("CSE","A","A203");
        Table ttB=new Table("CSE","B","A203");
        ttA.printTable();
        ttB.printTable();
        ttA.faculty1="khushi";
        ttA.faculty2="ananya";
        ttA.subject1="oopj";
        ttA.subject2="os";
        System.out.println(ttA.faculty1+"-"+ttA.subject1);
        System.out.println(ttA.faculty2+"-"+ttA.subject2);
    }
}
