package com.rackspace.Puzzle

/**
 * @author mich4570
 * 
 * Ball
 * 
 * Represents a weighted ball, not to be confused with an Aperture Science Weighted Storage Cube.
 */
class Ball 
{
	/**
	 * Weight of the ball
	 */
	def weight
	
	/**
	 * Current ball?
	 */
	static curr_id = 0
	
	/**
	 * Ball id.
	 */
	def id
	
	/**
	 * Constructor
	 * 
	 * @param weight Weight to give the ball.
	 * @return void
	 */
	def Ball(weight = 1.0)
	{
		id = ++curr_id
		this.weight = weight
	}
	
	/**
	 * Resets the static id variable to 0.
	 * 
	 * @return void
	 */
	static def ResetID()
	{
		curr_id = 0
	}
}
