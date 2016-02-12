/*
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2002-2006 College Entrance Examination Board
 * (http://www.collegeboard.com).
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
 * @author Alyce Brady
 * @author APCS Development Committee
 * @author Cay Horstmann
 */


// METHOD getOccupiedLocations is a member of the BoundedGrid class.


public ArrayList<Location> getOccupiedLocations()					// 1
{
	ArrayList<Location> theLocations = new ArrayList<Location>();	// 2

	for (int r = 0; r < getNumRows(); r++)							// 3
	{
		for (int c = 0; c < getNumCols(); c++)						// 4
		{
			Location loc = new Location(r, c);						// 5
			if (get(loc) != null)									// 6
				theLocations.add(loc);								// 7
		}
	}
	return theLocations;											// 8
}
