package logic;

/**
 * Created by Yevhen on 01.10.2015.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " : Gav!");
    }
}
