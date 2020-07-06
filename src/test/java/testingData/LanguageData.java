package testingData;

public enum LanguageData {
    ENG_COPYRIGHT("Copy rights are reserved Tadbeer - 2020"),
    AR_COPYRIGHT("جميع الحقوق محفوظة لشركة تدبير 2020");

    //
    private String name;

    private LanguageData(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
