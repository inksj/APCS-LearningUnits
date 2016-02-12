// Java0532.java
// This program displays a spiral of flowers.


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;


public class Java0532
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Bug barry = new Bug();
        world.add(new Location(5,4),barry);
        world.show();

		int length = 2;
		int steps = 0;
		int turns = 0;
       	while (turns <= 7)
        {
        	if (steps < length)
        	{
        		barry.move();
        		steps++;
        	}
        	else
        	{
        		barry.turn();
        		barry.turn();
        		turns++;
        		length++;
        		steps = 0;
        	}

    	}
    }
}
