package HwLists.second.Hierarchy;

public class UltraBook extends LapTop{
    private String recall;

    public UltraBook(int id,int age,String name, int memory, int core,String processor,String description,String made,String battery,double weight,String recall){
        super(id,age,name,memory,core,processor,description,made,battery,weight);
        this.recall = recall;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "recall='" + recall + '\'' +
                "} " + super.toString();
    }

    public String getRecall() {
        return recall;
    }

    public void setRecall(String recall) {
        this.recall = recall;
    }
}

