public class Customer extends CustomerInfo {
    //named variables
    private String name;
    private int age;

    //constructor with no parameters
    Customer(){
    }

    //constructor with parameters
    Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

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
        return "Uncategorized";
    }

    //toString method
    public String toString(){
        return "Customer name: " + name + "\n" +
                "Customer age: " + age + "\n" +
                "Customer importance level: " + importanceLevel();
    }

}
