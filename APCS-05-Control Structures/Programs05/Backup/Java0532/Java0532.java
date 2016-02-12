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

        for (int k = 1; k <= 2; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 3; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 4; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 5; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 6; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 7; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 8; k++)
        	barry.move();

        barry.turn();
        barry.turn();

        for (int k = 1; k <= 9; k++)
        	barry.move();

        barry.turn();
        barry.turn();

    }
}
