public class Robot {

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