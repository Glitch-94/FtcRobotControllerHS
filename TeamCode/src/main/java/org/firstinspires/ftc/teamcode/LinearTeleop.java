package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "First_Teleop")
public class LinearTeleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //initialization code goes here
        DcMotor motorOne;
        motorOne = hardwareMap.get(DcMotor.class, "motor_one");

        DcMotorEx motorTwo;
        motorTwo = hardwareMap.get(DcMotorEx.class, "motor_two");

        /* Set Directions to the motors
        motorOne.setDirection(DcMotorSimple.Direction.FORWARD);
        motorOne.setDirection(DcMotorSimple.Direction.REVERSE);
        */

        /* Set Braking Behavior, Brake stops motor, float will coast motor
        motorOne.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorOne.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        */

        //Motor Set modes
        // Run motor with encoder, tells motor to use encoder to manage power, will ensure motor runs at that power
        //motorOne.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Tells motor to run without using Encoder
        //motorOne.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Takes whatever encoder value is and reset it to zero
        //motorOne.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        waitForStart();

        while(opModeIsActive()){
            //motorOne.setPower(); //inputs are from [-1 to 1]

            //Below is DcMotorEx Code
            motorTwo.setVelocity(150);  //sets rate of motor in Ticks per second, is used with the run with encoder
                                        //Good for flywheels and more accurate than setpower.
        }
    }
}
