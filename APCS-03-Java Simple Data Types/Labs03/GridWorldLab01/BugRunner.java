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
 ***  ALTERED 05-14-07 BY LEON SCHRAM
 ***  A Flower object and an Actor object are added to the world in the main method.
 ***  This file is used for APCS GridWorld Labs 01 and 02.
 ***  There is not a solution file.
 ***  Students do not create or alter any code for GridWorld Labs 01 and 02.
 ************************************************************************************
 *
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;


public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Actor());
        world.add(new Bug());
        world.add(new Rock());
        world.add(new Flower());
        world.show();
    }
}
