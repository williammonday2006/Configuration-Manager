public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Same object: " + (config1 == config2));

        System.out.println("Original volume: " + config1.getVolume());

        config1.setVolume(25);

        System.out.println("Volume through config2: " + config2.getVolume());
    }
}