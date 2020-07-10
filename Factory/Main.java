package Factory;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = Factory.create("Kuehar");
        Product card2 = Factory.create("くえはる");
        Product card3 = Factory.create("コーギー");
        card1.use();
        card2.use();
        card3.use();
    }
}