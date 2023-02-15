public class Assessments {

    Integer exam;
    Integer quiz;
    Integer test;
    Integer essay;

    public Assessments(Integer exam, Integer quiz, Integer test, Integer essay) {
        this.exam = exam;
        this.quiz = quiz;
        this.test = test;
        this.essay = essay;
    }
    public int getSumUp() {
        return exam + quiz + test + essay;

    }

    @Override
    public String toString() {
        return  exam + ", " + quiz + ", " + test + ", " + essay;
    }
}


