public class Terrain extends Achetable {
    public Terrain(String name) {
        super(name);
    }

    public Terrain(String name, Case c) {
        super(name,c);
    }

    public boolean construction() {
        return false;
    }
}
