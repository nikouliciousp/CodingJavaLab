package gr.aueb.cf.projects.wf6.flyweight;

import gr.aueb.cf.projects.wf6.flyweight.model.ImmutableCircle;
import gr.aueb.cf.projects.wf6.flyweight.model.ImmutablePoint;

import static gr.aueb.cf.projects.wf6.flyweight.model.FlyweightFactory.getCircle;
import static gr.aueb.cf.projects.wf6.flyweight.model.FlyweightFactory.getPoint;

public class Main {

    public static void main(String[] args) {

        ImmutablePoint pointOne = getPoint(1, 2);
        ImmutablePoint pointTwo = getPoint(1, 2);

        ImmutableCircle circleOne = getCircle(pointOne, 2);
        ImmutableCircle circleTwo = getCircle(pointTwo, 2);

        System.out.println(pointOne.convertToString());
        System.out.println(pointOne);
        System.out.println(pointTwo.convertToString());
        System.out.println(pointTwo);

        System.out.println(circleOne.convertToString());
        System.out.println(circleOne);
        System.out.println(circleTwo.convertToString());
        System.out.println(circleTwo);
    }
}
