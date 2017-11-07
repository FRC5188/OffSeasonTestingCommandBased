package org.usfirst.frc.team5188.robot.commands;

import org.usfirst.frc.team5188.robot.OI;
import org.usfirst.frc.team5188.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RereadPreferences extends Command {
	public void initialize() {
		Robot.oi.rereadPreferences();
		System.out.println("P" + OI.TURN_TO_DEGREE_P);
		System.out.println("I" + OI.TURN_TO_DEGREE_I);
		System.out.println("D" + OI.TURN_TO_DEGREE_D);
	}

	protected boolean isFinished() {
		return true;
	}
}

