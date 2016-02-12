// Java0324.Java
// This program display a 10 x 10 GridWorld
// with six objects placed at random location.
// This program requires a project with the GridWorld.jar attached.


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;


public class Java0321
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Actor());
        world.add(new Actor());
        world.add(new Bug());
        world.add(new Bug());
        world.add(new Rock());
        world.add(new Rock());
        world.show();
    }
}
