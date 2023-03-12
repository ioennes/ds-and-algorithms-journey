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

  public static void permute(int[] a, int k) {
   return; 
  }

  // permute: print all possible permutations of the given character

  public static void permute(char[] a) {
    return;
  }
  
  // greatNeighbor: print all elements in an array that are bigger than their neighbors where
  // the neighbors are the closest number to the left and/or right, if array empty, return null
  // if array has one element, return it, if 2, return them.
  
  public static void greatNeighbor(int[] a) {
    return;
  }

  public static void main(String[] args) {
    System.out.println("Occurences of s in lisps: " + countOccurences("lisps", 's'));
    System.out.println("Occurences of s in empty string: " + countOccurences("", 's'));

    System.out.println("Occurences of iss in Mississippi: " + countSubstrings("Mississippi", "iss"));
    System.out.println("Occurences of iss in empty string: " + countSubstrings("", "iss"));
  }
}



