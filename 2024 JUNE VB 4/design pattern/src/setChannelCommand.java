public class setChannelCommand implements Command{

    private Television television;
    private int channel;

    public setChannelCommand(Television television, int channel){

        this.television = television;
        this.channel = channel;
    }

    public void execute(){
        television.setCahnnel(channel);
    }

}
