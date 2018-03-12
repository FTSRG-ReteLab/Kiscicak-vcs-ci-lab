package hu.bme.mit.train.controller;

import hu.bme.mit.train.interfaces.TrainController;

import java.util.Timer;
import java.util.TimerTask;

public class TrainControllerImpl implements TrainController {

	private int step = 0;
	private int referenceSpeed = 0;
	private int speedLimit = 0;
	private Thread thread;

<<<<<<< HEAD


	public TrainControllerImpl(){
		thread = new Thread(){
			public void run() {
=======
	public TrainControllerImpl(){
		thread = new Thread(){
			public void run(){
>>>>>>> 3078a521e726fda377e624e4041a96aacf330ef4
				thread.run();
				try {
					followSpeed();
					thread.sleep(2000);
<<<<<<< HEAD
				}catch (InterruptedException e){
=======
				} catch (InterruptedException e){
>>>>>>> 3078a521e726fda377e624e4041a96aacf330ef4
					e.printStackTrace();
				}
			}
		};
	}


<<<<<<< HEAD

=======
>>>>>>> 3078a521e726fda377e624e4041a96aacf330ef4

	@Override
	public void followSpeed() {
		if (referenceSpeed < 0) {
			referenceSpeed = 0;
		} else {
		    if(referenceSpeed+step > 0) {
                referenceSpeed += step;
            } else {
		        referenceSpeed = 0;
            }
		}

		enforceSpeedLimit();
	}

	@Override
	public int getReferenceSpeed() {
		return referenceSpeed;
	}

	@Override
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		enforceSpeedLimit();
		
	}

	private void enforceSpeedLimit() {
		if (referenceSpeed > speedLimit) {
			referenceSpeed = speedLimit;
		}
	}

	@Override
	public void setJoystickPosition(int joystickPosition) {
		this.step = joystickPosition;		
	}

}
