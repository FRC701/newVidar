// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

//MERELY A TEMPORARY COMMAND BECAUSE I DONT WANNA REALLY DO THAT WITH A SMALL AMOUNT OF TIME  -RANDELL


package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;

public class tempCommand extends Command {
  /** Creates a new tempCommand. */
  public tempCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
