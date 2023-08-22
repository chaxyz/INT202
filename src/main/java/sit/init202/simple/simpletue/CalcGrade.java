package sit.init202.simple.simpletue;

public class CalcGrade {
    private int score;

    public CalcGrade(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public  String getGrade(){
        if(this.score >= 80){
            return "A";
        }if(this.score >= 70){
            return "B";
        }if(this.score >= 60){
            return "C";
        }
        return "F";

    }
}
