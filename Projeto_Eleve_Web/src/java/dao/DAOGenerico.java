package dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DAOGenerico<T> {

    static EntityManager em = Persistence.createEntityManagerFactory("UP").createEntityManager();
    private Class classe;

    public DAOGenerico(Class classe) {
        this.classe = classe;
    }

    public void insert(T entidade) {
        em.getTransaction().begin();
        em.persist(entidade);
        em.getTransaction().commit();
    }

    public List<T> list(){
        return em.createQuery("SELECT e FROM " + classe.getSimpleName() + " e").getResultList();
    }
    
    public void remover(Integer id) {
        T e = obter(id);
        if (e != null) {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        }
    }
    
    public T obter(Integer id) {
        return (T) em.find(classe, id);
    }
    
    public void atualizar(T e){
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
    }
    
}
