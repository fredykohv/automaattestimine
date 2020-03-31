package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GreeterTest {

    private Greeter greeter = new Greeter();

    String  name = "Fredy";
    int nameLength = 5;
    String surname = "Kohv";
    int surnameLength = 4;

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(name), containsString("Hello, " + name + ", Your name consists of " + nameLength + " letters!"));
        assertThat(greeter.sayHelloTwo(surname), containsString("Hello, " + surname + ", Your surname consists of " + surnameLength + " letters!"));
    }



}
