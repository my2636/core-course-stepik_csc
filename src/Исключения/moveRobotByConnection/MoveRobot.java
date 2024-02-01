package Исключения.moveRobotByConnection;

public class MoveRobot  {
    public static void main(String[] args) {
        RobotConnectionManager r = new ConnectionManager();
        moveRobot(r, 3, 4);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2){
                    throw new RobotConnectionException("Robot not moved");
                }
            }
        }
    }
}