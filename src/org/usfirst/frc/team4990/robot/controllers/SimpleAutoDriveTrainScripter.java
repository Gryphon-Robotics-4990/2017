package org.usfirst.frc.team4990.robot.controllers;

import org.usfirst.frc.team4990.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4990.robot.controllers.AutoDriveTrainScripter;

public class SimpleAutoDriveTrainScripter extends AutoDriveTrainScripter {
	
	public void init()
	{
		forward(1000, .01);
	}
	
	public SimpleAutoDriveTrainScripter(DriveTrain dtrain) {
		super(dtrain);
		init();
	}

}