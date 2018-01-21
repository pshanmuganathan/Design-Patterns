package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import AbstractFactory.Afactory1;
import AbstractFactory.Afactory2;
import DataContainer.DataMaster;
import InputProcessor.GasPump1;
import InputProcessor.GasPump2;
import MDAEFSM.mdaMaster;
import OutputProcessor.Outputproc;
import State.State0;
import State.State1;
import State.State2;
import State.State3;
import State.State4;
import State.State5;
import State.State6;
import State.State7;

public class MainClass {
	static Scanner userchoice=new Scanner(System.in);
	static BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	static String menuchoice = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("\n\t\t\t\t Gas Pump Station\t\t\t\n");
		System.out.println("Choose among the Gas Pumps below : ");
		System.out.println("1. Gas Pump 1");
		System.out.println("2. Gas Pump 2");
		System.out.println("Your Choice : ");
		int choice = userchoice.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			GasPump1 gaspump_obj = new GasPump1();
			mdaMaster mda_obj = new mdaMaster();
			Afactory1 af1_obj = new Afactory1();
			Outputproc output_obj = new Outputproc();
			DataMaster data_obj;
			
			State0 state0_obj = new State0();
			State1 state1_obj = new State1();
			State2 state2_obj = new State2();
			State3 state3_obj = new State3();
			State4 state4_obj = new State4();
			State5 state5_obj = new State5();
			State6 state6_obj = new State6();
			State7 state7_obj = new State7();
			
			data_obj = af1_obj.getdataobject();
			
			gaspump_obj.setmdaobject(mda_obj);
			gaspump_obj.setfactoryobject(af1_obj);
			gaspump_obj.setdataobject(data_obj);
			
			state0_obj.setOutputObject(output_obj);
			state0_obj.setStateId(0);
			state1_obj.setOutputObject(output_obj);
			state1_obj.setStateId(1);
			state2_obj.setOutputObject(output_obj);
			state2_obj.setStateId(2);
			state3_obj.setOutputObject(output_obj);
			state3_obj.setStateId(3);
			state4_obj.setOutputObject(output_obj);
			state4_obj.setStateId(4);
			state5_obj.setOutputObject(output_obj);
			state5_obj.setStateId(5);
			state6_obj.setOutputObject(output_obj);
			state6_obj.setStateId(6);
			state7_obj.setOutputObject(output_obj);
			state7_obj.setStateId(7);
			
			mda_obj.setCurrentState(state0_obj);
			mda_obj.AddStateList(state0_obj,state1_obj,state2_obj,state3_obj,state4_obj,state5_obj,state6_obj,state7_obj);
			
			
			output_obj.setdataobject(data_obj);
			output_obj.setfactoryobject(af1_obj);
			
