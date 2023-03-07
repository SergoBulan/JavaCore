package HwLists.second.Cards;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Skill skill[];
    private Car car;


}