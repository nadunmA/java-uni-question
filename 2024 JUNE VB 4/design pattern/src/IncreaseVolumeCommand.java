public class IncreaseVolumeCommand implements Command{

    private ScoundSystem scoundSystem;

    public IncreaseVolumeCommand(ScoundSystem scoundSystem){
        this.scoundSystem = scoundSystem;
    }

    public void execute(){
        scoundSystem.increaseVolume();
    }

}
