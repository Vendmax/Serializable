import java.io.Serializable;

public class People implements Serializable {
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}