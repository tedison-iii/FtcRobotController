package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="TestOpMode", group= "Iterative Opmode")

public class MyFIRSTJavaOpMode extends LinearOpMode {
    //private Gyroscope imu;
    private DcMotor motorLeft;
    private DcMotor motorRight;
    private DcMotor inLeft;
    private DcMotor inRight;
    private DigitalChannel digitalTouch;
    //private DistanceSensor sensorColorRange;
    //private Servo servoTest;
    @Override
    public void runOpMode() {
        //  imu = hardwareMap.get(Gyroscope.class, "imu");
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        //  digitalTouch = hardwareMap.get(DigitalChannel.class, "digitalTouch");
        //sensorColorRange = hardwareMap.get(DistanceSensor.class, "sensorColorRange");
        //servoTest = hardwareMap.get(Servo.class, "servoTest");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for game to start (driver presses PLAY)
        waitForStart();

        // run until the end of match (driver presses STOP)
        double tgtPowerLeft = 0;
        double tgtPowerRight = 0;
        while (opModeIsActive()) {
            tgtPowerLeft = -this.gamepad1.left_stick_y;
            motorLeft.setPower(tgtPowerLeft);
            telemetry.addData("Target Power", tgtPowerLeft);
            telemetry.addData("Motor Power", motorLeft.getPower());
            telemetry.addData("Status", "Running");
            tgtPowerRight = -this.gamepad1.right_stick_y;
            motorRight.setPower(tgtPowerRight);
            telemetry.addData("Target Power", tgtPowerRight);
            telemetry.addData("Motor Power", motorRight.getPower());
            telemetry.addData("Status", "Running");
            telemetry.update();

            if (gamepad1.a)
            {
                inLeft.setPower(0.5);
                inRight.setPower(0.5);
            }
            else if(gamepad1.a)
            {
                inLeft.setPower(0.0);
                inRight.setPower(0.0);
            }

            idle();
        }
    }
}
