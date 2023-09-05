package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "NatalieTest")
public class NatalieTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("name", "Natalie");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()){

        }
    }
}
