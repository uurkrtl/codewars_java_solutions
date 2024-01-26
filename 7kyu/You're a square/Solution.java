-- Created by Ugur Kartal

public class Square {
    public static boolean isSquare(int n) {
        if(n<0){
            return false;
        }else{
            for(int i = 0; i<=n; i++){
                int result = i*i;
                if(result == n){
                    return true;
                } else if (result>n) {
                    return false;
                }
            }
        }
        return false;
    }
}