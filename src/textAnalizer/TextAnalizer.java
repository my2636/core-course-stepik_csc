package textAnalizer;

interface TextAnalizer {
    Label processText(String text);
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
}
