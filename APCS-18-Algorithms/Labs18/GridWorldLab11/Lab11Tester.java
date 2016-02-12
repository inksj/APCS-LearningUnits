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
 **********************************************************************
 ***  Updated 06-23-10 by Leon Schram.
 ***  This file is used for the APCS GridWorldLab11 assigment.
 ***  This file creates the random colored cells.
 ***  This is the student, starting file.
 **********************************************************************
 *
 */


import info.gridworld.grid.Grid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;


public class Lab11Tester
{
    public static void main(String[] args)
    {
    	int row = 22;
    	int column = 35;
		Grid sortGrid = new BoundedGrid(row,column);
		ActorWorld sortWorld = new ActorWorld(sortGrid);





		sortWorld.show();
    }
}