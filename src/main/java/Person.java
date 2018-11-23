public class Person {
    String name;
    Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }
    public void changeMobile(Mobile mobile){
        this.mobile = mobile;
    }

}
