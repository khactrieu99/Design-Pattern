package structural.adapter;

/**
 * @author trieutk
 */
public class LanguageAdapter implements Translator {
    private Japanese japanese;

    public LanguageAdapter(Japanese japanese) {
        this.japanese = japanese;
    }

    public void translate(String vietnamese) {
        String mess;
        switch (vietnamese) {
            case "Xin chao":
                mess = "Ajinomoto";
                break;
            default:
                mess = "Can not translate";
        }
        japanese.receive("translated: " + mess);
    }
}
