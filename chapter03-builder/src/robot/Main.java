package robot;

import robot.Robot;
import robot.RobotBuilder;

public class Main {

    public static void main(String[] args) {

        // membuat casual robot menggunakan robot.RobotDirector
        Robot casualRobot = RobotDirector.getInstance().CasualRobot();
        System.out.println("Casual robot.Robot:");
        System.out.println(casualRobot);
        System.out.println();

        // membuat intelligent robot menggunakan robot.RobotDirector
        Robot intelligentRobot = RobotDirector.getInstance().IntelligentRobot();
        System.out.println("Intelligent robot.Robot:");
        System.out.println(intelligentRobot);
        System.out.println();

        // Buatlah robot kustom menggunakan robot.RobotBuilder secara langsung.
        RobotBuilder robotBuilder = new RobotBuilder();
        Robot customRobot = robotBuilder.brainchip("Rated-R Superstar").sword("Red Demon").gun("kamehameha gun").getResult();
        System.out.println("Custom robot.Robot:");
        System.out.println(customRobot);
    }
}