import Business.PublicationService;
import DataBase.InMemoryRepository;
import DataBase.Story;
import DataBase.StoryRepesotory;
import RestPolyNet.PostController;

import java.util.List;

public class main {
    public static void main(String[] args){

        StoryRepesotory storyRepository = new InMemoryRepository();
        PublicationService publicationservice = new PublicationService(storyRepository);
        PostController storyCotroller = new PostController(publicationservice);

        storyCotroller.share("Hello word");
        storyCotroller.share("Hello Marseille");

        List<Story> feed = publicationservice.fetchAll();
        for(Story s : feed){
            System.out.println(s.toString());
        }


    }
}
