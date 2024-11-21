package pe.edu._201921060.cruds;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu._201921060.entidades.city;
import pe.edu._201921060.entidades.country;
import pe.edu._201921060.entidades.countrylanguage;


import static pe.edu._201921060.entidades.countrylanguage.Isofficial.T;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p02");
        EntityManager em = emf.createEntityManager();

        country cont = new country("ASO","Pays","Europe","Europa",
                250.0,1650,1,10.1,500.0,500.0,"Pays","Republic","Moi",100,"TO");

        city v1 = new city(1,"Ville","Herat",1,cont);
        city v2 = new city(2,"Ville2","Herat",1,cont);
        city v3 = new city(3,"Ville3","Herat",1,cont);

        countrylanguage lang = new countrylanguage("Chino",T,90.0,cont);
        countrylanguage lang2 = new countrylanguage("Cantones",T,10.0,cont);

        em.getTransaction().begin();
        em.persist(cont);
        em.getTransaction().commit();
    }
}
