// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {

  public static final CANSparkMax leftMain = new CANSparkMax(Constants.DriveLeftMaster, MotorType.kBrushless);
  public static final CANSparkMax leftBehind = new CANSparkMax(Constants.DriveLeftSlave, MotorType.kBrushless);
  public static final CANSparkMax rightMain = new CANSparkMax(Constants.DriveRightMaster, MotorType.kBrushless);
  public static final CANSparkMax rightBehind = new CANSparkMax(Constants.DriveRightSlave, MotorType.kBrushless);

  private final static MotorControllerGroup leftMotors = new MotorControllerGroup(leftMain, leftBehind);
  private final static MotorControllerGroup rightMotors = new MotorControllerGroup(rightMain, rightBehind);

  /** Creates a new Drive. */
  public Drive() {
    leftMotors.setInverted(true);
    rightMotors.setInverted(false);
  }

  public void setSpeed(double leftSpeed, double rightSpeed) {
    leftMotors.set(leftSpeed);
    rightMotors.set(rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
