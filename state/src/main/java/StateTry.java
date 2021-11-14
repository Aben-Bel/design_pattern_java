
class CodeWithMosh{
    public static void main(String[] args) {
        DirectionServiceTry ds = new DirectionServiceTry();

        ds.setTravelMode(TravelModeTry.BICYCLING);
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(TravelModeTry.DRIVING);
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(TravelModeTry.TRANSIT);
        ds.getDirection();
        ds.getEta();

        ds.setTravelMode(TravelModeTry.WALKING);
        ds.getDirection();
        ds.getEta();

    }
}


class DirectionServiceTry {
    private TravelModeTry travelMode;

    public Object getEta() {
        if (travelMode == TravelModeTry.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        }
        else if (travelMode == TravelModeTry.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        }
        else if (travelMode == TravelModeTry.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }

    public Object getDirection() {
        if (travelMode == TravelModeTry.DRIVING) {
            System.out.println("Calculating Direction (driving)");
            return 1;
        }
        else if (travelMode == TravelModeTry.BICYCLING) {
            System.out.println("Calculating Direction (bicycling)");
            return 2;
        }
        else if (travelMode == TravelModeTry.TRANSIT) {
            System.out.println("Calculating Direction (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return 4;
        }
    }

    public TravelModeTry getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelModeTry travelMode) {
        this.travelMode = travelMode;
    }
}

enum TravelModeTry {
    DRIVING,
    BICYCLING,
    TRANSIT,
    WALKING
}