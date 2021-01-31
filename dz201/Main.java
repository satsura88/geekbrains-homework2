package lesson201.dz201;

public class Main {
    public static void main(String[] args) {

        Participant[] participant = {new Human("Человек"), new Cat("Кот"), new Robot("Робот")};
        Obstacles[] obstacles = {new Treadmill(1000), new Wall(1)};

        Course course = new Course(obstacles);
        Team team = new Team("Команда", participant);
        course.doIt(team);
        team.showResults();

    }
}

