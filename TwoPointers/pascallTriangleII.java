package TwoPointers;

import java.util.Arrays;
import java.util.List;

public class pascallTriangleII {
  public static void main(String[] args) {
    List<Integer> lst = getRow(3);
    System.out.println(lst);
  }

  public static List<Integer> getRow(int rowIndex) {
    Integer[] arr = new Integer[rowIndex + 1];
    Arrays.fill(arr, 0);
    arr[0] = 1;

    for (int i = 1; i <= rowIndex; i++)
      for (int j = i; j > 0; j--)
        arr[j] = arr[j] + arr[j - 1];
    return Arrays.asList(arr);

  }
}
