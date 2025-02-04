package app.repo.group;

import app.model.Group;
import app.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class GroupImpl implements GroupService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public int Create() {
        Group group = new Group();
        entityManager.persist(group);
        return group.getId();
    }

    @Override
    public User[] Get(int groupId) {
        List<User> users = entityManager.createQuery(
                        "SELECT u FROM User u WHERE u.user_id = :groupId", User.class)
                .setParameter("groupId", groupId)
                .getResultList();

        return users.toArray(new User[0]);
    }

}
