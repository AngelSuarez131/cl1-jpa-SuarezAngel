package pe.edu._201921060.cruds;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu._201921060.entidades.country;

public class JPAFind {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p02");
        EntityManager em = emf.createEntityManager();

        country cont = em.find(country.class,"PER");

        cont.getVilles().stream().filter(city -> city.getPopulation()>=700000).forEach(System.out::println);


    }
}
