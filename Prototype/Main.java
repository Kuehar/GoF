import framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong!!!!!!!!!!!!!!!!!!!!",upen);
        manager.register("WARNING!WARNING!!",mbox);
        manager.register("SLAAAAAAASHH!!!!",sbox);
    }
    Product p1 = manager.create("Strong Message");
    p1.use("やあ、バーボンハウスだよ");
    Product p2 = manager.create("Warning box");
    p2.use("ここは危険だから");
    Product p3 = manager.create("slash box");
    p3.use("帰った方がいい");
}