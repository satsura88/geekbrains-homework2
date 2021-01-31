package lesson201.dz201;

public class Treadmill extends Obstacles{
    int length;

    public Treadmill(int length){
        this.length = length;
    }

    @Override
    public void doIt(Participant participant){
        participant.run(length);
    }
}
