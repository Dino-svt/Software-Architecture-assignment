public class RemoteControlTest {
    public static void main(String[] args){
      RemoteControl remoteControl = new RemoteControl(2);


      Light KitchenLight = new KitchenRoomLight();
      Light LivingLight  = new LivingRoomLight();



        Command KitchenLightOn = new LightOnCommand(KitchenLight);
        Command KitchenLightOff = new LightOffCommand(KitchenLight);
        Command KitchenLightDim = new LightDimCommand(KitchenLight,50);



        Command LivingLightOn = new LightOnCommand(LivingLight);
        Command LivingLightOff = new LightOffCommand(LivingLight);
        Command LivingLightDim = new LightDimCommand(LivingLight,30);



        remoteControl.setCommand(0, KitchenLightOn, KitchenLightOff);
        remoteControl.setCommand(1, LivingLightOn, LivingLightOff);


        RemoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.UndoButtonWasPressed();

        RemoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.UndoButtonWasPressed();


        KitchenLightDim.execute();
        KitchenLightDim.Undo();


        LivingLightDim.execute();
        LivingLightDim.Undo();




    }
}
