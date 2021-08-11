package structural.adapter;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Vietnamese vietnamese = new Vietnamese(new LanguageAdapter(new Japanese()));
        vietnamese.say("Xin chao");
    }
}
