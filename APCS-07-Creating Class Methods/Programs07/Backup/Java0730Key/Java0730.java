// Java0730.Java
// This file is used for project Java0730.

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;


public class Java0730
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(0,5),new Actor());
        world.add(new Location(9,9),new Actor());
        world.add(new Location(5,6),new Bug());
        world.add(new Location(0,0),new Bug());
        world.add(new Location(2,6),new Rock());
        world.add(new Location(9,5),new Rock());
        world.show();
    }
}
