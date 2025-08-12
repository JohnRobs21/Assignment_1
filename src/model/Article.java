package model;

public final class Article {
    private final int id;
    private final String title;
    private final String abstractText;
    private final int computer;
    private final int physics;
    private final int statistics;
    private final int mathematics;
    private final int quantitativeBiology;
    private final int quantitativeFinance;

    public Article(int id, String title, String abstractText, int computer, int physics, int statistics, int mathematics, int quantitativeBiology, int quantitativeFinance) {
        this.id = id;
        this.title = title;
        this.abstractText = abstractText;
        this.computer = computer;
        this.physics = physics;
        this.statistics = statistics;
        this.mathematics = mathematics;
        this.quantitativeBiology = quantitativeBiology;
        this.quantitativeFinance = quantitativeFinance;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public int getComputer() {
        return computer;
    }

    public int getPhysics() {
        return physics;
    }

    public int getStatistics() {
        return statistics;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getQuantitativeBiology() {
        return quantitativeBiology;
    }

    public int getQuantitativeFinance() {
        return quantitativeFinance;
    }

    @Override
    public String toString() {
        return id + " - " + title;
    }
}
