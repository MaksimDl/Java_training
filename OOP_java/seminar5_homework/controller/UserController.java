package seminar5_homework.controller;

import seminar5_homework.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(String fullName, Integer age, String phoneNumber, String nameGroup);
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    boolean removeUser(String fullName);
    List<T> getAll();
    List<T> getAllSortUsersByAge();
    int getMaxFullName();
    void buttonClickID();
    T getById(int hum);
}
