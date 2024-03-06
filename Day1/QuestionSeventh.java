public class QuestionSeventh {
    public static void main(String []args){
        int totalStudents = 90;
        int boys = 45;
        int boysWithGradeA = 20;
        int totalAgrades = totalStudents / 2;
        int girlsWithAGrades = totalAgrades - boysWithGradeA;
        System.out.println("Total no of girls getting grade 'A': " +girlsWithAGrades);

    }
}
