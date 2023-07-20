package osgi_paymentservicepublisher;

import java.util.Scanner;

public class PaymentServicePublishImpl implements PaymentServicePublish{

	@Override
	public void roomPayment() {
		System.out.println("***Welome To Payment Service Dashboard!***");
		

		while(true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("--These Are The Available Services,Please Select Option--");
			System.out.println("---------------------------------------------------------");
			System.out.println("[1] => | Room Payment Service");
			System.out.println("[2] => | Transport Payment Service");
			System.out.println("[3] => | Sport Payment Service");
			System.out.println("[4] => | exit");
			System.out.println("---------------------------------------------------------");
			System.out.print("Please enter Service Number : ");
			
			Scanner user_service = new Scanner(System.in);
			
			String userInputService = user_service.nextLine();
			System.out.println("\n");
			
			if(userInputService.equals("4")) {
				return;
			}
			
			if((userInputService.equals("1")) || (userInputService.equals("2")) || (userInputService.equals("3"))) {
				//option 1
				if(userInputService.equals("1")){
					System.out.println("--You selected The Hotel Room Payment Service--");
	
					while(true) {
						System.out.print("Please enter Room Number : ");
						Scanner user_service_roomNo = new Scanner(System.in);
						int userInputServiceRoom = user_service_roomNo.nextInt();
						//System.out.println("\n");		
						
						if(userInputServiceRoom<300 || userInputServiceRoom>304) {
							System.out.println("You entered an invalid room no, please enter valid room no according to your room booking receipt!!");
							continue;
						}else {
							if(userInputServiceRoom == 300) {
								while(true) {
									System.out.print("Please enter days you stayed : ");
									Scanner user_service_roomDays = new Scanner(System.in);
									int userInputServiceRoomDays = user_service_roomDays.nextInt();
									System.out.println("\n");
									
									if(userInputServiceRoomDays<1 || userInputServiceRoomDays>20) {
										System.out.println("You entered an invalid days, please enter valid days according to your room booking receipt!!");
										continue;
									}else {
										//discount
										if(userInputServiceRoomDays>5) {
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total Bill is Rs."+((1000*userInputServiceRoomDays)-(1000*userInputServiceRoomDays)*0.2));
											break;
										}else {
											//normel charge
											System.out.println("Your Total Bill is Rs."+1000*userInputServiceRoomDays+"0"); 
											break;
										}
										
									}
								}
								break;
							}
							if(userInputServiceRoom == 301) {
								while(true) {
									System.out.print("Please enter days you stayed : ");
									Scanner user_service_roomDays = new Scanner(System.in);
									int userInputServiceRoomDays = user_service_roomDays.nextInt();
									System.out.println("\n");
									
									if(userInputServiceRoomDays<1 || userInputServiceRoomDays>20) {
										System.out.println("You entered an invalid days, please enter valid days according to your room booking receipt!!");
										continue;
									}else {
										//discount
										if(userInputServiceRoomDays>5) {
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total Bill is Rs."+((1000*userInputServiceRoomDays)-(1000*userInputServiceRoomDays)*0.2));
											break;
										}else {
											//normel charge
											System.out.println("Your Total Bill is Rs."+1000*userInputServiceRoomDays+"0"); 
											break;
										}
									}
								}
								break;
							}
							
							if(userInputServiceRoom == 302) {
								while(true) {
									System.out.print("Please enter days you stayed : ");
									Scanner user_service_roomDays = new Scanner(System.in);
									int userInputServiceRoomDays = user_service_roomDays.nextInt();
									System.out.println("\n");
									
									if(userInputServiceRoomDays<1 || userInputServiceRoomDays>20) {
										System.out.println("You entered an invalid days, please enter valid days according to your room booking receipt!!");
										continue;
									}else {
										//discount
										if(userInputServiceRoomDays>5) {
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total Bill is Rs."+((1000*userInputServiceRoomDays)-(1000*userInputServiceRoomDays)*0.2));
											break;
										}else {
											//normel charge
											System.out.println("Your Total Bill is Rs."+1000*userInputServiceRoomDays+"0"); 
											break;
										}
									}
								}
								break;
							}
							if(userInputServiceRoom == 303) {
								while(true) {
									System.out.print("Please enter days you stayed : ");
									Scanner user_service_roomDays = new Scanner(System.in);
									int userInputServiceRoomDays = user_service_roomDays.nextInt();
									System.out.println("\n");
									
									if(userInputServiceRoomDays<1 || userInputServiceRoomDays>20) {
										System.out.println("You entered an invalid days, please enter valid days according to your room booking receipt!!");
										continue;
									}else {
										//discount
										if(userInputServiceRoomDays>5) {
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total Bill is Rs."+((1000*userInputServiceRoomDays)-(1000*userInputServiceRoomDays)*0.2));
											break;
										}else {
											//normel charge
											System.out.println("Your Total Bill is Rs."+1000*userInputServiceRoomDays+"0"); 
											break;
										}
									}
								}
								break;
							}
							if(userInputServiceRoom == 304) {
								while(true) {
									System.out.print("Please enter days you stayed : ");
									Scanner user_service_roomDays = new Scanner(System.in);
									int userInputServiceRoomDays = user_service_roomDays.nextInt();
									System.out.println("\n");
									
									if(userInputServiceRoomDays<1 || userInputServiceRoomDays>20) {
										System.out.println("You entered an invalid days, please enter valid days according to your room booking receipt!!");
										continue;
									}else {
										//discount
										if(userInputServiceRoomDays>5) {
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total Bill is Rs."+((1000*userInputServiceRoomDays)-(1000*userInputServiceRoomDays)*0.2));
											break;
										}else {
											//normel charge
											System.out.println("Your Total Bill is Rs."+1000*userInputServiceRoomDays+"0"); 
											break;
										}
									}
								}
								break;
							}
						}//else
					}//while
				}//if "1" end
				
				//System.out.println("--------------------------------");
				//System.out.println("\n");
				
				//option 2
				if(userInputService.equals("2")){
					System.out.println("--You Selected The Hotel Transport Pyament Service--");
					
					while(true) {
						System.out.print("Please enter total KM/s : ");
						Scanner user_service_transport = new Scanner(System.in);
						int userInputServiceKM = user_service_transport.nextInt();
						System.out.println("\n");		
						
						if(userInputServiceKM<2 || userInputServiceKM>100) {
							System.out.println("You entered an invalid KM/s, please enter valid KM/s according to your transport receipt!!");
							continue;
						}else {
							
							if(userInputServiceKM >= 2 && userInputServiceKM <= 10 ) {
								System.out.println("The Number of KM/s You Traveled "+userInputServiceKM);
								System.out.println("Congratulations! You Have a 5% Discount!!!");
								System.out.println("Your Total Transport Bill "+((userInputServiceKM*300)-(userInputServiceKM*300*0.05)));
								break;
							}
							
							if(userInputServiceKM > 10 && userInputServiceKM <= 50) {
								System.out.println("The Number of KM/s You Traveled "+userInputServiceKM);
								System.out.println("Congratulations! You Have a 10% Discount!!!");
								System.out.println("Your Total Transport Bill "+((userInputServiceKM*300)-(userInputServiceKM*300*0.1)));
								break;
							}
							
							if(userInputServiceKM >= 51 && userInputServiceKM <= 100) {
								System.out.println("The Number of KM/s You Traveled "+userInputServiceKM);
								System.out.println("Congratulations! You Have a 12% Discount!!!");
								System.out.println("Your Total Transport Bill "+((userInputServiceKM*300)-(userInputServiceKM*300*0.12)));
								break;
							}
							break;
						}
					}
				}//if "2" end
				//System.out.println("\n");
				
				//option 3
				if(userInputService.equals("3")){
					System.out.println("--You Selected The Hotel Sport Club Service--");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println("--These Are The Available Services Under The Sport Club,Please Select Option--");
					System.out.println("------------------------------------------------------------------------------");
					
					while(true) {
						System.out.println("[1] => Swimming Pool Facility");
						System.out.println("[2] => Billiard Sport Facility");
						System.out.println("[3] => exit");
						System.out.println("------------------------------------------------------------------------------");
						System.out.print("Please enter Soprt Club Service Number : ");
						
						Scanner user_sport = new Scanner(System.in);
						
						String userInputSport = user_sport.nextLine();
						System.out.println("\n");
						
						if(userInputSport.equals("3")) {
							return;
						}
						
						if((userInputSport.equals("1")) || (userInputSport.equals("2"))) {
							if(userInputSport.equals("1")) {
								System.out.println("--You Selected Sport Club Service as Swimming Pool--");
								while(true) {
									System.out.print("Please enter hours you played : ");
									Scanner user_service_hours = new Scanner(System.in);
									int userInputServiceHours = user_service_hours.nextInt();
									//System.out.println("\n");
									
									if(userInputServiceHours<1 || userInputServiceHours>24) {
										System.out.println("You entered an invalid hours, please enter valid hours according to your sport club receipt!!");
										continue;
									}else {
										//normal charge
										if(userInputServiceHours>1 && userInputServiceHours<=8) {
											System.out.println("You played "+userInputServiceHours+" hours");
											System.out.println("Your Total fee is Rs."+userInputServiceHours*500+"0");
											break;
										}else {
											//discount
											System.out.println("You played "+userInputServiceHours+" hours");
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total fee is Rs."+((userInputServiceHours*350)-(userInputServiceHours*350*0.2))+"0"); 
											break;
										}
									}
								}
								break;
							}
							
							if(userInputSport.equals("2")) {
								System.out.println("--You Selected Sport Club Service as Billiard--");
								while(true) {
									System.out.print("Please enter hours you played : ");
									Scanner user_service_hours = new Scanner(System.in);
									int userInputServiceHours = user_service_hours.nextInt();
									System.out.println("\n");
									
									if(userInputServiceHours<1 || userInputServiceHours>24) {
										System.out.println("You entered an invalid hours, please enter valid hours according to your sport club receipt!!");
										continue;
									}else {
										//normal charge
										if(userInputServiceHours>1 && userInputServiceHours<=5) {
											System.out.println("You played "+userInputServiceHours+" hours");
											System.out.println("Your Total fee is Rs."+userInputServiceHours*200+"0");
											break;
										}else {
											//discount
											System.out.println("You played "+userInputServiceHours+" hours");
											System.out.println("Congratulations! You Have a 20% Disscount!!!");
											System.out.println("Your Total fee is Rs."+((userInputServiceHours*150)-(userInputServiceHours*150*0.2))+"0"); 
											break;
										}
									}
								}
								break;
							}
							
						}else {
							System.out.println("You entered invalid sport club service number!!!");
							continue;
						}
					
					
				   }//if 3 end
				}
			}else {
				System.out.println("You entered invalid hotel service number!!!");
				continue;
			}
			
			
		}
		
		
		
		
		
		
		
	}
	
	/*@Override
	public void tansportPayment() {
		System.out.println("***You have selected the service as Teansport Payment!***");
		
		System.out.println("please enter your km s :");
		Scanner km_sc = new Scanner(System.in);
		String km = km_sc.nextLine();
		
		System.out.println("***Your Total km s are!***" + km);
	}*/

}
