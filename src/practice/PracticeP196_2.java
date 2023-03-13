package practice;

/**
 * 目标：输出第一个大于正整数n的素数
 *
 * 学习目标：如何判断素数，如何简化代码
 */
public class PracticeP196_2 {
    public static void main(String[] args){
        printZuiXiaoSuShu(15);
    }

    // 如果n+1是素数则渲染，不是则继续+1判断
    public static void printZuiXiaoSuShu(int n){
//  不够简练
//        while(true){
//            if(isSuShu(++n)){
//                System.out.println("最小素数为："+n);
//                break;
//            }
//        }
        while(!isSuShu(++n)){}   // 这个while和++n，相当于循环找大于n的最小素数
        System.out.println(n);
    }

    // 判断整数是否是素数
    public static boolean isSuShu(int n){
        for(int i = 2 ; i < n ; i++){
            if(n%i ==0) return false;
        }
        return true;
    }
}

