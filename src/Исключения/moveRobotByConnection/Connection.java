package Исключения.moveRobotByConnection;

public class Connection implements RobotConnection {
    @Override
    public void moveRobotTo(int x, int y) {
        try {

        } catch (RobotConnectionException e) {
            throw new RobotConnectionException("Not moved");
        }
    }

    @Override
    public void close() {
        try {
            
        } catch (RobotConnectionException e) {

        }
    }
}
