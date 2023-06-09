package diary;

public class Gist {
    private String title;
    private String body;
    private int id;
    public Gist(String title, String body){
        this.title = title;
        this.body = body;

    }

    public String getTitle(){
        return title;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
