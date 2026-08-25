public class encapsulation{

    private String name;
    //Getter method

    public String getName(){

        return name;
    }

    //setter method 

    public void setName(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        
        encapsulation emp = new encapsulation();
        emp.setName("Aditya");
        System.out.println("Employee Name: " + emp.getName());
    }
}