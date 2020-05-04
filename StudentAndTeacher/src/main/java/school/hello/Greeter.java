package school.hello;

public class Greeter extends Counter {

    Counter count = new Counter();

    public String sayHello(String name) {
        int length;
        try {
            length = count.checkLength(name);
        } catch (Exception x) {
            String error = "Oopsie!";
            return error;
        }

        if (length == 1) {
            String shortName = name + ", You have a short name!";
            return shortName;
        } else if (length > 0 && length < 15) {
            return String.format("Hello, %s ! Your name is %d letters long", name, length);
        } else if (length == 16 || length == 17 ) {
            System.out.println("Ding ding ding! Your name is perfect!");
            return String.format("Ding ding ding! %s , Your name is perfect!", name, length);
        } else {
            String whoIs = "Who are you?";
            return whoIs;
        }
    }

}



    /*public String sayHello(String name) {
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
    }*/




