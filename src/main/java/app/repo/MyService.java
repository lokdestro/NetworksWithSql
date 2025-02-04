package app.repo;
import app.repo.group.*;
import app.repo.user.*;


public interface MyService {
    UserService User();
    GroupService Group();
}

