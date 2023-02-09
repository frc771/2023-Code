// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.can.*;


public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  private WPI_TalonSRX talonSRX1;
  private WPI_TalonSRX talonSRX2;
  private WPI_TalonSRX talonSRX3;
  public static MotorControllerGroup MotorControllerGroup;
  private WPI_TalonSRX talonSRX4;
  private WPI_TalonSRX talonSRX5;
  private WPI_TalonSRX talonSRX6;
  public static MotorControllerGroup MotorControllerGroup2;
  public static DifferentialDrive differentialDrive1;

  public Drive() {
    talonSRX1 = new WPI_TalonSRX(1);
    talonSRX2 = new WPI_TalonSRX(2);
    talonSRX3 = new WPI_TalonSRX(3);
    MotorControllerGroup = new MotorControllerGroup(talonSRX1, talonSRX2, talonSRX3);
    talonSRX4 = new WPI_TalonSRX(4);
    talonSRX5 = new WPI_TalonSRX(5);
    talonSRX6 = new WPI_TalonSRX(6);
    MotorControllerGroup2 = new MotorControllerGroup(talonSRX4, talonSRX5, talonSRX6);

    differentialDrive1 = new DifferentialDrive(MotorControllerGroup, MotorControllerGroup2);

    differentialDrive1.setSafetyEnabled(false);
  }

  public static void broombroom() {
    //MotorControllerGroup.set(0.8);
    //MotorControllerGroup2.set(0);
    //leftSpeed: -0.8 = clockwise
    //leftSpeed: 0.8 = counterclockwise
    differentialDrive1.tankDrive(-0.7,0.7);
  }



  public void DriveCode(double x, double y) {

    differentialDrive1.tankDrive(x * -1, y * 1);

  }

  public void DriveBackward(double speed) {
    MotorControllerGroup.set(speed);
    MotorControllerGroup2.set(speed);
  }

  public static void DriveStop(){

    differentialDrive1.tankDrive(0,0);
  }

  public void onTest() {
    talonSRX1.set(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic(){
    // This method will be called once per scheduler run during simulation
  }
 //Don't know if this is necessary but it was in last year's code

 

}
