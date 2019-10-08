package by.epam.unit03.student;


public class Main {
    public static void main(String[] args) {

        int[] grades = {5, 6, 8, 10, 3};
        int[] grades1 = {7, 6, 2, 10, 4};
        int[] grades2 = {8, 8, 8, 10, 8};
        int[] gradesCool = {9, 9, 10, 10, 10};
        int [] gradesPerfect = {10,10,10,10,10};
        int [] gradesGood = {9,9,9,9,9};


        Student st1 = new Student("Иванов А.А", 5, grades);
        Student st2 = new Student("Петров А.А", 20, gradesCool);
        Student st3 = new Student("Сидоров А.А", 15, gradesPerfect);
        Student st4 = new Student("Чехов А.П", 5, grades1);
        Student st5 = new Student("Менделеев С.А", 16, grades);
        Student st6 = new Student("Толстой А.В", 10, grades2);
        Student st7 = new Student("Иванов А.А", 2, grades);
        Student st8 = new Student("Миронв Ю.А", 10, gradesGood);
        Student st9 = new Student("Иванов А.А", 16, grades);
        Student st10 = new Student("Иванов А.А", 20, gradesCool);
        Student[] group = new Student[10];
        group[0] = st1;
        group[1] = st2;
        group[2] = st3;
        group[3] = st4;
        group[4] = st5;
        group[5] = st6;
        group[6] = st7;
        group[7] = st8;
        group[8] = st9;
        group[9] = st10;
        StudentLogic studentLogic = new StudentLogic();
        studentLogic.findStudentWithGoodGrades(group);

    }
}