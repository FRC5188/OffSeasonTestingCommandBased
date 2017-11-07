package org.usfirst.frc.team5188.robot.subsystems;

import org.usfirst.frc.team5188.robot.RobotMap;
import org.usfirst.frc.team5188.robot.commands.Drive;


import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private VictorSP leftDrive;
	private VictorSP rightDrive;

	public DriveTrain() {
		leftDrive = RobotMap.Drive.LEFT;
		rightDrive = RobotMap.Drive.RIGHT;
	}

	/** 
	 * This is used to allow autonomous to get through acceleration and
	 * velocity controls we may place and instead use PID.
	 */
	public void driveRaw(double left, double right) {
		leftDrive.set(left);
		rightDrive.set(-right);
	}
	
	/**
	 * Drive in teleop.
	 */
	public void drive(double left, double right) {
		driveRaw(left, right);
	}

	public void stop() {
		drive(0, 0);
	}

	/** Get gyroscope angle in degrees */
	public double getGyroAngle() {
		return RobotMap.gyro.getAngle();
	}

	public void resetGyro() {
		RobotMap.gyro.reset();
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new Drive());
	}
	
	public void smartDashboard() {
		SmartDashboard.putNumber("DriveTrain Left", leftDrive.get());
		SmartDashboard.putNumber("DriveTrain Right", -rightDrive.get());
		SmartDashboard.putNumber("DriveTrain Gyro", RobotMap.gyro.getAngle());
	}
}
