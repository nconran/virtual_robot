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
        int counter = 0;
        while (opModeIsActive()){
            counter++;
            telemetry.addData("counter", counter);
            telemetry.update();
        }
    }
}
