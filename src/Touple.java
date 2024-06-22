import java.util.UUID;

public class Touple {
    private UUID id;
    private Player player;

    public Touple(UUID id, Player player) {
        this.id = id;
        this.player = player;
    }

    public UUID getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }
}
