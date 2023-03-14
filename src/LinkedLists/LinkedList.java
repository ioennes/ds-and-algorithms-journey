
public class LinkedList {
  public Node header;

  public LinkedList() {
    header = null;
  }

  public void add(Node n) {
    Node cur = header;
    if(header == null){
      header = n;
      return;
    }
    if(cur.next == null) {
      cur.next = n;
      return;
    }
    add(cur.next);
  }

  public void find()

  public void printElements() {
    Node p1 = header;
    while (p1 != null) {
      System.out.print(p1.age + " → ");
        p1 = p1.next;
      }
      System.out.print("null");
      System.out.println();
    }


  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.printElements();
    Node n = new Node(10);
    l.add(n);
    l.printElements();
  }

}
