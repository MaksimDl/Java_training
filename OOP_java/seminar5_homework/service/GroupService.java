package seminar5_homework.service;

import seminar5_homework.model.StudyGroup;

public interface GroupService<T extends StudyGroup> {
    void createGroup(String nameGroup);
}
