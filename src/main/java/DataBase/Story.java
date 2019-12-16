package DataBase;

public class Story {
    String story;

    public Story(String story){
        this.story = story;
    }

    @Override
    public String toString() {
        return "Story{" +
                "story='" + story + '\'' +
                '}';
    }
}
