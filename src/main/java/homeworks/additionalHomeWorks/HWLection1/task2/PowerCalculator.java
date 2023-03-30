package homeworks.additionalHomeWorks.HWLection1.task2;

public class PowerCalculator {
    public double degree(long a, int n){
        double sum = 1;
        for (int i = 1; i <=n ; i++){
            sum *= a;
        }
        return sum;
    }

    public Double degreeEasy(int a, int n){
        return Math.pow(a, n);
    }

}