package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShootInit extends Subsystem {

	private Talon back = new Talon(RobotMap.back);
	private Talon front = new Talon(RobotMap.front);
	
	public void initDefaultCommand() {
		setDefaultCommand(new Shoot());
	}
	
	public void Shoot() {
	}
 	
	public void shootOnOff(boolean b) {
		if (b) {
			back.set(1);
			front.set(1);
		}
		else {
			back.set(0);
			front.set(0);
		}
	}
}