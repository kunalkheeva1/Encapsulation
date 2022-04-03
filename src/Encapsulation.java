class Kunal{
    private int age;
    private String name;

    public int Age(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setName(String newName){
        name = newName;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Kunal kk = new Kunal();
        kk.setAge(18);
        kk.setName("Kunal");
        System.out.println(kk.Age());
    }
}

