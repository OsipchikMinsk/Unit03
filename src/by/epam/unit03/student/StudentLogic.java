package by.epam.unit03.student;

import java.util.Arrays;

class StudentLogic {


    void findStudentWithGoodGrades(Student[] students) {
        for (Student s : students) {
            int[] grades = s.getGrades();
           boolean isAccepted = true;
            for(int grade : grades) {
                if (grade < 9 || grade > 10) {
                    isAccepted = false;
                    break;
                }
            }
            if (isAccepted) {
                System.out.println(s.getFio() + " " + s.getGroupId() + " " + Arrays.toString(grades));
            }
        }
    }
}
