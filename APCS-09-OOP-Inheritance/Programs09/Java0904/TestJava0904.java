/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * 04-12-12 by Leon Schram
 * Used in Java0904 project
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


public class TestJava0904
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

        world.add(new Location(4,4),new LazySpider());
        world.add(new Location(5,5),new LazySpider());
        world.show();
    }
}
