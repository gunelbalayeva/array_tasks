package array_task;
public class Task_3 {
    public static void main(String[] args) {
        String after =" After:  VeRiLen SoZ sIRaLarI";
        String words="Before: VeRiLen SoZ sIRaLarI ";
        boolean space =true;
        String s, str2=" ";
     for (int i=0; i<words.length(); i++){
         s = words.substring(i,i+1);
         if (space) s=s.toUpperCase();
         else s = s.toLowerCase();
         str2 = str2+s;
         if (s.equals(""))space = true;
         else space = false;
     }
        System.out.println(after);
        System.out.println(str2);

    }
}
