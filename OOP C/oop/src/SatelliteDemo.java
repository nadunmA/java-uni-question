public class SatelliteDemo {

    public static void main(String[] args) {

        ISatellite navigationlSatellite = new NavigationSatellite("Ravana 01");
        IGeoLocation locationTracker1 = new SatelliteLocation("Sri lanka");
    
        ISatellite dronISatellite = new DroneSatellite("Ravan 02");
        IGeoLocation locationTracker2 = new SatelliteLocation("Russia");

        ISatellite[] satellitesArray = new ISatellite[]{navigationlSatellite, dronISatellite};
        IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker1, locationTracker2};

        SatelliteCenter satelliteCenter = new SatelliteCenter(0, satellitesArray, trackerArray);
        satelliteCenter.startService();
        satelliteCenter.stopService();
        satelliteCenter.locationService();

        SatelliteCenter remoSatelliteCenter = new SatelliteCenter(1, satellitesArray, trackerArray);
        remoSatelliteCenter.startService();
        remoSatelliteCenter.stopService();
        remoSatelliteCenter.locationService();

        
    }


}
