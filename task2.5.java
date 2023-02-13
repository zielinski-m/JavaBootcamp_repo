import java.util.*;

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

    
        int maxGrade = grades.get(0);
        int minGrade = grades.get(0);
        int arrayLenght = grades.size();
        double sum = 0;

        for (int i = 0; i < arrayLenght; i++) {
            
            if(grades.get(i) < minGrade) {
                minGrade = grades.get(i);
            }
            if(grades.get(i) > maxGrade) {
                maxGrade = grades.get(i);
            }
            sum = sum + grades.get(i);
        }

        grades.remove(maxGrade);
        grades.remove(minGrade);
        System.out.println(grades.size());
        double average = sum / arrayLenght;
        System.out.println(average);
    }    
}