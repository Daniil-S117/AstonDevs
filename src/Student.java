package src;

import java.util.List;

// Класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }

    public Student(String name, String group, int course, List<Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int grade : grades) sum += grade;
        return sum / grades.size();
    }

    public void nextCourse() {
        this.course++;
    }
}
