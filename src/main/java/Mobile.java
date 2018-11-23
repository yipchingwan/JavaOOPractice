public class Mobile {
    public String name;
    public String color;
    public String brand;

    public Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }
    public void makeCall(String message){
        System.out.println("Message: [" + message + " ]");
    }

    public void getInfo(){
        System.out.println("name: "+ this.name + ", color: "+ this.color + ", brand: "+ this.brand +".");
    }

}
