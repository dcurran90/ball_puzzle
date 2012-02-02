package com.rackspace.Puzzle
import com.rackspace.Puzzle.Ball
import com.rackspace.Puzzle.Scale

class BallTest {
	static def main()
	{
		Random random = new Random()
		Ball.ResetID()
		ArrayList balls = new ArrayList()
		Scale scale = new Scale()
		7.times {
			balls.add(new Ball())
		}
		
		balls[random.nextInt(7)].weight = 2.0
		
		for (ball in balls)
			println ball.id + ": " + ball.weight 
			
		scale.addBallLeft(balls[0])
		scale.addBallLeft(balls[1])
		scale.addBallLeft(balls[2])
		
		scale.addBallRight(balls[3])
		scale.addBallRight(balls[4])
		scale.addBallRight(balls[5])
		
		def result = scale.compare()
		if (result<0)
			println "Left is lighter"
		else if (result>0)
			println "Right is lighter"
		else
			println "Both sides are even"
	}
}
