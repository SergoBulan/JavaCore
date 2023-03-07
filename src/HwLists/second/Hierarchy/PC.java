package HwLists.second.Hierarchy;

public class PC {
    private int id;
    private int age;
    private String name;
    private int memory;
    private int core;
    private String processor;
    private String description;
    private String made;

    public PC() {
    }

    public PC(int id, int age, String name, int memory, int core, String processor, String description, String made) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.memory = memory;
        this.core = core;
        this.processor = processor;
        this.description = description;
        this.made = made;
    }

    @Override
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", memory=" + memory +
                ", core=" + core +
                ", processor='" + processor + '\'' +
                ", description='" + description + '\'' +
                ", made='" + made + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }
}

