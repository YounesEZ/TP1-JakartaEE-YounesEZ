package ma.emsi.tp1ezbidayounes.llm;

public class RequeteException extends RuntimeException {
    public RequeteException(String message, String prettyPrinting) {
      super(message + "\n" + prettyPrinting);
    }
}
