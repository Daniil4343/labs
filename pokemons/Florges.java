package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Florges extends Floette {
    public Florges(String name, int level) {
        super(name, level);

        setType(Type.FAIRY);
        setStats(78, 65, 68, 112, 154, 75);
        setMove(new Facade(), new EnergyBall(), new Tackle(), new DazzlingGleam());
    }
}
