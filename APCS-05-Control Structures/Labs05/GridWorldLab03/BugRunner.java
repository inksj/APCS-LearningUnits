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
 ***  ALTERED 06-20-12 BY JOHN SCHRAM
 ***  Flowers, Actors and Rocks are removed. Only a single Bug remains.
 ***  This is the student, starting file for APCS GridWorld Labs 03.
 ***  Control Structures need to be used to make the bug object fill in the entire grid with flowers.
 ************************************************************************************
 *
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;


public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Bug barry = new Bug();
        world.add(new Location(9,0), barry);
        world.show();





    }
}
