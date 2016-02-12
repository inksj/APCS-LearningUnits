/**
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 *
 ******************************************************************************
 ***  Created 06-22-10 by Leon Schram.
 ***  This file tests the <Actor> class and several of its subclasses.
 ***  This file is used for the GridWorldLab05 lab exercise.
 ***  Do not alter this file.  No file is altered in this lab exercise.
 ******************************************************************************
 *
 */


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;


public class Lab05Tester
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        Actor obj1 = new Actor();
        Bug obj2 = new Bug();
        BoxBug obj3 = new BoxBug(6);
        OctagonBug obj4 = new OctagonBug(3);
        SpiralBall obj5 = new SpiralBall(2);
        Critter obj6 = new Critter();
        ChameleonCritter obj7 = new ChameleonCritter();
        CrabCritter obj8 = new CrabCritter();
             
        world.add(new Location(0,0),obj1);
        world.add(new Location(0,9),obj2);
        world.add(new Location(9,9),obj3);
        world.add(new Location(9,0),obj4);
        world.add(new Location(3,3),obj5);
        world.add(new Location(3,6),obj6);
        world.add(new Location(6,3),obj7);
        world.add(new Location(6,6),obj8);       
        world.show();
    }
}