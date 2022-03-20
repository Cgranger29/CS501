public class Pet {
    private String name;
    private int age;

    public void setName(String inName){
        name = inName;
    }

    public void setAge(int inAge){
        age = inAge;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void printInfo(){
        System.out.println("Pet Information");
        System.out.println("   Name: " + name);
        System.out.println("   Age: " + age);
        
    }
}
