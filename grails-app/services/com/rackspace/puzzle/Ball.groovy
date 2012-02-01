package com.rackspace.puzzle

class Ball 
{
	def weight
	static curr_id = 0
	def id
	def Ball(weight = 1.0)
	{
		id = ++curr_id
		this.weight = weight
	}
	static def ResetID()
	{
		curr_id = 0
	}
}
