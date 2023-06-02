package array_task;

public class Task_4 {
    public static void main(String[] args) {

        int numbers[] = {100,20,30,5,2,-999,40,50,60,70};
        int bigNum= numbers [0], row=0;
        for (int i =0; i <  numbers.length;i++){
            if (numbers[i] < bigNum){
                bigNum=numbers[i];
                row=i;
            }
        }
        System.out.println("Largest number: "+bigNum);
        System.out.println("row: "+row);


    }
}
