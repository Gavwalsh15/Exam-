package ie.atu.Exam;


public class VessalApp{
    public static void main(String[] args) {
        Ship myship = new Ship();
        Ferry CFerry = new Ferry();
        Trawler MTrawler = new Trawler();

        myship.setShipName("Gavin");
        myship.setShipAge("2002");
        myship.setCrewNum(12);

        CFerry.setShipName("Cillian");
        CFerry.setShipAge("2003");
        CFerry.setCrewNum(8);
        CFerry.setMaxPassenger(203);

        MTrawler.setShipName("Mike");
        MTrawler.setShipAge("1999");
        MTrawler.setCrewNum(33);
        MTrawler.setCargo(500);

        System.out.println("Ship -\n"+ myship);
        System.out.println("Ferry -\n"+ CFerry);
        System.out.println("Trawler -\n"+ MTrawler);
    }
}

