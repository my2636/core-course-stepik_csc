package Объекты_классы_пакеты.textAnalizer;

interface TextAnalyzer {
    Label processText(String text);
    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
}
