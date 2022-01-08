package constraints;
public class Activity{

    private String description;
    private int temps;


/* Activity creer une Activite*/
    public Activity(String description,int temps) {
        this.description=description;
        this.temps=temps;
    }

    public String getDescription(){
        return this.description;
    }

    public int getDuration(){
        return this.temps;
    }

    public String toString(){
      return "{nom:'"+this.description+"',temps:"+this.temps+"}";
    }
}
