package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class shooterInit extends Subsystem {

	private Talon back = new Talon(RobotMap.back);
	private Talon front = new Talon(RobotMap.front);
	
	public shooterInit() {
		
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new Shoot());
	}
	
	public void shootInit(double s) {
		back.set(s);
		front.set(s);
	}
}
