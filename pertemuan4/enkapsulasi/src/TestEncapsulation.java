public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setGeekName("Hars");
        obj.setGeekAge(18);
        obj.setGeekRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getGeekName());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());
    }
}
