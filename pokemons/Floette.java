package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Floette extends Flabebe {
    public Floette(String name, int level) {
        super(name, level);

        setType(Type.FAIRY);
        setStats(54, 45, 47, 75, 98, 52);
        setMove(new Facade(), new EnergyBall(), new Tackle());
    }
}
