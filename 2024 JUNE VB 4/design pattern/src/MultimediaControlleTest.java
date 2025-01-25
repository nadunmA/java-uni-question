

public class MultimediaControlleTest {
    public static void main(String[] args) throws Exception {
        
        RemoteControl remote = RemoteControl.getInstance();

        Television television = new Television();
        ScoundSystem scoundSystem = new ScoundSystem();

        remote.setCommand(0, new TvOnCommand(television));
        remote.setCommand(1, new setChannelCommand(television, 101));
        remote.setCommand(2, new ScoundOnCommand(scoundSystem));
        remote.setCommand(3, new IncreaseVolumeCommand(scoundSystem));

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);
        remote.pressButton(3);

    }
}
