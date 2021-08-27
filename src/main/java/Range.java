public class Range {
    public final String text;

    public Range(String value) {
        this.text = value;
    }

    public boolean isStartWithInclusive() {
        return text.startsWith("[");
    }

    public int getStartInput() {
        int startIndex = 1;
        int lastIndex = 2;
        return Integer.parseInt(text.substring(startIndex, lastIndex));
    }

    public boolean isEndWithInclusive() {
        return text.endsWith("]");
    }

    public int getEndInput() {
        int startIndex = text.length() - 2;
        int lastIndex = text.length() - 1;
        return Integer.parseInt(text.substring(startIndex, lastIndex));
    }

}
