package by.epam.unit03.student;


public class Student {

    private String fio;
    private int groupId;  //номер группы
    private int[] grades;// успеваемость



    Student(String fio, int group, int[] grades) {
        this.fio = fio;
        this.groupId = group;
        this.grades = grades;
    }

     String getFio() {
        return fio;
    }

    private void setFio(String fio) {
        this.fio = fio;
    }

    int getGroupId() {
        return groupId;
    }

    private void setGroup(int group) {
        this.groupId = group;
    }

    int[] getGrades() {
        return grades;
    }

    private void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", groupId=" + groupId +
                '}';
    }


}

