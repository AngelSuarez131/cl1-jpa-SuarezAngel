package pe.edu._201921060.entidades;

import jakarta.persistence.*;

@Entity
public class city {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Name;
    private String District;
    private Integer Population;

    @ManyToOne(cascade ={CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode",nullable = false)
    private country Country;

    public city() {
    }

    public city(Integer ID, String name, String district, Integer population, country country) {
        this.ID = ID;
        Name = name;
        District = district;
        Population = population;
        Country = country;
    }

    @Override
    public String toString() {
        return "city{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                ", Country=" + Country +
                '}';
    }

    public country getCountry() {
        return Country;
    }

    public void setCountry(country country) {
        Country = country;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }
}
