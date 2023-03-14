public class RecursionLab{
  public static int longestSubstring(String m, String s) {
    if(m.length() < s.length()) return 0;
    if(!(m.startsWith(s))) return longestSubstring(m.substring(1), s);
    if(!(m.endsWith(s))) return longestSubstring(m.substring(0, m.length() - 1), s);
    return m.length();
  }

  public static String parenthesis(String m) {
    if (m.length() < 1) return "Not found.";
    if (!(m.startsWith("("))) return parenthesis(m.substring(1));
    if (!(m.endsWith(")"))) return parenthesis(m.substring(0, m.length()-1));
    return m;
  }

  public static void main(String[] args) {
    System.out.println(longestSubstring("catcatdogcatcat", "dog"));
    System.out.println(parenthesis("ba(ll)ha"));
  }
}
