package com.tcs.healthcare;
import com.tcs.healthcare.audit.*;
import com.tcs.healthcare.finance.*;
import com.tcs.healthcare.providers.*;
import com.tcs.healthcare.medicines.*;
import com.tcs.healthcare.transportation.*;
import com.tcs.healthcare.patients.*;

class Welcome {
	public static void main(String args[]){
	   System.out.println("welcome to java");
	   Supportive supportive = new Supportive();
	   Providers provider = new Providers();
	   Transportation trans = new Transportation();
	   Audit audit = new Audit();
	   Patients pat = new Patients ();
	   Medicines med = new Medicines();
	   
	}
	
}