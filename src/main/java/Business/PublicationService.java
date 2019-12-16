package Business;

import DataBase.Story;
import DataBase.StoryRepesotory;

import java.util.List;

public class PublicationService  {
    private StoryRepesotory storyRepository;

    public PublicationService(StoryRepesotory storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void saveStory(Story story){
            storyRepository.save(story);
    }

    public List<Story> fetchAll() {
        return storyRepository.findAll();
    }
}
