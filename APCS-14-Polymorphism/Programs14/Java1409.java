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
 */


// METHOD step is a member of the ActorWorld class.


public void step()
{
	Grid<Actor> gr = getGrid();							// 1
	ArrayList<Actor> actors = new ArrayList<Actor>();	// 2
	for (Location loc : gr.getOccupiedLocations())		// 3
		actors.add(gr.get(loc));						// 4

	for (Actor a : actors)								// 5
	{
		if (a.getGrid() == gr)							// 6
			a.act();									// 7
	}
}

