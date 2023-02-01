interface Quest {
    String name();
    void process();
}

class DeadIslandQuest implements Quest {
    public String name() {
        return "Dead Island Quest";
    }
    public void process() {
        System.out.println("BEWARE!! You're crossing Death Island teritory. Fight with skeletons!");
    }
}

class EliteKnightQuest implements Quest {
    public String name() {
        return "Elite Knight Quest";
    }
    public void process() {
        System.out.println("HELP!! The Princess is in troubles! Help her escape from the evil castle. Hurry up!");
    }
}
class Knight {
    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }
    public void start() {
        System.out.println("Starting the adventure");
        this.quest.process();
        System.out.println("Good job, you completed the: " + quest.name());
    }
}

class Application {
    public static void main(String[] args) {
        /* Quest deadIsland = new DeadIslandQuest(); */
        Quest eliteKnigt = new EliteKnightQuest();
        /* Knight deadMission = new Knight(deadIsland); */
        Knight eliteMission = new Knight(eliteKnigt);
        eliteMission.start();
        
    }
}
