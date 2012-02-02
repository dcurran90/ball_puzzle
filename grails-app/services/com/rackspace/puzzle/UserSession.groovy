package com.rackspace.Puzzle
import com.rackspace.Puzzle.Trial
import com.rackspace.Puzzle.Ball

/**
 * @author mich4570
 * 
 * UserSession
 * 
 * Represents the state data stored for a user
 *
 */
class UserSession {
	/**
	 * A list of all the balls the user is testing
	 */
	ArrayList<Trial> trials
	
	/**
	 * The number of trials the user has attempted
	 */
	def trialCount = 0
	
	/**
	 * The heaviest ball
	 */
	def highestBall
	
	/**
	 * Constructor
	 */
	def UserSession() {
		reset()
	}
	
	/**
	 * Reset
	 * 
	 * Resets the UserSession's state variables to their default state
	 * 
	 * @return
	 */
	def reset()
	{
		trials = new ArrayList<Trial>()
		trialCount = 0
		Random random = new Random()
		Ball.ResetID()
		Scale scale = new Scale()
		7.times {
			trials.add(new Trial(new Ball()))
		}

		def highestBallIndex = random.nextInt(7)
		
		trials[highestBallIndex].ball.weight = 2.0
		highestBall = trials[highestBallIndex].ball
		
		for (trial in trials)
			println trial.ball.id + ": " + trial.ball.weight
	}
}
