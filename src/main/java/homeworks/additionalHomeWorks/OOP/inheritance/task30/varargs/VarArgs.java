package homeworks.additionalHomeWorks.OOP.inheritance.task30.varargs;

public class VarArgs {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        int s = varArgs.sumCalculate(1,2,3,4,5,6,7,8,9,10);
        System.out.println(s);
    }

    public int sumCalculate(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
