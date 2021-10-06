package ch07;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {
        if (MAX_VOLUME > volume){
            volume++;
        }

    }

    @Override
    public void volumeDown() {
        if (MAX_VOLUME < volume){
            volume--;
        }
            volume--;

    }
    public void volumeState(){
        System.out.println("volume : " + volume);
    }
}
