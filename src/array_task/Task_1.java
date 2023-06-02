package array_task;

public class Task_1 {
    public static void main(String[] args) {
   int [] lessonNote = {51, 62,84,99,75, 88, 93, 96, 99,64,79 };
    int sum =0;
   for (int i =0; i < lessonNote.length; i++){
      sum = sum+lessonNote[i];
  }
   double avg = ( sum*1.0 )/ lessonNote.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}