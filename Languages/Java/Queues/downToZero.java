import java.io.*;
import java.util.*;

public class Solution {
  static int[] moves = new int[1000001];

  public static void main(String[] args) {
    for (int i = 1; i <= 1000000; ++i) {
      int least = moves[i - 1];
      for (int j = 2; j * j <= i; ++j) {
        if (i % j == 0) {
          least = Math.min(least, moves[i / j]);
        }
      }
      moves[i] = ++least;
    }
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t > 0) {
      System.out.println(moves[in.nextInt()]);
    }
  }
}
