package HwLists.second.Cards;

public class Main {
    public static void main(String[] args) {
        Skill [] skills = {new Skill("JS",2),new Skill("Node",3),new Skill("Clining",5)};
        Car car = new Car("Volvo",2013,430022);
        Card victim1 = new Card(1,"Anton","Bedro","Halyava@mongo.db",30,Gender.MALE,skills,car);
        System.out.println(victim1);

        Skill [] skills2 = {new Skill("Ffeeman",10),new Skill("Banana",30)};
        Car car2 = new Car("Niva",1990,602343);
        Card victim2 = new Card(2,"Vanya","Lopuh","ParenOrk@sheGiv.poka",25,Gender.MALE,skills2,car2);
        System.out.println(victim2);
    }
}
