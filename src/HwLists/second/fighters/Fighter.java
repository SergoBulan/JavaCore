package HwLists.second.fighters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Fighter {
    private int id;
    private Gender gender;
    private String name;
    private int age;
    private double weight;

    private Contact contact;

    private Compani compani;

    public Fighter(int id, Gender gender, String name, int age, double weight, String nameCo, String phone, String region) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.compani = new Compani(nameCo,phone,region);
    }
}