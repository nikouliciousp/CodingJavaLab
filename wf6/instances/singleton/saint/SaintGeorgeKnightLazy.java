package gr.aueb.cf.projects.wf6.instances.singleton.saint;

public class SaintGeorgeKnightLazy {
    private static SaintGeorgeKnightLazy INSTANCE = null;

    private SaintGeorgeKnightLazy() {

    }

    public static SaintGeorgeKnightLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SaintGeorgeKnightLazy();
        }
        return INSTANCE;
    }

    public void embarkOnMission() {
        System.out.println("Start Lazy");
    }
}
