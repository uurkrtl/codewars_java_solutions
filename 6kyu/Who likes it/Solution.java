-- Created by Ugur Kartal

class Solution {
    public static String whoLikesIt(String... names) {
        int likeCount = names.length;
        String message = "";
        switch (likeCount){
            case 0:
                message = String.format("no one likes this");
                break;
            case 1:
                message = String.format("%s likes this", names[0]);
                break;
            case 2:
                message = String.format("%s and %s like this", names[0], names[1]);
                break;
            case 3:
                message = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
                break;
            default:
                message = String.format("%s, %s and %d others like this", names[0], names[1], likeCount-2);
                break;
        }
        return message;
    }
}