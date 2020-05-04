package school.data;

import java.time.ZonedDateTime;

public class Teacher extends PersonImpl {

    public Teacher(String name, String surname, ZonedDateTime dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Yo mama is so poor, that when I asked her to go to the bathroom, she gave me a shovel and said 'start digging!'");
    }

}