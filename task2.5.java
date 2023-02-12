import java.util.*;
import java.util.Collections;

class ITGrades {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        grades.add(4);
        grades.add(3);
        grades.add(2);
        grades.add(1);
        grades.add(5);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(3);
        grades.add(5);
        grades.add(5);
        grades.add(4);
        grades.add(4);
        grades.add(2);
        grades.add(4);
        grades.add(5);
        grades.add(3);

        int sumOfGrades = 0;
        int maxGrade = Collections.max(grades);
        int minGrade = Collections.min(grades);

        for (Integer grade: grades) {
            sumOfGrades += grade;
        }

        int sumUp = sumOfGrades - (maxGrade + minGrade);
        int average = sumUp / grades.size();
        System.out.println(average);
    }
}