package com.rackspace.Puzzle

/**
 * @author mich4570
 * 
 * Ball
 * 
 * Represents a weighted ball, not to be confused with an Aperture Science Weighted Storage Cube.
 *
 */
class Ball 
{
	def weight
	static curr_id = 0
	def id
	
	/**
	 * Constructor
	 * 
	 * @param weight
	 * @return void
	 */
	def Ball(weight = 1.0)
	{
		id = ++curr_id
		this.weight = weight
	}
	
	/**
	 * ResetID
	 * 
	 * Resets the static id variable to 0
	 * @return void
	 */
	static def ResetID()
	{
		curr_id = 0
	}
}
