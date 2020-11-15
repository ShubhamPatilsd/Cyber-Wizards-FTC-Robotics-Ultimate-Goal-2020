/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;


import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */
public class HardwareTest
{
    /* Public OpMode members. */
     public DcMotor  frontleft = null;
     public DcMotor  frontright = null;
     public DcMotor  downleft = null;
     public DcMotor  downright = null;
     //public Servo FrontCollector = null;
     //public Servo FoundationGrabber1 = null;
     //public Servo FoundationGrabber2 = null;
     //public ColorSensor sensorColor;
     //public DistanceSensor sensorDistance ;




    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period  = new ElapsedTime();



    /* Constructor */
    public HardwareTest(){


    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap hwMap) {
        // Save reference to Hardware map
        hwMap = hwMap;

        // Define and Initialize Motors
        frontleft = hwMap.get(DcMotor.class, "frontleft");
        downleft = hwMap.get(DcMotor.class, "downleft");
        frontright = hwMap.get(DcMotor.class, "frontright");
        downright = hwMap.get(DcMotor.class, "downright");
        //FrontCollector = hwMap.get(Servo.class,"FrontCollector");
        //FoundationGrabber1 = hwMap.get(Servo.class,"FoundationGrabber1");
        //FoundationGrabber2 = hwMap.get(Servo.class,"FoundationGrabber2");
        //sensorColor = hwMap.get(ColorSensor.class, "color");
        //sensorDistance = hwMap.get(DistanceSensor.class, "color");



        frontleft.setDirection(DcMotor.Direction.FORWARD);
        frontright.setDirection(DcMotor.Direction.REVERSE);
        downleft.setDirection(DcMotor.Direction.FORWARD);
        downright.setDirection(DcMotor.Direction.REVERSE);

        //FrontCollector.setPosition(1.0);
        //FoundationGrabber1.setPosition(1.0);
        //FoundationGrabber2.setPosition(0.0);










        // Set all motors to zero power
        frontleft.setPower(0.0);
        frontright.setPower(0.0);
        downleft.setPower(0.0);
        downleft.setPower(0.0);


        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        //frontleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //downleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //downright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }
 }

