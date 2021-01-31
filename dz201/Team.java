package lesson201.dz201;

public class Team {

    String teamName;
    Participant[] teamMembers = new Participant[3];


    public Team(String teamName, Participant[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name: "+teamName;
    }

    public Participant[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Participant c: teamMembers){
            c.info();
        }
    }

    public void showMembersFinishedCourse(){
        for(Participant c: teamMembers){
            if(c.isOnDistance())
                c.info();
        }
    }

}
