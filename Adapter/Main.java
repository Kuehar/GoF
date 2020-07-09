package Adapter;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Good Morning!!");
        p.printWeak();
        p.printStrong();
    }
}