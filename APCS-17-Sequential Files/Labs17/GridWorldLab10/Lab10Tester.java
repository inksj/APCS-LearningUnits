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
 **********************************************************************************
 ***  Written 06-23-10 by Leon Schram
 ***  This file is used for the APCS GridWorldLab10 assignment.
 ***  There is no solution file for this assignment.
 **********************************************************************************
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;


public class Lab10Tester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(4, 6), new Rock());
        world.add(new Location(9, 9), new Rock());
        world.add(new Location(2, 8), new Bug(Color.BLUE));
        world.add(new Location(5, 5), new Bug(Color.PINK));
        world.add(new Location(1, 5), new Bug(Color.RED));
        world.add(new Location(7, 2), new Bug(Color.YELLOW));
        world.add(new Location(5, 8), new Critter());
        world.add(new Location(0, 0), new ChameleonCritter());
        world.add(new Location(6, 6), new CrabCritter());
        world.show();
    }
}