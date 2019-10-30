public class Mouse extends Animal{

    public Mouse() {
        super();
    }

    @Override
    public String sleep() {
        return "A mouse sleeps quietly...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String die() {
        return "A mouse die!";
    }
}
