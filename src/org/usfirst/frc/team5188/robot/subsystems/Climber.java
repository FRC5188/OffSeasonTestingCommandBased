package org.usfirst.frc.team5188.robot.subsystems;

import org.usfirst.frc.team5188.robot.RobotMap;
import org.usfirst.frc.team5188.robot.commands.Climb;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Climber extends Subsystem {
	
	public Climber() {
		
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new Climb());
	}

	public void set(double d) {
		RobotMap.climber.set(d);
	}

	public void stop() {
		set(0);
	}

	public void smartDashboard() {
		SmartDashboard.putNumber("Climber Value", RobotMap.climber.get());
	}
}
