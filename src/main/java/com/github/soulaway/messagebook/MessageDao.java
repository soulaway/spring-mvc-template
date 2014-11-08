package com.github.soulaway.messagebook;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class MessageDao {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Message message) {
        em.persist(message);
    }
 
    // Retrieves all the guests:
    public List<Message> getAllMessages() {
    	TypedQuery<Message> query = em.createQuery(
            "SELECT m FROM Message m ORDER BY m.id", Message.class);
    	return query.getResultList();
    }
}