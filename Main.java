public class Main {
    public static void main(String[] args) {
        AudioSystem audio = new AudioSystem();
        GraphicsRenderer graphics = new GraphicsRenderer();

        audio.playSound("Music");
        graphics.render();

        System.out.println();

        audio.setVolume(30);

        System.out.println();

        audio.playSound("Music");
        graphics.render();
    }
}