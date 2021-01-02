class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
       // robot.stepForward(); // your implementation here

        int x= robot.getX();
        int y= robot.getY();
        Direction d=robot.getDirection();

        int distansX=x-toX;
        int distansY=y-toY;
        if(distansY>0){
            while (robot.getDirection()!=Direction.DOWN){
                robot.turnLeft();
                // System.out.println("robot.turnLeft()");
            }
        }else
        if(distansY<0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
                // System.out.println("robot.turnLeft()");
            }

        }

        // System.out.println(robot.getDirection());

        for (int a = 0; a < Math.abs(distansY); a++) {
            robot.stepForward();
            //System.out.println("robot.stepForward()" + "x="+ robot.getX()+ " y="+ robot.getY());
        }

        if(distansX>0){
            while (robot.getDirection()!=Direction.LEFT){
                robot.turnLeft();
                //System.out.println("robot.turnLeft()");
            }
        }else
        if(distansX<0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
                // System.out.println("robot.turnLeft()");
            }

        }

        // System.out.println(robot.getDirection());

        for (int a = 0; a < Math.abs(distansX); a++) {
            robot.stepForward();
            //System.out.println("robot.stepForward()" + "x="+ robot.getX()+ " y="+ robot.getY());
        }


    }
}


//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}