package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Slimesear extends Pansear {
    public Slimesear(String name, int level) {
        super(name, level);

        setType(Type.FIRE);
        setStats(75,98,63,98,63,101);
        setMove(new Flamethrower(), new FlameCharge(), new FireBlast(), new FocusBlast());

    }
}
