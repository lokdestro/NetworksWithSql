package app.repo.group;

import app.model.User;

public interface GroupService {
    int Create();
    User[] Get(int id);
}

