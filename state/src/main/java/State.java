class Main{
    public static void main(String[] args) {
        DirectionService ds = new DirectionService();

        ds.setTravelMode(new Bicycle());
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(new Driving());
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(new Transit());
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(new Walking());
        ds.getDirection();
        ds.getEta();
    }
}

interface TravelMode {
    void getEta();
    void getDirection();
}

class DirectionService {
    TravelMode travelMode;

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public void getEta(){
        travelMode.getEta();
    }

    public void getDirection(){
        travelMode.getDirection();
    }
}

class Driving implements TravelMode{
    public void getEta() {
        System.out.println("Calculating ETA (driving)");
    }

    public void getDirection() {
        System.out.println("Calculating Direction (driving)");
    }
}

class Walking implements TravelMode{
    public void getEta() {
        System.out.println("Calculating ETA (Walking)");
    }

    public void getDirection() {
        System.out.println("Calculating Direction (Walking)");
    }
}

class Transit implements TravelMode{
    public void getEta() {
        System.out.println("Calculating ETA (Transiting)");
    }

    public void getDirection() {
        System.out.println("Calculating Direction (Transiting)");
    }
}

class Bicycle implements TravelMode{
    public void getEta() {
        System.out.println("Calculating ETA (Bicycling)");
    }

    public void getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
    }
}




