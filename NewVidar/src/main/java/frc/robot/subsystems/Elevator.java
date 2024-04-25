// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import frc.robot.Constants;

public class Elevator extends SubsystemBase {

  private TalonFX LeftElevator;
  private TalonFX RightElevator;
  /** Creates a new Elevator. */
  public Elevator() {
    LeftElevator = new TalonFX(Constants.ElevatorConstants.kLeftElevator);
    RightElevator = new TalonFX(Constants.ElevatorConstants.kRightElevator);
    LeftElevator.setControl(new Follower(RightElevator.getDeviceID(), Constants.kOpposeMasterDirection));
  }

  public void MoveElevator(double speed) {
    LeftElevator.setVoltage(speed * 12);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
