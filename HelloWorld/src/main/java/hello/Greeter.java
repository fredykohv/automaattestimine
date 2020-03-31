package hello;

public class Greeter extends Counter {
    public String sayHello() {
        String result = "Hello World!";
        return result;
    }

    public String sayHello(String name) {
        Counter count = new Counter();

        if (count.checkLength(name) < 5 || count.checkLength(name) > 15)
            return "Wrong! Your name consists less than 5 letters!";
        String length = "Hello, " + name + ", Your name consists of " + count.checkLength(name) + " letters!";
        return length;

    }

    public String sayHelloTwo(String surname) {
        Counter count = new Counter();

        if (count.checkLength(surname) < 4 || count.checkLength(surname) > 16)
            return "Wrong! Your surname consists less than 5 letters!";
        String lengthTwo = "Hello, " + surname + ", Your surname consists of " + count.checkLength(surname) + " letters!";
        return lengthTwo;
    }



}
