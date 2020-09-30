package mobi.com.multiselect.model;

public class Inbox {

    public int id;
    public String image = null;
    public String from;

    public int color = -1;

    public Inbox(int id, String image, String from) {
        this.id = id;
        this.image = image;
        this.from = from;

    }
}