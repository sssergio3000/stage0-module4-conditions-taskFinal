package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider==0){
            System.out.println("division by zero");
            return;
        }
        int res1 = dividend / divider;
        int res2 = res1 * divider;
        if(dividend==res2){
            System.out.println("can be divided completely");
        }
        else {
            System.out.println("cannot be divided completely");
        }


    }
}
