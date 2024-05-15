package robot;

public class RobotDirector {

    // Declare Singleton
    private static RobotDirector director = null;

    private RobotDirector() {}

    public static synchronized RobotDirector getInstance() {
        if (director == null) {
            director = new RobotDirector();
        }
        return director;
    }

    public Robot CasualRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("Dreamy-AI");
        builder.sword("Ambush Sword");
        builder.gun("M79");

        return builder.getResult();
    }

    public Robot IntelligentRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("AI-Nega");
        builder.shield("Underworld shield");
        builder.gun("AK-47 with Suppressor");
        builder.sword("Blade of Dark negarealism");

        return builder.getResult();
    }

    public Robot RereRobot() {
        RobotBuilder robotBuilder = new RobotBuilder();
        Robot bot = robotBuilder.brainchip("A5").gun("Cheytac").getResult();
        return bot;
    }

}