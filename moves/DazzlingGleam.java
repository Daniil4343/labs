package moves;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends PhysicalMove {
    public DazzlingGleam() {
        super(Type.NORMAL, 80, 100);
    }

    @Override
    protected String describe() {
        return "is using Tackle";
    }
}
