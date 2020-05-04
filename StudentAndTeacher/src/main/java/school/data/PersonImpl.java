package school.data;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PersonImpl implements Person {

    public String name;
    public String surname;
    public String preferedName;
    public ZonedDateTime dateOfBirth;
    public Long age;

    public PersonImpl(String name, String surname, ZonedDateTime dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getFirstName() {
        return this.name;
    }

    @Override
    public String getLastName() {
        return this.surname;
    }

    @Override
    public String getPreferredName() {
        return this.preferedName;
    }

    @Override
    public ZonedDateTime getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public Long getAge() {
        return ChronoUnit.YEARS.between(this.dateOfBirth, ZonedDateTime.now());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, home!");

    }
}