			while(true)
			{
				System.out.println("\n\n Please select your option from the list below to procees with GasPump1\t\t");
				System.out.println("\n\t\t 0.\t Activate()"); 
				System.out.println("\n\t\t 1.\t Start()");
				System.out.println("\n\t\t 2.\t PayCredit()");
				System.out.println("\n\t\t 3.\t Reject()");
				System.out.println("\n\t\t 4.\t Approved()");
				System.out.println("\n\t\t 5.\t Cancel()");
				System.out.println("\n\t\t 6.\t Super() ");
				System.out.println("\n\t\t 7.\t Regular()");
				System.out.println("\n\t\t 8.\t StartPump() ");
				System.out.println("\n\t\t 9.\t PumpGallon() ");
				System.out.println("\n\t\t 10.\t StopPump() ");
				System.out.println("\n\t\t Press any other key to exit \n\n ");
				
				menuchoice = buffer.readLine();
				int n = Integer.parseInt(menuchoice);
				
				switch(n)
				{
				case 0:
						System.out.println("Enter the Value for Super and Regular price for  activating the GasPump : ");
						int a = Integer.parseInt(buffer.readLine());
						int b = Integer.parseInt(buffer.readLine());
						gaspump_obj.Activate(a,b);
						break;
						
				case 1:
						gaspump_obj.Start();
						break;
				case 2:
						gaspump_obj.PayCredit();
						break;
				case 3:
						gaspump_obj.Reject();
						break;
				case 4:
						gaspump_obj.Approved();
						break;
				case 5:
						gaspump_obj.Cancel();
						break;
				case 6:
						gaspump_obj.Super();
						break;
				case 7:
						gaspump_obj.Regular();
						break;
				case 8:
						gaspump_obj.StartPump();
						break;
				case 9:
						gaspump_obj.PumpGallon();
						break;
				case 10:
						gaspump_obj.StopPump();
						break;
				default:
					System.out.println("default");
				}
			}
		}
		case 2:
		{

			GasPump2 gaspump_obj = new GasPump2();
			mdaMaster mda_obj = new mdaMaster();
			Afactory2 af2_obj = new Afactory2();
			Outputproc output_obj = new Outputproc();
			DataMaster data_obj;
			
			State0 state0_obj = new State0();
			State1 state1_obj = new State1();
			State2 state2_obj = new State2();
			State3 state3_obj = new State3();
			State4 state4_obj = new State4();
			State5 state5_obj = new State5();
			State6 state6_obj = new State6();
			State7 state7_obj = new State7();
			
			data_obj = af2_obj.getdataobject();
			
			gaspump_obj.setmdaobject(mda_obj);
			gaspump_obj.setfactoryobject(af2_obj);
			gaspump_obj.setdataobject(data_obj);
			
			state0_obj.setOutputObject(output_obj);
			state0_obj.setStateId(0);
			state1_obj.setOutputObject(output_obj);
			state1_obj.setStateId(1);
			state2_obj.setOutputObject(output_obj);
			state2_obj.setStateId(2);
			state3_obj.setOutputObject(output_obj);
			state3_obj.setStateId(3);
			state4_obj.setOutputObject(output_obj);
			state4_obj.setStateId(4);
			state5_obj.setOutputObject(output_obj);
			state5_obj.setStateId(5);
			state6_obj.setOutputObject(output_obj);
			state6_obj.setStateId(6);
			state7_obj.setOutputObject(output_obj);
			state7_obj.setStateId(7);
			
			mda_obj.setCurrentState(state0_obj);
			mda_obj.AddStateList(state0_obj,state1_obj,state2_obj,state3_obj,state4_obj,state5_obj,state6_obj,state7_obj);
			
			
			output_obj.setdataobject(data_obj);
			output_obj.setfactoryobject(af2_obj);
			
			while(true)
			{
				System.out.println("\n\n Please select your option from the list below to procees with GasPump1\t\t");
				System.out.println("\n\t\t 0.\t Activate()"); 
				System.out.println("\n\t\t 1.\t Start()");
				System.out.println("\n\t\t 2.\t PayCash()");
				System.out.println("\n\t\t 3.\t Cancel()");
				System.out.println("\n\t\t 4.\t Premium()");
				System.out.println("\n\t\t 5.\t Regular()");
				System.out.println("\n\t\t 6.\t Super() ");
				
				System.out.println("\n\t\t 7.\t StartPump() ");
				System.out.println("\n\t\t 8.\t PumpLiter() ");
				System.out.println("\n\t\t 9.\t StopPump() ");
				System.out.println("\n\t\t 10.\t Receipt() ");
				System.out.println("\n\t\t 11.\t NoReceipt() ");
				System.out.println("\n\t\t Press any other key to exit \n\n ");
				
				menuchoice = buffer.readLine();
				int n = Integer.parseInt(menuchoice);
				
				switch(n)
				{
				case 0:
						System.out.println("Enter the Value for Regular,Super and Premium price for  activating the GasPump : ");
						int a = Integer.parseInt(buffer.readLine());
						int b = Integer.parseInt(buffer.readLine());
						int c = Integer.parseInt(buffer.readLine());
						gaspump_obj.Activate(a,b,c);
						break;
						
				case 1:
						gaspump_obj.Start();
						break;
				case 2:
						System.out.println("Enter the Cash Value ");
						int cash = Integer.parseInt(buffer.readLine());
						gaspump_obj.PayCash(cash);
						break;
				case 3:
						gaspump_obj.Cancel();
						break;
				case 4:
						gaspump_obj.Premium();
						break;
				case 5:
						gaspump_obj.Regular();
						break;
				case 6:
						gaspump_obj.Super();
						break;
				case 7:
						gaspump_obj.StartPump();
						break;
				case 8:
						gaspump_obj.PumpLiter();
						break;
				case 9:
						gaspump_obj.StopPump();
						break;
				case 10:
						gaspump_obj.Receipt();
						break;
				case 11:
						gaspump_obj.NoReceipt();
						break;
				default:
					System.out.println("default");	
		}
		}
	}
		}
	}
}

	
