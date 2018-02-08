import java.util.Arrays;

public class Program {
    public static void main(String args[]) {
        int[] numbers = new int[] {1,6,3,8,5};
        int[] figures = Arrays.copyOf(numbers, numbers.length);
        figures[2] = 30;

        System.out.println("figures[2] = " + numbers[2]);

        Arrays.sort(numbers);

      for (int i : numbers) {
          System.out.println(i);
      }

    }

}
