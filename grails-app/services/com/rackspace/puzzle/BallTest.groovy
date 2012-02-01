package com.rackspace.puzzle
import com.rackspace.puzzle.Ball
import com.rackspace.puzzle.Scale

class BallTest {
	static def main()
	{
		Random random = new Random()
		def heavyBallSelected = false
		Ball.ResetID()
		ArrayList balls = new ArrayList()
		Scale scale = new Scale()
		7.times {
			if(!heavyBallSelected && random.nextInt(100)<50)
			{
				balls.add(new Ball(2.0))
				heavyBallSelected = true
			}
			else
				balls.add(new Ball())
		}
		
		for(ball in balls)
			println ball.id+": "+ball.weight 
			
		scale.addBallLeft(balls[0])
		scale.addBallLeft(balls[1])
		scale.addBallLeft(balls[2])
		
		scale.addBallLeft(balls[3])
		scale.addBallLeft(balls[4])
		scale.addBallLeft(balls[5])
	}
}
