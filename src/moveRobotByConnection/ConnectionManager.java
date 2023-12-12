package moveRobotByConnection;

public class ConnectionManager implements RobotConnectionManager {


    @Override
    public RobotConnection getconnection() {
        try {
            return new Connection();
        } catch (RobotConnectionException e) {
            throw new RobotConnectionException("Not connected");
        }
    }
}
