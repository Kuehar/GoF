import factory.*;
import framework.Factory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: Java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: Java Main listFactory.Listfactory");
            System.out.println("Example 2: Java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink("朝日新聞","http://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞","http://www.yomiuri.co.jp");

        Link yahoo = factory.createLink("Yahoo!!","http://www.yahoo.com/");
        Link google = factory.createLink("Google","http://www.google.com/");

        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray traysearch = factory.createTray("サーチエンジン");
        traysearch.add(yahoo);
        traysearch.add(google);

        Page page = factory.createPage("Link","kuehar");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}