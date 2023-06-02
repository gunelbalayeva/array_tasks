package array_task;

public class Task_5 {
    public static void main(String[] args) {
        int numbers[] = {100,20,30,5,2,-999,40,50,60,70};
        int bigNum= numbers [0], row=0;
        for (int i=0; i<numbers.length;i++) System.out.print(numbers[i]+" ");
        System.out.println();
        for (int i =0; i <  numbers.length;i++){
            if (numbers[i] < bigNum){
                bigNum=numbers[i];
                row=i;
            }
        }
        int smallNum= numbers [0], row1=0;
        for (int i =0; i < numbers.length;i++){
            if (numbers[i] < smallNum){
                bigNum=numbers[i];
                row1=i;
            }
        }
        int temp = numbers[row];//bigNum
        numbers[row]=numbers[row1];
        numbers[row1]=temp;
        for (int i=0; i<numbers.length;i++) System.out.print(numbers[i]+" ");
    }
}
