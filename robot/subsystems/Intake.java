// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.commands.*;

public class Intake extends SubsystemBase {
  private WPI_TalonSRX talon7;
  private WPI_TalonSRX talon8;

  /** Creates a new Intake. */
  public Intake() {
    talon7 = new WPI_TalonSRX(7);
    talon8 = new WPI_TalonSRX(8);
  }
  public void In(){
    talon7.set(0.35);
    talon8.set(0.35);
  }
  public void Out(){
    talon7.set(-0.35);
    talon8.set(-0.35);
  }
  public void Kill(){
    talon7.set(0);
    talon8.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}