package android.exemple.com.daddstories_0.data;

public class Story
{
    private String category;
    private String storyTitle;
    private int storyImgUrl;

    public Story(String category, String storyTitle, int storyImgUrl) {
        this.category = category;
        this.storyTitle = storyTitle;
        this.storyImgUrl = storyImgUrl;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public int getStoryImgUrl() {
        return storyImgUrl;
    }

    public void setStoryImgUrl(int storyImgUrl) {
        this.storyImgUrl = storyImgUrl;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
