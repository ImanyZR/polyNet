package DataBase;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements StoryRepesotory {

    List<Story> database = new ArrayList<>();
    public void save(Story story) {
        database.add(story);
    }
    public List<Story > findAll(){
        return database;
    }

}
