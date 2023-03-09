package AbstractClasses;

import java.util.SortedMap;

public class Text extends Message {
    public Text(int sender) {
        super(sender);
    }

    public void play() {
        System.out.println("This is a text message");
    }
    public void charLength() {
        System.out.println("128");
    }
}
