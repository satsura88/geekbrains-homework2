package lesson201.dz201;

public class Course {
    Obstacles[] obstacles;

    public Course(Obstacles[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Participant[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Participant c: teamMembers){
                for (Obstacles o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Нет участников!");
        }
    }
}
