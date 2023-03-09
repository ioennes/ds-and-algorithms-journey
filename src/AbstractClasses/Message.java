package AbstractClasses;

// An abstract class is a class that can be inherited, but not instantiated.

public abstract class Message {
    protected int sender;

    public Message(int sender) {
        this.sender = sender;
    }

    public abstract void play();            // Abstract methods have no body
}
