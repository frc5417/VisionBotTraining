// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.RobotContainer;

public class Teleop extends CommandBase {
  /** Creates a new Teleop. */
  Drive m_drive;
  double leftSpeed = 0;
  double rightSpeed = 0;

  public Teleop(Drive drive) {
    m_drive = drive;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    leftSpeed = RobotContainer.getLeftJoystick();
    rightSpeed = RobotContainer.getRightJoystick();

    m_drive.setSpeed(0.25*leftSpeed, 0.25*rightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
