package org.usfirst.frc.team5188.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;

	//creates our drive motor controller 
	//the roborio output is split to go to three motorcontrollers 
	//since out tank drive uses three motors for each side 
	public static class Drive {
		public static final VictorSP 
		LEFT = new VictorSP(0),
		RIGHT = new VictorSP(1);
	}
	
	public static VictorSP climber = new VictorSP(2);
	//creates gyro
	public static AHRS gyro = new AHRS(SerialPort.Port.kMXP);
;
 
}
