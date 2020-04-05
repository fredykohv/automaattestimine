package studcourse;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        Course c = new Course();

        c.setOop("Object Oriented Programming");
        c.setLinearAlgebra("Linear Algebra");
        c.setAutomationTesting("Automation Testing");

        c.setOopEAP(5);
        c.setLinearAlgebraEAP(10);
        c.setAutomationTestingEAP(12);

        s.setName("Fredy");
        s.setAge(19);
        s.setBirthYear(2000);
        s.setCourse("Automation Testing");

        System.out.println("-- Student information: --");
        System.out.println();
        System.out.println("Name is: " + s.getName());
        System.out.println(s.getName() + " age is: " + s.getAge());
        System.out.println(s.getName() + " birth year is: " + s.getBirthYear());
        System.out.println(s.getName() + " goes to " + s.getCourse() + " course!");
        System.out.println();
        System.out.println("-- Course information: --");
        System.out.println();
        System.out.println(c.getOop() + " course EAP value is: " + c.getOopEAP());
        System.out.println(c.getLinearAlgebra() + " course EAP value is: " + c.getLinearAlgebraEAP());
        System.out.println(c.getAutomationTesting() + " course EAP value is: " + c.getAutomationTestingEAP());
    }

}
