package com.rackspace.Puzzle
import com.rackspace.Puzzle.Ball

/**
 * @author mich4570
 * 
 * Scale
 * 
 * Represents a virtual scale with two plates
 *
 */
class Scale {
	def leftWeight = 0
	def rightWeight = 0
	
	/**
	 * Adds a ball to the left plate
	 * 
	 * @param ball
	 * @return void
	 */
	def addBallLeft(ball)
	{
		leftWeight += ball.weight
	}
	
	/**
	 * Adds a ball to the right plate
	 * 
	 * @param ball
	 * @return void
	 */
	def addBallRight(ball)
	{
		rightWeight += ball.weight
	}
	
	/**
	 * Resets both plates to zero weight
	 * 
	 * @return void
	 */
	def reset()
	{
		leftWeight = rightWeight = 0
	}
	
	/**
	 * Compares the weight on both plates and returns -1 if the left plate 
	 * is heavier, 1 if the right plate is heavier, and 0 if they are equal
	 * @return integer
	 */
	def compare()
	{
		println rightWeight + " versus " + leftWeight
			
		if (rightWeight < leftWeight)
			return -1
		else if (rightWeight > leftWeight)
			return 1
		else
			return 0
	}
}
