package HwLists.Litters;

public class Litter {
    private int id;
    private String name;

    private int tel;
    private String email;
    private String adres;

    public Litter() {
    }

    public Litter(int id, String name, int tel, String email, String adres) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Litter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}


