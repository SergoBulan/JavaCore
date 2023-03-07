package HwLists.second.fighters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String email;
    private String phone;
    private String website;
    private String site;
    private String street;
    private Geo geo;

}