package nu.lansing.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class CarModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;

    public CarModel() {
    }

    public CarModel(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}