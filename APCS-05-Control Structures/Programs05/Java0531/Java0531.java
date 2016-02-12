// Java0531.java
// This program displays an hour glass of flowers.


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;


public class Java0531
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Bug barry = new Bug();
        world.add(new Location(8,1),barry);
        world.show();

   		barry.turn();
        barry.turn();

        for (int k = 1; k <= 7; k++)
        	barry.move();

        for (int k = 1; k <= 5; k++)
            barry.turn();

        for (int k = 1; k <= 7; k++)
        	barry.move();

        for (int k = 1; k <= 3; k++)
            barry.turn();

        for (int k = 1; k <= 7; k++)
        	barry.move();

        for (int k = 1; k <= 3; k++)
            barry.turn();

        for (int k = 1; k <= 7; k++)
        	barry.move();
    }
}
