package zadaniaFilip.filip1.olejto;

public class JazdaProbna implements ITest{

    private IAuto auto;

    public JazdaProbna(IAuto auto) {
        this.auto = auto;
    }

    public void jazdaProbna(){
        auto.drive();

    }

}
