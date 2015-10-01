package logic;

/**
 * Created by Yevhen on 01.10.2015.
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " : Mew!");
    }
}
