package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Mecanum Linear Teleop")
public class MecanumLinearTeleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //Initialization Code goes here
        DcMotorEx frontRight;
        DcMotorEx frontLeft;
        DcMotorEx rearRight;
        DcMotorEx rearLeft;

        frontRight = hardwareMap.get(DcMotorEx.class, "front_right");
        frontLeft = hardwareMap.get(DcMotorEx.class, "front_left");
        rearRight = hardwareMap.get(DcMotorEx.class, "rear_right");
        rearLeft = hardwareMap.get(DcMotorEx.class, "rear_left");

        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        rearRight.setDirection(DcMotorSimple.Direction.FORWARD);
        rearLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rearRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rearLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Servo servoOne;
        servoOne = hardwareMap.get(Servo.class, "servo_one");
        //servoOne.setPosition(0.5);  //Servo position on Init
        //servoOne.scaleRange(0.2, 0.8);  //Sets range, 0 and 1 will now be 0.2 and 0.8
        CRServo servoTwo;
        servoTwo = hardwareMap.get(CRServo.class, "servo_two");

        waitForStart();

        while (opModeIsActive()){

            frontRight.setPower(-gamepad1.right_stick_y);
            frontLeft.setPower(-gamepad1.left_stick_y);
            rearRight.setPower(-gamepad1.right_stick_y);
            rearLeft.setPower(-gamepad1.left_stick_y);

            servoOne.setPosition(1);  //Servo position can be set anywhere between [0 and 1] you can program the servos to be in the right positions via SRS
            servoTwo.setPower(1); //use 0 or 1 to forward or reverse

        }
    }
}
