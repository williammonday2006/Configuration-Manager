public class GraphicsRenderer {
    public void render() {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println(
            "Rendering game at " +
            config.getResolution() +
            " in " +
            config.getDisplayMode() +
            " mode."
        );
    }
}