package ie.atu.Exam;

public class Ship {
    private String shipName;
    private String shipAge;
    private int crewNum;

    public Ship() {
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAge() {
        return shipAge;
    }

    public void setShipAge(String shipAge) {
        this.shipAge = shipAge;
    }

    public int getCrewNum() {
        return crewNum;
    }

    public void setCrewNum(int crewNum) {
        this.crewNum = crewNum;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", shipAge='" + shipAge + '\'' +
                ", crewNum=" + crewNum +
                '}';
    }
}
