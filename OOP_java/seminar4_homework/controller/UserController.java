package seminar4_homework.controller;

import seminar4_homework.model.User;

import java.util.List;

public interface UserController<T extends User>  {

    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAllUsersSortedByFirstName();
    List<T> getAllUsersSortedByLastName();
    List<T> getAllUsersSortedByAge();
    List<T> getAllUsersSortedById();
    boolean remove(String fullName);
    List<T> getAll();
    void edit(String fullName, Integer age, String phoneNumber);


}
