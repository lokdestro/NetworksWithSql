package app.repo.user;

import app.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserImpl implements UserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User Add(User user) {
        User newUser = User.builder()
                .user_id(user.getUser_id())
                .user_name(user.getUser_name())
                .age(user.getAge())
                .build();
        entityManager.persist(newUser);
        return newUser;
    }

    @Override
    public void Delete(int id) {
        entityManager.createQuery("DELETE FROM User u WHERE u.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
