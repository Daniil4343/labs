package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int)(p.getStat(Stat.HP) - p.getHP()));

        Effect sleep = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(sleep);
    }

    @Override
    protected String describe() {
        return "is using Rest";
    }
}
