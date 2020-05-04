package school.data;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends PersonImpl {

    public List <Course> courses;

    public Student(String name, String surname, ZonedDateTime dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("The invention of a shovel was ground breaking!");
    }

    public List<String> showCourseTeachersNames(List<Course> courses) {
        this.courses = courses;

        List<String> nameOfTeachers = new ArrayList<String>();

        for(Course course : courses) {
            nameOfTeachers.add(course.getTeacher().getFirstName());
        }

        return nameOfTeachers;
    }

    public List<String> getAllTeacherNames() {
        return this.getCourses().stream().map(Course::getCourseName).collect(Collectors.toList());
    }

//    @Override
//    public String getFirstName() {
//        return String.format("school.data.Student first name: %s", name);
//    }
//
//    @Override
//    public String getLastName() {
//        return String.format("school.data.Student last name: %s", surname);
//    }
}
