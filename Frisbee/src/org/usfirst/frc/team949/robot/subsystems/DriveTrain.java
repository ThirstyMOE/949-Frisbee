package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.DriveWithJoyStick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveTrain extends Subsystem {

	private Talon fL = new Talon(RobotMap.fL);
	private Talon fR = new Talon(RobotMap.fR);
	private Talon bL = new Talon(RobotMap.bL);
	private Talon bR = new Talon(RobotMap.bR);
	
	private RobotDrive drive;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public DriveTrain() {
		drive = new RobotDrive(fL, bL, fR, bR);
		drive.setSafetyEnabled(false);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoyStick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double x, double y, double rotateValue) {
    	drive.mecanumDrive_Cartesian(x, y, rotateValue, 0);
    }
}

