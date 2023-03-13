package practice;

/**
 * 计算5的阶乘，需要创建方法，在main中调用
 *
 */

public class PracticeP193 {
    public static void main(String[] args) {
        int calcNumber =5;
        System.out.println( calcNumber + "的阶乘为：" + Calc.calcJieChen(calcNumber));
        System.out.println( calcNumber + "递归阶乘：" + Calc.improveJieChen(calcNumber));
    }

}

class Calc{
    // 循环实现：计算1~calcNumber的阶乘
    public static int calcJieChen(int calcNumber){
        int res = 1;
        for(int i=1;i<=calcNumber;i++){
            res = res * i;
        }
        return res;
    }

    // 递归实现：
    public static int improveJieChen(int calcNumber){
        if(calcNumber < 1) return 1;
        return calcNumber * improveJieChen(calcNumber-1);
    }
}
