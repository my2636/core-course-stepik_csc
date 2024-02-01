package Объекты_классы_пакеты.textAnalizer;

public class Run implements TextAnalyzer {
    public static void main(String[] args) {

    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analizer : analyzers) {
            if (analizer.processText(text) == Label.SPAM) {
                return Label.SPAM;
            } else if (analizer.processText(text) == Label.NEGATIVE_TEXT) {
                return Label.NEGATIVE_TEXT;
            } else if (analizer.processText(text) == Label.TOO_LONG) {
                return Label.TOO_LONG;
            }
        }

        return Label.OK;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
