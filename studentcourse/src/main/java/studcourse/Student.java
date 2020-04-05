package studcourse;

public class Student {

    private String name;
    private String course;
    private int age;
    private int birthYear;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setCourse(String newCourse) {
        course = newCourse;
    }

    public String getCourse() {
        return course;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setBirthYear(int newBirthYear) {
        birthYear = newBirthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
