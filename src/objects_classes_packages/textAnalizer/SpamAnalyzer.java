package objects_classes_packages.textAnalizer;

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
