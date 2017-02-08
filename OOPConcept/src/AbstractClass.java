/**
 * Created by Sakkar on 2/8/2017.
 */
public abstract class AbstractClass {  //Abstraction
    String name="Default Value";
    abstract void doSomething();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
