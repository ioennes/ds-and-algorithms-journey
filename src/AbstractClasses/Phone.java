package AbstractClasses;

public class Phone {

    public static void main(String[] args) {

        Message m = new Text(1);
        m.play();
        // m.charLength(); will fail because m is of declared type Message. The declared type
        //                 is all that matters at runtime. We have to cast.
        ((Text)m).charLength();

        VoiceMsg v = new VoiceMsg(2);
        m = v;
        m.play();
    }
}
