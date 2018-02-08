public class wh_ile {
    public static void main(String args[]) {
        int[] j = new int[] {1,2,3,4,12,9};
        for (int i=0;i<j.length;i++) {
            if(j[i]>10)
               continue;
            System.out.println(j[i]);
        }
    }
}
