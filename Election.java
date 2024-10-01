class student{
    String name;
    String post;
    public student(String name,String post){
        this.name=name;
        this.post=post;
    }
    public void displayCandidate()
    {
        System.out.println(name+" is running for "+post);
    }
}
class Elect{
    String post;
    student[] candidates;
    student winner;
    public Elect(String post,student[] candidates){
        this.post=post;
        this.candidates=candidates;
    }

    public void announce(){
        System.out.println("Election announced for:"+post);
        System.out.println("Candidates are:");
        for(student candidates:candidates){
            candidates.displayCandidate();
        }
    }
    public void voteAndSelectWinner(){
        System.out.println("voting done for"+candidates);
        winner=candidates[0];
    }
    public void announceResult(){
        System.out.println("the elected"+post+" is :"+winner.name);
    }
    }

public class Election {
    public static void main(String[] args){
        student[] presidentCandidates={new student("Anurag rao","president"),new student("Adithi rao","president")};
        student[] vpCandidates={new student("Bharat devadiga","vice president"),new student("sathwik kamath","vice president")};
        Elect presidentElection=new Elect("president",presidentCandidates);
        Elect vpElection=new Elect("vpresident",vpCandidates);
        presidentElection.announce();
        presidentElection.voteAndSelectWinner();
        presidentElection.announceResult();
        System.out.println();
        vpElection.announce();
        vpElection.voteAndSelectWinner();
        vpElection.announceResult();
    }  
    }
    

