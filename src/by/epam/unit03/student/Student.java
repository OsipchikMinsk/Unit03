package by.epam.unit03.student;


public class Student {

    private String fio;
    private int groupId;  //номер группы
    private int[] grades;// успеваемость

    public Student() {
    }

    public Student(String fio, int group, int[] grades) {
        this.fio = fio;
        this.groupId = group;
        this.grades = grades;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroup(int group) {
        this.groupId = group;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
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

