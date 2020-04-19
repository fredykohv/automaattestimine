public class Teacher extends PersonImpl{

    public String name;
    public String surname;
    public int age;

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Yo mama is so poor, that when I asked her to go to the bathroom, she gave me a shovel and said 'start digging!'");
    }

    @Override
    public String getFirstName() {
        return name;
    }
}