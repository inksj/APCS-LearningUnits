/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @author Cay Horstmann
 *
 ************************************************************************************
 ***  This file is used for AP Computer Science GridWorld Lab 04.
 ***  Do not alter this file.  All work is done in the file Bug.java
 ************************************************************************************
 *
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;


public class GWLab04Runner
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
        world.add(new Location(8,1),new Flower());
        world.add(new Location(4,2),new Flower());
        world.show();
    }
}
