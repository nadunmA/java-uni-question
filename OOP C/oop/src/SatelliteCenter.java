public class SatelliteCenter {

    private int option;
    private ISatellite[] satellites;
    private IGeoLocation[] tracker;

    public SatelliteCenter(int option, ISatellite[] satellite, IGeoLocation[] tracker){

        this.option = option;
        this.satellites = satellites;
        this.tracker = tracker;

    }

    public void startService(){
        satellites[option].activate();
    }

    public void stopService(){
        satellites[option].deactivate();
    }

    public void locationService(){
        tracker[option].displayLocation();
    }


}
