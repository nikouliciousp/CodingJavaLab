package gr.aueb.cf.projects.wf6.singleton.saint;

public class Main {

    public static void main(String[] args) {
        SaintGeorgeKnightEager saintGeorgeKnightEager = SaintGeorgeKnightEager.getInstance();
        SaintGeorgeKnightLazy saintGeorgeKnightLazy = SaintGeorgeKnightLazy.getInstance();

        saintGeorgeKnightEager.embarkOnMission();
        saintGeorgeKnightLazy.embarkOnMission();
    }
}
