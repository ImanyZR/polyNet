package DataBase;

import java.util.List;

public interface StoryRepesotory {
    public void save(Story story);

    List<Story> findAll();
}
