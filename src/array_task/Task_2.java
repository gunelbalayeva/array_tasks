package array_task;

public class Task_2 {

    public static void main(String[] args) {
        int [] numbers = {30, 56,56,75,95,100,30,80,50};
        int sum=0;
        int winNumber =0;
        double awg ;
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] >= 50 ){
             sum = sum + numbers[i];
             winNumber++;
            }
        }
       awg = 1.0 * sum /winNumber;
        System.out.println(awg);


    }


}
