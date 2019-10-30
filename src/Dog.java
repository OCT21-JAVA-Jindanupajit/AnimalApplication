public class Dog extends Animal{

    public Dog() {
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return "A dog is sleeping ...";
    }

    @Override
    public String eat() {
        return "A dog  is eating ...";
    }

    public String bark() {
        return "Wuff! ...";
    }
}
