/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * 04-12-12 by Leon Schram
 * Used for Java0901 project
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


public class TestJava0901
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Actor actor1 = new Actor();
        Actor actor2 = new Actor();
        Actor actor3 = new Actor();
        Actor actor4 = new Actor();
        world.add(new Location(0,0),actor1);
        world.add(new Location(0,9),actor2);
        world.add(new Location(9,0),actor3);
        world.add(new Location(9,9),actor4);
        world.add(new Spider());
        world.show();
    }
}
