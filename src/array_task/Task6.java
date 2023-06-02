package array_task;
public class Task6 {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 1, 2, 6, 7, 4};
        int min = arr[0];
        int index_min = 0;
        int index_max = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            } else if (arr[i] > max) {
                max = arr[i];
                index_max = i;
            }
        }
        int sum = 0;
        if (index_min < index_max) {
            for (int i = index_min + 1; i < index_max; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = index_max + 1; i < index_min; i++) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

