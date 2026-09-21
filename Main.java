public class Main {
    public static void main(String[] args) {
        System.out.println("Program started.");

        ConfigurationManager config1 = ConfigurationManager.getInstance();

        System.out.println("First instance retrieved.");

        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Second instance retrieved.");
        System.out.println("Same object: " + (config1 == config2));

        config1.setVolume(25);

        System.out.println("Volume through config2: " + config2.getVolume());
    }
}