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


public interface Grid<E>
{
    int getNumRows();

   	int getNumCols();

    boolean isValid(Location loc);

    E put(Location loc, E obj);

    E remove(Location loc);

    E get(Location loc);

    ArrayList<Location> getOccupiedLocations();

    ArrayList<Location> getValidAdjacentLocations(Location loc);

    ArrayList<Location> getEmptyAdjacentLocations(Location loc);

    ArrayList<Location> getOccupiedAdjacentLocations(Location loc);

    ArrayList<E> getNeighbors(Location loc);
}
