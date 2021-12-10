package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class MyFIRSTJavaOpMode extends LinearOpMode {
    //private Gyroscope imu;
    private DcMotor motorTest;
    private DcMotor motorTest2;
    private DigitalChannel digitalTouch;
    //private DistanceSensor sensorColorRange;
    //private Servo servoTest;
    @Override
    public void runOpMode() {
        //  imu = hardwareMap.get(Gyroscope.class, "imu");
        motorTest = hardwareMap.get(DcMotor.class, "motorTest");
        motorTest2 = hardwareMap.get(DcMotor.class, "motorTest2");
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
            motorTest.setPower(tgtPowerLeft);
            telemetry.addData("Target Power", tgtPowerLeft);
            telemetry.addData("Motor Power", motorTest.getPower());
            telemetry.addData("Status", "Running");
            tgtPowerRight = -this.gamepad1.right_stick_y;
            motorTest2.setPower(tgtPowerRight);
            telemetry.addData("Target Power", tgtPowerRight);
            telemetry.addData("Motor Power", motorTest2.getPower());
            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
