/**
 * Created by Sakkar on 2/8/2017.
 */
public class MyClassTwo extends AbstractClass { //inheritance

    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    void doSomething() {
        System.out.println(" "+getName()+" is at "+getRoll());
    }

}
