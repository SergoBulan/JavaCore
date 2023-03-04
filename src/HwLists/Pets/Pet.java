package HwLists.Pets;

import java.util.Arrays;

public class Pet {
    private int id;
    private String name;
    private double weigth;
    private String description;
    private String possessions[] = new String[5];

    public void addPossession(int i, String possession){
        if (i>=0 && i< possessions.length){
            possessions[i]=possession;
        }
    }

    public Pet() {
    }

    public Pet(int id, String name, double weigth, String description, String[] possessions) {
        this.id = id;
        this.name = name;
        this.weigth = weigth;
        this.description = description;
        this.possessions = possessions;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weigth=" + weigth +
                ", description='" + description + '\'' +
                ", possessions=" + Arrays.toString(possessions) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getPossessions() {
        return possessions;
    }

    public void setPossessions(String[] possessions) {
        this.possessions = possessions;
    }
}