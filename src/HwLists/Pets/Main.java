package HwLists.Pets;

public class Main {
    public static void main(String[] args) {

     //   String[] possession = new String[6];
     //   possession[0] = "bone";
     //   possession[1] = "leash";
     //   possession[2] = "bowl";
     //   possession[3] = "rug";
     //   possession[4] = "drugs";
      //  possession[5] = "instruction";

      //  Pet pet1 = new Pet(1,"Adolf",9.3,"Wierd and small like a shet",possession);

        Pet pet1 = new Pet(1,"Adolf",5.6,"Infinity is not the end. You will all become his breakfast.");
        pet1.addPossession(0,"Bone");
        pet1.addPossession(1,"Leash");
        pet1.addPossession(2,"Bowl");
        pet1.addPossession(3,"Rug");
        pet1.addPossession(4,"Dgrus");
        System.out.println(pet1);

        Pet pet2 = new Pet(2,"Cidr",12,"A good day to start sniffing cocaine.");
        pet2.addPossession(0,"Drugs");
        pet2.addPossession(1,"Broom");
        pet2.addPossession(2,"Guitar");
        pet2.addPossession(3,"Rug");
        System.out.println(pet2);

        Pet pet3 = new Pet(3,"Dede",15,"Remember, brother, if the whole world turns against you, then I will always stand for you.");
        pet3.addPossession(0,"Socks");
        pet3.addPossession(1,"Bag");
        pet3.addPossession(2,"Ball");
        pet3.addPossession(3,"Bowl");
        pet3.addPossession(4,"Akulele");
        System.out.println(pet3);

        Pet pet4 = new Pet(4,"Dodo",28,"I decide according to the laws of the state. You must send me a picture of your tits!");
        pet4.addPossession(0,"Cactus");
        pet4.addPossession(1,"Fleas");
        pet4.addPossession(2,"Comb");
        pet4.addPossession(3,"Ball");
        System.out.println(pet4);

        Pet pet5 = new Pet(5,"Splint",4,"Without light there is no life. And I do not exist without your buttocks.");
        pet5.addPossession(0,"Death Note");
        pet5.addPossession(1,"Broom");
        pet5.addPossession(2,"Bowl");
        System.out.println(pet5);

    }
}
