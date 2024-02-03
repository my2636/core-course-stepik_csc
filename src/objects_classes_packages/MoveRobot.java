package objects_classes_packages;

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

    public static class Robot {

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

        int x = 0;
        int y = 0;

        Direction direction = Direction.LEFT;

        public Direction getDirection() {
            // текущее направление взгляда
            return direction;
        }

        public int getX() {
            // текущая координата X
            return  x;
        }

        public int getY() {
            // текущая координата Y
            return y;
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            switch (direction) {
                case UP ->
                        direction = Direction.LEFT;
                case LEFT ->
                        direction = Direction.DOWN;
                case DOWN ->
                        direction = Direction.RIGHT;
                case RIGHT ->
                        direction = Direction.UP;
            }
        }

        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            switch (direction) {
                case UP ->
                        direction = Direction.RIGHT;
                case RIGHT ->
                        direction = Direction.DOWN;
                case DOWN ->
                        direction = Direction.LEFT;
                case LEFT ->
                        direction = Direction.UP;
            }
        }

        public void stepForward() {
            switch (direction) {
                case UP ->
                        y++;
                case RIGHT ->
                        x++;
                case DOWN ->
                        y--;
                case LEFT ->
                        x--;
            }
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }
    }
}