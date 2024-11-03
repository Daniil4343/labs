package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Zygarde extends Pokemon {
    public Zygarde(String name, int level) {
        super(name, level);

        setType(Type.DRAGON, Type.GROUND);
        setStats(108, 100, 121, 81, 95, 95);
        setMove(new Facade(), new Crunch(), new Rest(), new Coil());
    }
}
