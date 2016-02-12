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
 *
 ************************************************************************************
 ***  Created 06-22-10 by Leon Schram.
 ***  This file is used with APCS GridWorldLab07.
 ***  It tests the RandomActor class.
 ***  Do not alter this file.
 ************************************************************************************
 *
 */


import info.gridworld.actor.ActorWorld;

public class RandomActorRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        RandomActor actor = new RandomActor();
        world.add(actor);
        world.show();
    }
}
