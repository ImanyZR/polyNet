package RestPolyNet;

import Business.PublicationService;
import DataBase.Story;

public class PostController {
    Story story;
    public PublicationService publicationService;
    public PostController(PublicationService publicationService){
        this.publicationService = publicationService;
    }

    public void share(String content) {
        story = new Story(content);
        publicationService.saveStory(story);
    }
}
