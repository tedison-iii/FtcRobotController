package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class HWMap {
    //create motors
    public DcMotor backLeftMotor = null;
    public DcMotor backRightMotor = null;
    public DcMotor intakeRight = null;
    public DcMotor intakeLeft = null;
    public DcMotor armMotor1 = null;

    //create servo
    public Servo testServo = null;

    //additional variables
           HardwareMap hardwareMap = null;
    public ElapsedTime runTime = new ElapsedTime();

    public HWMap(HardwareMap CMap) {
        initialize(CMap);
    }

    private void initialize(HardwareMap CMap) {
        hardwareMap =CMap;

        //connect motors

        //backLeftMotor = hardwareMap.get(DcMotor.class, deviceName:"backLeft");
        //backRightMotor = hardwareMap.get(DcMotor.class,deviceName:"");
        //intakeRight = hardwareMap.get(DcMotor.class,deviceName:"");
        //intakeLeft = hardwareMap.get(DcMotor.class,deviceName:"");
        //armMotor = hardwareMap.get(DcMotor.class,deviceName:"");

        //connect servos

        // set up motor direction
        backLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        backRightMotor.setDirection(DcMotor.Direction.FORWARD);

        // set ZERO POWER BEHAVIOR
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // set motors to use no power
        backRightMotor.setPower(0);
        backLeftMotor.setPower(0);
    }
}
