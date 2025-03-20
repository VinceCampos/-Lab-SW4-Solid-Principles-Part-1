package ISP;
public class PhoneTest {
    public static void main(String[] args) {

        System.out.println("BasicPhone:");
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("+639626125986");
        basicPhone.sendSMS("+639274371624", " Hello! I am texting from BasicPhone!");
        
        System.out.println("\nSmartPhone:");
        Smartphone smartPhone = new Smartphone();
        smartPhone.makeCall("+639164739423");
        smartPhone.sendSMS("+639466909328", " Hello! I am texting from SmartPhone!");
        smartPhone.browseWeb("https://sms24.me/en/numbers/639466909328");
        smartPhone.takePicture();
    }
}
