package app.repo.user;

import app.model.User;

public interface UserService {
    User Add(User user);
    void Delete(int id);
}

