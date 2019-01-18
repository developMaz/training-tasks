package test;

interface Quest{
    
    void process();
}

class DeadIslandQuest implements Quest{
    
    public void process(){
        
        System.out.println("Wyruszyłeś na misje " + this.getClass().getSimpleName());
    }
}

class EliteKnightQuest implements Quest{
    
    public void process(){
        System.out.println("Wyruszyłeś na misje " + this.getClass().getSimpleName());        
    }
}

public class Knight {
    
    private Quest quest;
    
    public Knight(Quest quest){
        this.quest = quest;
    }
    
    public void start(){
        quest.process();
        System.out.println("Zakończyłeś misje!");
    }
}

class App2 {
    public static void main (String[] args){
        
    Knight knight = new Knight(new DeadIslandQuest());
    knight.start();
    
    Knight knight2 = new Knight(new EliteKnightQuest());
    knight2.start();   

    }
}