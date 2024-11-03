import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String args[]) {
        Battle b = new Battle();
        Pansear pansear = new Pansear("", 1);
        Zygarde zygarde = new Zygarde("",1);
        Slimesear slimesear = new Slimesear("",1);
        Flabebe flabebe = new Flabebe("",1);
        Floette floette = new Floette("",1);
        Florges florges = new Florges("",1);
        b.addAlly(zygarde);
        b.addAlly(pansear);
        b.addAlly(slimesear);


        b.addFoe(flabebe);
        b.addFoe(floette);
        b.addFoe(florges);

        b.go();
    }
}
