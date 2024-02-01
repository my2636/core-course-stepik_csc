package Исключения.moveRobotByConnection;

public class ConnectionManager implements RobotConnectionManager {


    @Override
    public RobotConnection getConnection() {
        try {
            return new Connection();
        } catch (RobotConnectionException e) {
            throw new RobotConnectionException("Not connected");
        }
    }
}
