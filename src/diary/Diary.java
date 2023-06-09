package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private int gistCounter;
    private  String username;
    private List<Gist> stories = new ArrayList<>();

    public Diary(String username, String password) {
        this.password = password;
        this.username =username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unLockWithPassword(String password) {
        if (password.equalsIgnoreCase(this.password))
            unLock();
    }

    private boolean unLock() {
        return isLocked = false;
    }

    public boolean lock() {
        return isLocked = true;
    }

    public void createAndAddGist(String title, String body) {
        if(isLocked == false){
        Gist gist = new Gist("latest on my blog", "So last time,we spoke about");
        stories.add(gist);
        gistCounter+=1;
        gist.setId(gistCounter);
    }}

    public int countNumberOfGists() {
        return stories.size();
    }

    public void delete(int id) {
        if(isLocked == false){
        for (Gist story : stories) {
           if (story.getId() == id) {
                stories.remove(story);
                break;

           }
        }}
    }

    public Gist findGistById(int id) {
        for (Gist story : stories) {
            if (story.getId() == id) {
                return story;
            }
        }
             return null;

    }

    public void updateDiary(int id, String title, String body) {
        if (!isLocked) {
            for (Gist story : stories) {
                if (story.getId() == id) {
                    story.setTitle(title);
                    story.setBody(body);
                }
            }
        }
    }


    public Gist findGistByBody(String body) {
        for (Gist story : stories) {
            if (story.getBody() == body) {
                return story;
            }
        }
        return null;

    }

}