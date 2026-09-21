import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConfigurationManager config = ConfigurationManager.getInstance();
        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== Game Engine Configuration ===");
            System.out.println("1. View Status");
            System.out.println("2. Change Volume");
            System.out.println("3. Change Resolution");
            System.out.println("4. Change Display Mode");
            System.out.println("5. Test Audio");
            System.out.println("6. Test Graphics");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println();
                    System.out.println("Volume: " + config.getVolume() + "%");
                    System.out.println("Resolution: " + config.getResolution());
                    System.out.println("Display Mode: " + config.getDisplayMode());
                    break;

                case "2":
                    System.out.print("Enter volume (0-100): ");

                    try {
                        int volume = Integer.parseInt(scanner.nextLine());

                        if (volume >= 0 && volume <= 100) {
                            audio.setVolume(volume);
                        } else {
                            System.out.println("Volume must be between 0 and 100.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }

                    break;

                case "3":
                    System.out.print("Enter resolution: ");
                    String resolution = scanner.nextLine();

                    config.setResolution(resolution);

                    System.out.println("Resolution changed to " + resolution + ".");
                    break;

                case "4":
                    System.out.print("Enter display mode: ");
                    String displayMode = scanner.nextLine();

                    config.setDisplayMode(displayMode);

                    System.out.println("Display mode changed to " + displayMode + ".");
                    break;

                case "5":
                    audio.playSound("Test Sound");
                    break;

                case "6":
                    graphics.render();
                    break;

                case "7":
                    running = false;
                    System.out.println("Exiting engine...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-7.");
                    break;
            }
        }

        scanner.close();
    }
}