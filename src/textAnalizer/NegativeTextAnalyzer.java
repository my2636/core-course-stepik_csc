package textAnalizer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String negativeText = ":(", negativeText1 = "=(", negativeText2 = ":|";

    @Override
    public String[] getKeywords() {
        return new String[] {negativeText, negativeText1, negativeText2} ;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
