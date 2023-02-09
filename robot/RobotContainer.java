// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project. 

package frc.robot;

//import frc.robot.Constants.OperatorConstants;
//import frc.robot.commands.Autos;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
//our own non-automatic imports below
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.commands.DriveCommand;
//import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.*;
//import edu.wpi.first.wpilibj2.command.button.*;
//import frc.robot.commands.*;
//import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.auto;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drive m_Drive = new Drive();
  public Joystick driverJoystick = new Joystick(0);
  
  // Replace with CommandPS4Controller or CommandJoystick if needed
  // private final CommandJoystick m_driverController = //Switched from CommandXboxConroller to CommandJoystick
  //     new CommandJoystick(OperatorConstants.kDriverControllerPort); //Don't know if this is necessary or not

      public Joystick oJoystick = new Joystick(1);

      public JoystickButton A1 = new JoystickButton(oJoystick, 0);
      public JoystickButton B1 = new JoystickButton(oJoystick, 2);
      public JoystickButton X1 = new JoystickButton(oJoystick, 3);
      public JoystickButton Y1 = new JoystickButton(oJoystick, 4);
      public JoystickButton TL = new JoystickButton(oJoystick, 5);
      public JoystickButton TR = new JoystickButton(oJoystick, 6);
      public JoystickButton back = new JoystickButton(oJoystick, 7);
      public JoystickButton start = new JoystickButton(oJoystick, 8);
      public JoystickButton lStick = new JoystickButton(oJoystick,9);
      public JoystickButton A2 = new JoystickButton(driverJoystick, 1);
      public JoystickButton B2 = new JoystickButton(driverJoystick, 2);
      public JoystickButton X2 = new JoystickButton(driverJoystick, 3);
      public JoystickButton Y2 = new JoystickButton(driverJoystick, 4);
      public JoystickButton TL2 = new JoystickButton(driverJoystick, 5);
      public JoystickButton TR2 = new JoystickButton(driverJoystick, 6);
    
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    
    configureBindings();

    m_Drive.setDefaultCommand(new DriveCommand(m_Drive, () -> driverJoystick.getRawAxis(1), () -> driverJoystick.getRawAxis(5)));
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() { //Used to say configureButtonBindings
    
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    //new Trigger(m_exampleSubsystem::exampleCondition)
       // .onTrue(new ExampleCommand(m_exampleSubsystem));

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
    //m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  public Command getAutonomousCommand() {
    //return null;
    return new auto(m_Drive);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    //return Autos.exampleAuto(m_exampleSubsystem);
 // }
}
