package hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GreeterTest {

    @Mock
    private Counter count = new Counter();

    @InjectMocks
    private Greeter greeter = new Greeter();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void greets_only_unique_letter_name() {

        when(count.checkLength("ccc")).thenReturn(1);

        String result = greeter.sayHello("ccc");

        assertEquals("ccc, You have a short name!", result);
    }

    @Test
    public void greets_normal_name() {

        when(count.checkLength("ccc")).thenReturn(10);

        String result = greeter.sayHello("ccc");

        assertEquals("Hello, ccc ! Your name is 10 letters long", result);
    }

    @Test
    public void greets_almost_too_long_name() {

        when(count.checkLength("ccc")).thenReturn(14);

        String result = greeter.sayHello("ccc");

        assertEquals("Hello, ccc ! Your name is 14 letters long", result);
    }

    @Test
    public void greets_lucky_name() {

        when(count.checkLength("ccc")).thenReturn(16);

        String result = greeter.sayHello("ccc");

        assertEquals("Ding ding ding! ccc , Your name is perfect!", result);
    }

}
