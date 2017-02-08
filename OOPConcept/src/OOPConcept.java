//class as encapsulated form
public class OOPConcept {
    public static void main(String[] args){
        MyClassTwo student1=new MyClassTwo();
        MyClassTwo student2=new MyClassTwo();
        MyClassTwo student3=new MyClassTwo();

        student1.setName("Sakkar");
        student2.setName("Ovi");
        student3.setName("Imam");

        student1.setRoll(1);
        student2.setRoll(2);
        student3.setRoll(3);

        AbstractClass abstractClass;
        abstractClass=student1;      //Polymorphism
        abstractClass.doSomething();
        abstractClass=student2;     //Polymorphism
        abstractClass.doSomething();
        abstractClass=student3;     //Polymorphism
        abstractClass.doSomething();
    }
}
