package lesson201.dz201;

public class Human implements Participant{
    String name;
    int maxLength;
    int maxHeight;
    boolean onDistance;

    public Human (String name){
        this.name = name;
        this.maxLength = 2000;
        this.maxHeight = 2;
        this.onDistance = true;
    }

    @Override
    public void run (int length){
        if (length <= maxLength){
            System.out.println(name + " " + " пробежал");
        } else {
            System.out.println(name + " " + " не смог пробежать");
            onDistance = false;
        }
    }

    @Override
    public void jump (int height){
        if (height <= maxHeight){
            System.out.println(name + " " + " перепрыгнул");
        } else {
            System.out.println(name + " " + " не смог перепрыгнуть");
            onDistance = false;
        }
    }

    @Override
    public void info(){
        System.out.println(name + ": " + onDistance);
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
