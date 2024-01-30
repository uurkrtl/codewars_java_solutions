-- Created by Ugur Kartal

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;

        if (walk.length != 10){
            return false;
        }

        for (char chr : walk){
            switch (chr){
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
            }
        }
        return x == 0 && y == 0;
    }
}