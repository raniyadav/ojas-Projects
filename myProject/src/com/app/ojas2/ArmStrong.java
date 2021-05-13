package com.app.ojas2;

public class ArmStrong {
	
		public static void main(String[] args) {


				int r, temp = 0, sum = 0;

				try {
						int n = Integer.parseInt(args[0]);
						temp = n;
						
						if (n<0 || args[0].length() != 4) {
							System.out.println("Error");

						}

						else {

							while (n > 0) {
								r = n % 10;
								n = n / 10;
								sum = sum + (r * r * r * r);
							}
							if (temp == sum)
								System.out.println("it is armstrong");

							else

								System.out.println("it is not armstrong");
						}

						

				} 
				catch (Exception e) {
					System.out.println("Error");
				}

			}                                                  

		}                                                   

		


