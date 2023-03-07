package HwLists.second.fighters;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(1,Gender.MALE,"Rock",52,102.5,new Contact("Victori@.Fight.com","+8(023)454-45-67","CriateCarier","London","Gordo 2",new Geo("-34.111","120.22")),new Compani("LC Biter","+2(112)341-12-67","Rim"));
        Fighter fighter2 = new Fighter(2,Gender.FEMALE,"Gigi",18,58.7,new Contact("PerfectDrim@gmail.com","+38(088)543-29-65","ZadonativPobachuv","California","Wincen 321", new Geo("32,11","_84.322")),new Compani("OnliFans","123-56-32","Moldova"));
        Fighter fighter3 = new Fighter(3,Gender.MALE,"Cande",25,78.4,new Contact("YourAnemi@fight.com","+38(345)452-33-45-21","RickYonger","Germani, Berlin","Wols",new Geo("-67,422","98,832")),new Compani("GaciMuchi","+48(843)543-12-34","Liverpul"));
        Fighter fighter4  = new Fighter(4,Gender.FEMALE,"Emili",18,45.9,new Contact("PinckPusse@gmail.com","+48(234)454-43-87","WirginNotMy","Florida","Oushen Plaza",new Geo("98.32","-123.34")),new Compani("Onlifans","102","London"));
        Fighter fighter5  = new Fighter(5,Gender.MALE,"Rick",21,79.3,new Contact("SedoyPerdun@gnoy.vam","-8(432)456-32-93","FightYoo","HolliWood","Yamico",new Geo("23.4","-120.3456")),new Compani("HorniBee","89212-45-32","Kilimandgaro"));
    }
}
