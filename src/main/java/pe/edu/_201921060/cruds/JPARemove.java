package pe.edu._201921060.cruds;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu._201921060.entidades.country;
import static pe.edu._201921060.entidades.country.Continent.EUROPE;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p02");
        EntityManager em = emf.createEntityManager();

        country c = em.find(country.class,"ASO");

        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }
}
