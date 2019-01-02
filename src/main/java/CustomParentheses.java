public class CustomParentheses implements Parentheses {
    private String open;
    private String close;

    public CustomParentheses(String open, String close) {
        this.open = open;
        this.close = close;
    }

    @Override
    public String getOpen() {
        return open;
    }

    @Override
    public String getClose() {
        return close;
    }
}
