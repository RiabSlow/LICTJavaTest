/**
 * Created by Sakkar on 2/8/2017.
 */
public class TestAbstactAndInterface {
    //The main difference between the abstract class and interface is in abstract class there must be an abstract method.
    //in interface the methods can never have a body.
    public static void main(String[] args){
        InterfaceClass interfaceClass=new TestClass();
        System.out.println("Proect name :"+interfaceClass.projectName());

        TestAbstract testAbstract=new TestAbstract();
        testAbstract.setName("Abstract");
        System.out.println("Proect name :"+testAbstract.name());
    }
}
