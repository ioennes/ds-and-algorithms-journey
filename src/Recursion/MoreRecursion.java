import java.util.Arrays;

public class MoreRecursion {
  
  // countOccurences: return the number of times a character c occurs in a given string.

  public static int countOccurences(String s, char c) {
    if(s.length() == 0) return 0;
    if(s.charAt(0) == c) return 1 + countOccurences(s.substring(1), c);
    return countOccurences(s.substring(1), c);
  }

  // countSubstrings: return the number of times a substring occurs in a given string.
  

  public static int countSubstrings(String s, String sub) {
      if (s.length() < sub.length()) return 0;
      if (s.startsWith(sub)) return 1 + countSubstrings(s.substring(sub.length()), sub);
      return countSubstrings(s.substring(1), sub);
  }
  // partition: print k subsets that form a partition of a. Partitioning a set into k subsets
  // consists of finding k subsets of the set such that the union of these subsets is equal to
  // the entire set and their pairwise intersection is empty. {1, 2, 3} part 2 -> {1, 2}, {3}...

  // Start n at 0

public static void partition(int[] a, int k, int n) {
    if(k == 1) {
        for(int i = n; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return;
    }
    int size = (a.length - n) / k;
    for(int i = n; i < n + size; i ++) {
        System.out.print(a[i] + " ");   
    }
    System.out.println("UNION");
    partition(a, k - 1, n + size);
}


  // permute: print all possible permutations of the given character

  public static void permute(char[] a, int index_to_replace) { 
    if(index_to_replace == a.length - 1) {
      System.out.println(Arrays.toString(a));
      return;
    }
    for(int i = index_to_replace; i < a.length; i++) {
      char temp = a[index_to_replace];
      a[index_to_replace] = a[i];
      a[i] = temp;

      // keep permuting until we have one char at the end (base case)

      permute(a, index_to_replace + 1);

      // reset permutation to work with next char in the original array

      temp = a[index_to_replace];
      a[index_to_replace] = a[i];
      a[i] = temp;
    }
  }
  
  // greatNeighbor: print all elements in an array that are bigger than their neighbors where
  // the neighbors are the closest number to the left and/or right, if array empty, return null
  // if array has one element, return it, if 2, return greatest.
  
  public static void greatNeighbor(int[] a, int k) {
    if (a.length == 0) {
      System.out.println("null");
      return;
    }
    if (k == a.length) {
      return;
    }
    else if (a.length == 1) {
      System.out.println(a[0]);
      return;
    }
    else if (a.length > 1 && k == 0) {
      if (a[k] > a[k+1]) System.out.print(a[k] + " ");
      else System.out.println(a[k+1] + " ");
    }
    else if (k+1 == a.length - 1) {
      if (a.length > 1 && a[k+1] > a[k]) System.out.print(a[k+1] + " ");
      else System.out.println(a[k] + " ");
    }
    else if (k != 0 && k != a.length - 1 && a[k-1] < a[k] && a[k] > a[k+1]) System.out.print(a[k] + " ");
    if (k < a.length - 1 ) greatNeighbor(a, k+1);
  }

  public static void main(String[] args) {
    System.out.println("Occurences of s in lisps: " + countOccurences("lisps", 's'));
    System.out.println("Occurences of s in empty string: " + countOccurences("", 's'));

    System.out.println("Occurences of iss in Mississippi: " + countSubstrings("Mississippi", "iss"));
    System.out.println("Occurences of iss in empty string: " + countSubstrings("", "iss"));

    partition(new int[]{1, 2, 3, 4}, 2, 0);
    System.out.println();
    System.out.print("Permutations of abc: ");
    permute(new char[]{'a', 'b', 'c'}, 0);

    greatNeighbor(new int[]{9, 2, 1, 2, 1, 4, 3, 9, 2, 20, 3}, 0);
  }
}
