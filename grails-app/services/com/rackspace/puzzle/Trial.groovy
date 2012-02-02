package com.rackspace.Puzzle
import com.rackspace.Puzzle.Ball

/**
 * @author mich4570
 * 
 * Trial
 * 
 * Represents a single ball and its position on the scale
 *
 */
class Trial {
	def ball
	def isTested = false
	def side = "out"
	
	/**
	 * Constructor
	 * 
	 * @param ball
	 * @return void
	 */
	def Trial(ball)
	{
		this.ball = ball
	}
}
