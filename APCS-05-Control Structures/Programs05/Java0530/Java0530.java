// Java0530.java
// This program places a single bug at row-8, col-1.


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;


public class Java0530
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Bug barry = new Bug();
        world.add(new Location(8,1),barry);
        world.show();

        for (int k = 1; k <= 5; k++)
        	barry.move();
    }
}









