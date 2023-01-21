package gr.aueb.cf.projects.wf6.instances.singleton.saint;

public class SaintGeorgeKnightEager {

    private static final SaintGeorgeKnightEager INSTANCE = new SaintGeorgeKnightEager();

    private SaintGeorgeKnightEager() {}

    public static SaintGeorgeKnightEager getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission() {
        System.out.println("Start Eager");
    }
}
