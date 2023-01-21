package gr.aueb.cf.projects.wf6.singleton.coding;

public class Main {

    public static void main(String[] args) {
        CodingFactoryEager codingFactory = CodingFactoryEager.getInstance();
        CodingFactoryLazy codingFactoryLazy = CodingFactoryLazy.getInstance();

        codingFactory.sayHello();
        codingFactoryLazy.sayHello();
    }
}
