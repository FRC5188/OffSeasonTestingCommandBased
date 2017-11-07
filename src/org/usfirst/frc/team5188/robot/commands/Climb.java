package org.usfirst.frc.team5188.robot.commands;

import org.usfirst.frc.team5188.robot.OI;
import org.usfirst.frc.team5188.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {
	
	//operates our climber for robot 
	public Climb() {
		requires(Robot.climber);
	}

	public void execute() {
		
		//only climb if we pull down on operator joystick
		double value = Robot.oi.operator.getAxis(OI.Axis.RY);
		if (value < 0) {
			Robot.climber.set(-value);
		} else {
			Robot.climber.stop();
		}
	}

	public void end() {
		Robot.climber.stop();
	}

	protected boolean isFinished() {
		return false;
	}
}
