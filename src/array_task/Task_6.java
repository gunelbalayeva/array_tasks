package array_task;
public class Task_6 {
    public static void main(String[] args) {
        int numbers[] = new int[]{16, 32, 56, 20, 40, 60, 56, 32};
        int bigNum = numbers[0], rowBig = 0;

        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > bigNum) {
                bigNum = numbers[i];
                rowBig = i;
            }
        }
        int smallNum = numbers[0], rowSmall = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <  smallNum) {
                smallNum = numbers[i];
                rowSmall = i;
            }
        }
        int sum = 0;
        if (rowSmall < rowBig) {
            for (int i = rowSmall + 1; i < rowBig; i++) {
                sum = sum + numbers[i];
            }
        } else for (int i = rowBig + 1; i < rowSmall; i++) {
            sum = sum + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println("Sum: " + sum);


        System.out.println(bigNum);
        System.out.println(smallNum);
    }
}
