package app.repo;

import app.repo.group.GroupService;
import app.repo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements MyService {
    private final GroupService group;
    private final UserService user;

    @Autowired
    public ServiceImpl(GroupService group, UserService user) {
        this.group = group;
        this.user = user;
    }

    @Override
    public UserService User() {
        return user;
    }

    @Override
    public GroupService Group() {
        return group;
    }
}
