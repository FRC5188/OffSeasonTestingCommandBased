package org.usfirst.frc.team5188.robot.commands;

import org.usfirst.frc.team5188.robot.OI;
import org.usfirst.frc.team5188.robot.Robot;
import org.usfirst.frc.team5188.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDCommand;

public class TurnToDegree extends PIDCommand {
	//command used to turn the robot 20 degrees
	//its 20 right now just to keep things simple

	
	public TurnToDegree() {
		// make sure to calibrate
		// p, i, d
		super(OI.TURN_TO_DEGREE_P, OI.TURN_TO_DEGREE_I, OI.TURN_TO_DEGREE_D);
		requires(Robot.driveTrain);
	}

	protected void initialize() {
		// go 20 degrees to the right
		//never prints Init!!!!!!!
		System.out.println("Init!!!!!!!");
		getPIDController().setPID(OI.TURN_TO_DEGREE_P, OI.TURN_TO_DEGREE_I, OI.TURN_TO_DEGREE_D);
		setSetpoint(20 + returnPIDInput());
		this.getPIDController().enable();
	}
	
	protected void end(){
		//never prints END!!!!!!!
		System.out.println("END!!!!");
	}

	@Override
	protected double returnPIDInput() {
		return RobotMap.gyro.getAngle();
	}

	@Override
	protected void usePIDOutput(double speed) {
		// these may need to be flipped so that left is reversed.
		Robot.driveTrain.drive(speed, -speed);
	}

	@Override
	protected boolean isFinished() {
		return getPIDController().onTarget();
	}
}
