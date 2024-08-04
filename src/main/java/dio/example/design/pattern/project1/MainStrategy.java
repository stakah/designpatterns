package dio.example.design.pattern.project1;

import dio.example.design.pattern.project1.behavior.AggressiveBehavior;
import dio.example.design.pattern.project1.behavior.DefensiveBehavior;
import dio.example.design.pattern.project1.behavior.NormalBehavior;
import dio.example.design.pattern.project1.behavior.Robot;

public class MainStrategy {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.setBehavior(new NormalBehavior());
        robot.move();

        robot.setBehavior(new DefensiveBehavior());
        robot.move();

        robot.setBehavior(new AggressiveBehavior());
        robot.move();
    }
}
