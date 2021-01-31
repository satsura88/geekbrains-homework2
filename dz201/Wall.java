package lesson201.dz201;

public class Wall extends Obstacles {
    int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Participant participant){
        participant.jump(height);
    }
}
