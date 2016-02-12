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
 ******************************************************************************
 ***  Altered 06-23-10 by Leon Schram.
 ***  This file is used for the APCS GridWorldLab11 assigment.
 ***  The Cell class allows the display of a grid cell in a specified color.
 ***  This is the student, starting file.
 ***  Do not alter this file.
 ******************************************************************************
 */


import info.gridworld.actor.Actor;
import java.awt.Color;
import java.util.Random;


public class Cell extends Actor
{
	Random rnd;

    public Cell()
    {
    	rnd = new Random();
    	int randomRed = rnd.nextInt(256);
        setColor(new Color(randomRed,0,0));
    }

    public void act()
    {
    }
}
