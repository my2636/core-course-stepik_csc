package objects_classes_packages.textAnalizer;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;
    public TooLongTextAnalyzer(int l) {
        this.maxLength = l;
    }
    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
