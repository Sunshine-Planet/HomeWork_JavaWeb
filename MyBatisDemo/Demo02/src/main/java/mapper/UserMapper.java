package mapper;

import pojo.User;

public interface UserMapper {
    public User findUserById(int id);
    public Integer findUserTotal();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
}
