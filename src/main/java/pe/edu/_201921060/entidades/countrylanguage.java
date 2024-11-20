package pe.edu._201921060.entidades;


import jakarta.persistence.*;

@Entity
public class countrylanguage {


    @Id
    private String Language;
    private Isofficial IsOfficial;
    private Double Percentage;

    @ManyToOne(cascade ={CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode",nullable = false)
    private country Country;

    public enum Isofficial {
        T, F;
    }

    public countrylanguage() {
    }

    public countrylanguage(String language, Isofficial isOfficial, Double percentage, country country) {
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
        Country = country;
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "Language='" + Language + '\'' +
                ", IsOfficial=" + IsOfficial +
                ", Percentage=" + Percentage +
                ", Country=" + Country +
                '}';
    }

    public country getCountry() {
        return Country;
    }

    public void setCountry(country country) {
        Country = country;
    }



    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public Isofficial getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(Isofficial isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }
}
