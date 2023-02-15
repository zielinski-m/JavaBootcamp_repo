import java.util.*;
import java.lang.*;

public class StudentFinalAssessment {
    public static void main(String[] args) {

        Student kid1 = new Student("Amy", "MacLeod", "3215648");
        Student kid2 = new Student("Matt", "Ellison", "4569812");
        Student kid3 = new Student("Hannah", "Harris", "1265743");
        Student kid4 = new Student("Paul", "Mills", "4531578");

        Assessments grades1 = new Assessments(3, 4, 4, 5);
        Assessments grades2 = new Assessments(5, 1, 2, 1);
        Assessments grades3 = new Assessments(6, 5, 5, 4);
        Assessments grades4 = new Assessments(2, 3, 3, 4);

        Map<Student, Assessments> averageGradeParams = new HashMap<>();

        averageGradeParams.put(kid1, grades1);
        averageGradeParams.put(kid2, grades2);
        averageGradeParams.put(kid3, grades3);
        averageGradeParams.put(kid4, grades4);

        for (Map.Entry<Student, Assessments> entry: averageGradeParams.entrySet()) {

            double size = averageGradeParams.values().size();
            double sum = entry.getValue().getSumUp();
            double score = sum / size;
            entry.getKey().removeContactNumber();
            System.out.println("The average assessment of " + entry.getKey() + " is " + score);
        }
    }
}

