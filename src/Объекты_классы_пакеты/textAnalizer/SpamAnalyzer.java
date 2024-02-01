package Объекты_классы_пакеты.textAnalizer;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] k) {
        this.keywords = k;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
