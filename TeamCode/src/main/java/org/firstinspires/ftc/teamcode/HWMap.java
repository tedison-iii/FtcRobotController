package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class HWMap {
    //create motors
    public DcMotor backLeftMotor = null;
    public DcMotor backRightMotor = null;
    public DcMotor intakeRight = null;
    public DcMotor intakeLeft = null;
    public DcMotor armMotor = null;

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

        //backLeftMotor = hardwareMap.get(DcMotor.class,deviceName:"");
        //backRightMotor = hardwareMap.get(DcMotor.class,deviceName:"");
        //intakeRight = hardwareMap.get(DcMotor.class,deviceName:"");
        //intakeLeft = hardwareMap.get(DcMotor.class,deviceName:"");
        //armMotor = hardwareMap.get(DcMotor.class,deviceName:"");
    }
}
