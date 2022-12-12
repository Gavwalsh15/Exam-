package ie.atu.Exam;

public class Ferry extends Ship{
    private int maxPassenger;

    public Ferry() {
    }

    public Ferry(String shipName, String shipAge, int crewNum, int maxPassenger) {
        super(shipName, shipAge, crewNum);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger(int maxPassenger) {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Maximum Passengers :" + maxPassenger + "\n";
    }
}
