package gr.aueb.cf.projects.wf6.factory;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Point p1 = Point.getZeroPoint();
        Point p2 = Point.getRandomPoint();
        Thread.sleep(1);
        Point p3 = Point.getRandomPoint();
        Point p4 = Point.getSetPoint(3,5);

        System.out.println(p1.pointToString());
        System.out.println(p1.toString());
        System.out.println(p2.pointToString());
        System.out.println(p2.toString());
        System.out.println(p3.pointToString());
        System.out.println(p3.toString());
        System.out.println(p4.pointToString());
        System.out.println(p4.toString());
    }
}
