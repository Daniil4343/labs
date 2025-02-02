package moves;

import ru.ifmo.se.pokemon.*;

public class Coil extends StatusMove {
    public Coil() {
        super(Type.POISON, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.DEFENSE, 1);
        p.setMod(Stat.ACCURACY, 1);
    }

    @Override
    protected String describe() {
        return "is using Coil";
    }
}
