public class MoveRobot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, -5, 98);
        System.out.println("Я смотрю сюда: " + robot.direction + ". Я пришел сюда: " + "{" + robot.x +
                "; " + robot.y + ";}");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // your implementation here
        if (robot.y < toY) {
            while (robot.direction != Robot.Direction.UP) {
                robot.turnRight();
                System.out.println("повернулся вправо");
            } if (robot.direction == Robot.Direction.UP) {
                while (robot.y < toY) {
                    robot.stepForward();
                    System.out.println("топ вверх.");
                }
            }
        }
        if (robot.x < toX) {
            while (robot.direction != Robot.Direction.RIGHT) {
                robot.turnRight();
                System.out.println("повернулся вправо");
            } if (robot.direction == Robot.Direction.RIGHT) {
                while (robot.x < toX) {
                    robot.stepForward();
                    System.out.println("топ вправо.");
                }
            }
        }
        if (robot.y > toY) {
            while (robot.direction != Robot.Direction.DOWN) {
                robot.turnRight();
                System.out.println("повернулся вправо");
            } if (robot.direction == Robot.Direction.DOWN) {
                while (robot.y > toY) {
                    robot.stepForward();
                    System.out.println("топ вниз.");
                }
            }
        }
        if (robot.y > toX) {
            while (robot.direction != Robot.Direction.LEFT) {
                robot.turnRight();
                System.out.println("повернулся вправо");
            } if (robot.direction == Robot.Direction.LEFT) {
                while (robot.x > toX) {
                    robot.stepForward();
                    System.out.println("топ влево.");
                }
            }
        }
    }
}