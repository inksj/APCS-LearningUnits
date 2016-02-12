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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 *
 *
 ******************************************************************************
 ***  This file is used for the Lab07GWCS05 lab exercise.
 ***  Do not alter this file.  No file is altered in this lab exercise.
 ******************************************************************************
 *
 */

import info.gridworld.actor.Bug;


public class SpiralBall extends Bug
{
    private int steps;
    private int sideLength;
 
    public SpiralBall(int length)
    {
        steps = 0;
        sideLength = length;
      }

    public void act()
    {
        if (steps < sideLength)
        {
            move();
            steps++;
        }
        else
        {
           	turn();
            turn();
            sideLength++;
            steps = 0;      
        }
    }
}
