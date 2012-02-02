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
	/**
	 * The ball in the trial
	 */
	def ball
	
	/**
	 * Whether it has been tested
	 */
	def isTested = false
	
	/**
	 * The last result
	 */
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
