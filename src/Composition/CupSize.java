package Composition;

public enum CupSize {
    Small("S",1.0),
    Medium("M",1.5),
    Large("L",2.0);
    String description;
    double priceCoefficient;

    CupSize(String description, double priceCoefficient) {
        this.description = description;
        this.priceCoefficient = priceCoefficient;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceCoefficient() {
        return priceCoefficient;
    }
}
