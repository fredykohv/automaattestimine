package school.data;

import java.time.ZonedDateTime;

public interface Person {

    String getFirstName();

    String getLastName();

    String getPreferredName();

    ZonedDateTime getDateOfBirth();

    Long getAge();

    void sayHello();

}
