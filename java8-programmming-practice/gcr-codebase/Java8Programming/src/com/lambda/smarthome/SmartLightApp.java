package com.lambda.smarthome;

public class SmartLightApp {

    public static void main(String[] args) {

        LightAction motionTrigger = () -> 
            System.out.println("Lights ON at full brightness due to motion");

        LightAction nightTimeTrigger = () -> 
            System.out.println("Lights ON at dim mode for night");

        LightAction voiceCommandTrigger = () -> 
            System.out.println("Lights turned ON via voice command");

        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceCommandTrigger.activate();
    }
}
