package AbstractClasses;

public class VoiceMsg extends Message {
    public VoiceMsg(int sender) {
        super(sender);
    }

    public void play() {
        System.out.println("This is a voice message.");
    }
}
