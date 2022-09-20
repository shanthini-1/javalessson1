package com.chainsys.unittest;

import com.chainsys.interfaces.Vehicle1;
import com.chainsys.interfaces.VehicleCar;
import com.chainsys.interfaces.VehicleShip;

public class TestVehicle {
	public static void testVehicle() {
		Vehicle1 v1;// =new IVehicle();
		v1 = new VehicleCar();
		v1.echo();
		v1.start();
		v1.stop();
//v1.park();
// type cast the Object to the Car class
		VehicleCar c1 = (VehicleCar) v1;
		c1.park();
		v1 = new VehicleShip();
		v1.echo();
		v1.start();
		v1.stop();
	}
}