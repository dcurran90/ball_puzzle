package com.rackspace.puzzle
import com.rackspace.puzzle.Ball

class Scale {
	ArrayList leftPlate = new ArrayList()
	ArrayList rightPlate = new ArrayList()
	def addBallLeft(ball)
	{
		leftPlate.add(ball)
	}
	def addBallRight(ball)
	{
		rightPlate.add(ball)
	}
	def removeBallsLeft()
	{
		return leftPlate
	}
	def removeBallsRight()
	{
		return rightPlate
	}
	def compare()
	{
		def leftWeight, rightWeight
		for(ball in leftPlate)
			leftWeight += ball.weight
		for(ball in rightPlate)
			rightWeight += ball.weight
	}
}
