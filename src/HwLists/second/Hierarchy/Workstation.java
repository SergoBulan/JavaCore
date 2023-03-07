package HwLists.second.Hierarchy;

public class Workstation extends UltraBook{
    private String productivity;

    public Workstation(int id,int age,String name, int memory, int core,String processor,String description,String made,String battery,double weight,String recall,String productivity){
        super(id,age,name,memory,core,processor,description,made,battery,weight,recall);
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "productivity='" + productivity + '\'' +
                "} " + super.toString();
    }

    public String getProductivity() {
        return productivity;
    }

    public void setProductivity(String productivity) {
        this.productivity = productivity;
    }
}