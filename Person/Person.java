public class Person {
    private String name;
    private float weight;
    public Person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight=weight;
    }
    public static void main(String[] args) {
        Person p=new Person("L.H.I");
        p.setWeight((float)65.0);
        System.out.println(p.getName() + " " + p.getWeight() + "Kg");
    }
}
