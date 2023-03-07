package HwLists.second.Hierarchy;

public class LapTop extends PC{
    private String battery;
    private double weight;



    public LapTop(int id,int age,String name, int memory, int core,String processor,String description,String made,String battery,double weight){

        super(id,age,name,memory,core,processor,description,made);
        this.battery = battery;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "battery='" + battery + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}