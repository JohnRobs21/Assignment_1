package model;

public final class Article {
    private final String id;
    private final String title;
    private String abstractText;
    private final boolean computer;
    private final boolean physics;
    private final boolean statistics;
    private final boolean mathematics;
    private final boolean quantitativeBiology;
    private final boolean quantitativeFinance;

    public Article(boolean quantitativeFinance, boolean quantitativeBiology, boolean mathematics, boolean statistics, boolean physics, boolean computer, String abstractText, String title, String id) {
        this.quantitativeFinance = quantitativeFinance;
        this.quantitativeBiology = quantitativeBiology;
        this.mathematics = mathematics;
        this.statistics = statistics;
        this.physics = physics;
        this.computer = computer;
        this.abstractText = abstractText;
        this.title = title;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public boolean isComputer() {
        return computer;
    }

    public boolean isPhysics() {
        return physics;
    }

    public boolean isStatistics() {
        return statistics;
    }

    public boolean isMathematics() {
        return mathematics;
    }

    public boolean isQuantitativeBiology() {
        return quantitativeBiology;
    }

    public boolean isQuantitativeFinance() {
        return quantitativeFinance;
    }

    @Override
    public String toString() {
        return id + " - " + title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Article article = (Article) obj;
        return id.equals(article.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
