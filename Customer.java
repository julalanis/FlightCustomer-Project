public class Customer extends CustomerInfo {
    //named variables
    private String name;
    private int age;

    //get methods for 2 variables
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    //set methods for 2 variables
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //importanceLevel method
    public String importanceLevel(){
        return "Uncategoried";
    }

    //toString method
    public String toString(){
        return "Customer: " + name + "\n" +
                "Age: " + age;
    }

}
