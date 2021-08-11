package structural.adapter;

/**
 * @author trieutk
 */
public class Vietnamese {
    private Translator translator;

    public Vietnamese(Translator translator) {
        this.translator = translator;
    }

    public void say(String mess) {
        System.out.println("Vietnamese say: " + mess);
        translator.translate(mess);
    }
}
