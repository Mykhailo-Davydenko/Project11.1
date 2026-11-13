import java.util.ArrayList;
public class StudentGrades {
    private  ArrayList<Double> grades = new ArrayList<>();
    public void addGrade (double grade){
        grades.add(grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()){
            return 0;
        }
            double sum = 0;
            for (double n: grades){
                sum += n;

            }
            return sum/grades.size();
    }
    public ArrayList<Double> getGradesAbove(double threshold) {
        ArrayList<Double> result = new ArrayList<>();
        for (double grade: grades){
            if (grade>threshold){
                result.add(grade);

            }

        }


        return result;
    }
    public void removeLowestGrade(){
        int n = grades.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (grades.get(j) > grades.get(j + 1)) {
                    double temp = grades.get(j);
                    grades.set(j, grades.get(j + 1));
                    grades.set(j + 1, temp);
                }
            }
        }
        grades.remove(0);


    }
    public void printGrades() {
        System.out.println("Grades: " + grades);
    }



}
