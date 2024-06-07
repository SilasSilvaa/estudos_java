package classes.models;

public class Calc {

    public void sumVarArgs(int... nums){
        int sum = 0;

        for(int num: nums){
            sum += num;
        }

        System.out.println(sum);
    }
}
