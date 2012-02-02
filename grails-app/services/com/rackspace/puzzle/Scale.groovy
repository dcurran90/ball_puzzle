package com.rackspace.Puzzle
import com.rackspace.Puzzle.Ball

class Scale {
	def leftWeight = 0
	def rightWeight = 0
	def addBallLeft(ball)
	{
		leftWeight += ball.weight
	}
	def addBallRight(ball)
	{
		rightWeight += ball.weight
	}
	def reset()
	{
		leftWeight = rightWeight = 0
	}
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
