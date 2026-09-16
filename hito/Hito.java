package hito;
public class Hito {
    protected String name;
    protected int age;

    public Hito(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    void setName(String name) {
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }
}