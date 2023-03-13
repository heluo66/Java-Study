package practice;

/**
 * 目标1：不使用递归，实现1~n的求和
 * 目标2：使用递归，实现1~n的求和
 *
 */

public class PracticeP206 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(cycle(n));
        System.out.println(recurrence(n));
    }

    // 目标1
    public static int cycle(int n){
        int res = 0;
        for(int i = 1;i<=n ;i++){
            res = res + i;
        }
        return res;
    }

    // 目标2
    public static int recurrence(int n){
        if(n<1) return 0;
        return n + recurrence(n-1);
    }
}
