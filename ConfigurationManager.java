public class ConfigurationManager {
    private static final ConfigurationManager instance = new ConfigurationManager();

    private int volume;
    private String resolution;
    private String displayMode;

    private ConfigurationManager() {
        volume = 75;
        resolution = "1920x1080";
        displayMode = "Fullscreen";
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }
}