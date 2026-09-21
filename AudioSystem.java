public class AudioSystem {
    public void playSound(String sound) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("Playing " + sound + " at volume " + config.getVolume() + "%.");
    }

    public void setVolume(int volume) {
        ConfigurationManager.getInstance().setVolume(volume);
        System.out.println("Audio volume changed to " + volume + "%.");
    }
}