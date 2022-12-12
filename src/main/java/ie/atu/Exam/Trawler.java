package ie.atu.Exam;

public class Trawler extends Ship{
    private int cargo;

    public Trawler() {
    }

    public Trawler(String shipName, String shipAge, int crewNum, int cargo) {
        super(shipName, shipAge, crewNum);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cargo:" + cargo +
                "\n";
    }
}
