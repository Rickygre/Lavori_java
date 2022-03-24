
package it.tss.control;

import it.tss.entity.User;
import java.util.List;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author tss
 */
@RequestScoped
@Transactional(Transactional.TxType.REQUIRED)
public class UserStore {

    @PersistenceContext
    EntityManager em;
    
    public List<User> all() {
        return em.createQuery("select e from User e order by e.lastName")
                .getResultList();
    }

    public Optional<User> find(Long id) {
        User found = em.find(User.class, id);
        return found == null ? Optional.empty() : Optional.of(found);
    }
    
    public User save(User entity){
        User saved = em.merge(entity);
        return saved;
    }

    public void delete(Long id) {
        em.remove(em.getReference(User.class, id));
    }
}
