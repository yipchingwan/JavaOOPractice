public class iPhone extends Mobile{

    public iPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeCall(String message){
        super.makeCall(message);
        if(message.length()>18){
            System.out.println("<iPhone>Message cannot be sent");
        }
        else{
            System.out.println("<iPhone>Message: [" + message + " ]");
        }
    }
}
