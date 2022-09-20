/*
 * reference work for marker interface and null interface
 */

package com.chainsys.interfaces;

public interface IVehicle {
	//constant
	public final int MAXSPEED=150;
	abstract void echo();
	abstract void start();
	abstract void stop();
}
/****
 * all interface are contract,and markers
 */
//null interface can be only marker, not a contract
interface IPetrol
{
}
