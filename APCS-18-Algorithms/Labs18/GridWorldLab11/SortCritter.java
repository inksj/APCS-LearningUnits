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
 *****************************************************************************
 ***  Updated 06-23-10 by Leon Schram.
 ***  This file is used for the APCS GridWorldLab11 assigment.
 ***  This is the SortCritter class, which is responsible for sorting.
 ***  It will arrange the cells from darkest red to brighest red.
 ***  Each step through the program moves one cell into the right location.
 ***  This is the student, starting file.
 *****************************************************************************
 *
 */


import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.awt.Color;
import java.util.ArrayList;


public class SortCritter extends Critter
{

    public void act()
    {
    	Grid sortGrid = getGrid();
		ArrayList<Location> cellLocations = sortGrid.getOccupiedLocations();





    }

}

