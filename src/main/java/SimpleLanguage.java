import com.intellij.lang.Language;

public class SimpleLanguage extends Language {
    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    protected SimpleLanguage() {
        super("Simple");
    }
}
