package pe.edu._201921060.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class countrylanguage {

    @Id
    private String CountryCode;
    private String Language;
    private Isofficial IsOfficial;
    private Double Percentage;

    public enum Isofficial {
        T, F;
    }

    public countrylanguage() {
    }

    public countrylanguage(String countryCode, String language, Isofficial isOfficial, Double percentage) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial=" + IsOfficial +
                ", Percentage=" + Percentage +
                '}';
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
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
