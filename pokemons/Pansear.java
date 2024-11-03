package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pansear extends Pokemon {
    public Pansear(String name, int level) {
        super(name, level);

        setType(Type.FIRE);
        setStats(50, 53, 48, 53, 48, 64);
        setMove(new Flamethrower(), new FlameCharge(), new FireBlast());
    }
}
