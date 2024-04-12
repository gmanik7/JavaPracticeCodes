package prp;

public class KangarooRobot {
    public static String moveKangarooBot(int maxX, int maxY, int minX, int minY, String startPosition, String instructions) {
        String[] startPos = startPosition.split(":");
        int x = Integer.parseInt(startPos[0]);
        int y = Integer.parseInt(startPos[1]);
        char direction = startPos[2].charAt(0);

        for (char instruction : instructions.toCharArray()) {
            if (isValidMove(x, y, direction, minX, minY, maxX, maxY)) {
                executeMove(instruction, x, y, direction);
            } else {
                break; // Stop processing instructions if an invalid move is encountered
            }
        }

        return String.format("%d:%d:%c:%s", x, y, direction, (isValidMove(x, y, direction, minX, minY, maxX, maxY)) ? "" : "ER");
    }

    private static boolean isValidMove(int x, int y, char direction, int minX, int minY, int maxX, int maxY) {

        switch (direction) {
            case 'E':
                return x + 1 <= maxX;
            case 'W':
                return x - 1 >= minX;
            case 'N':
                return y + 1 <= maxY;
            case 'S':
                return y - 1 >= minY;
            default:
                return false;
        }
    }

    private static void executeMove(char instruction, int x, int y, char direction) {
        switch (instruction) {
            case 'J':
                moveForward(x, y, direction);
                break;
            case 'L':
                turnLeft(direction);
                break;
            case 'R':
                turnRight(direction);
                break;
            case 'H':
                // Handle additional instructions if needed
                break;
        }
    }

    private static void moveForward(int x, int y, char direction) {
        switch (direction) {
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
        }
    }

    public static void turnLeft(char direction) {
        switch (direction) {
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
        }

    }

    public static void turnRight(char direction) {
        switch (direction) {
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
        }
    }

    public  static void main(String[] args) {
        int maxX = 8;
        int maxY = 10;
        int minX = -5;
        int minY = -8;
        String startPosition = "2:2:E";
        String instructions = "LRJR";

        String result;
        result = moveKangarooBot(maxX, maxY, minX, minY, startPosition, instructions);

        System.out.println("Actual Output: " + result);

    }
}


