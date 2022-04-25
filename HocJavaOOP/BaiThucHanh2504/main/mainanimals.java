package main;
import animals.tiger;
import animals.animal;
public class mainanimals {
    public static void main(String[] args) {
        animal anm = new tiger();
        anm.run();
        anm.eat();
        anm.sleep();
    }
}
