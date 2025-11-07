import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        prepare();
        
    }
    private void prepare(){
    
        frog frog = new frog();
        addObject(frog, 300, 200);
        
        for(int i = 0; i < 5; i++){
        bug bug = new bug();
        addObject(bug, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        } 
    }
}
    

