package homework1;

import java.util.Scanner;

public class PriceCalculatorS018752 {

	public static void main(String[] args) {
		
      
		Scanner sc = new Scanner(System.in);
		
		//enginetype//
		short enginetype;
		System.out.print("Enter the engine type:");                    // In this area, I wrote an input code  for engine type //
		enginetype = sc.nextShort();                                      
		  
		

		
		
		
		
		
		
		
		
		
		
		// production//
	    double productioncost;
		System.out.print("Enter the production cost:");                       // In this area, I wrote an input code for production cost //
		productioncost = sc.nextDouble();
		sc.close();
		
	//----------------------------------------- 1.month(1.ay) --------------------------------------//	
       double month1 = 0.60;
        	                                                              
		double profitamount = (productioncost * month1);                                            // In this area, I calculated profit amount and bat according to homeworktext
		double bat = profitamount + productioncost;
		                                                                        
		                                                                       
		                                                                         
		
		double newbat = 0;
	   double otvratio = 0;
			if (bat < 85000 && enginetype < 1600) { 
				otvratio = 0.45;
			 newbat = bat + (bat *otvratio); 
	    } else if (bat >= 85000 && enginetype < 1600 && bat < 130000) {            //  In this field, I wrote where to assign BAT according to production cost and the value of the engine type
			      otvratio = 0.50;                                                             
			      newbat = bat + (bat *otvratio);
		} else if (bat >= 130000  && enginetype < 1600) {
			     otvratio = 0.80;
			     newbat = bat +(bat *otvratio);
		} else if  (bat >= 0 && enginetype >=1600 && enginetype < 2000 && bat < 170000) {
			   otvratio = 1.30;
			   newbat = bat +(bat *otvratio);
		} else if (bat >= 170000 && enginetype >= 1600 && enginetype < 2000) {
			    otvratio = 1.50;
			    newbat = bat +(bat *otvratio);
		} else if (bat > 0 && enginetype >= 2000) {
			    otvratio = 2.20;
			    newbat = bat +(bat *otvratio);
		}
		double otv = (bat  * otvratio);	
		
		
		
		double kdvratio = 0;
		      if ( (newbat) < 85000) {
		    	        kdvratio = 0.10;
		      } else if ( (newbat) >=85000 && (newbat) < 130000) {
		    	        kdvratio = 0.12;           
		      } else if ( (newbat) >= 130000) {                                                                 
	    	        kdvratio = 0.18;                                                                // In this field, I wrote to find kdvratio according to newbat and calculate kdv
		      } else if ( (newbat) >=0 && (newbat) < 170000) {
	    	        kdvratio = 0.18;
		      } else if ( (newbat) >=170000) {
	    	        kdvratio = 0.20;
              } else if ( (newbat) > 0) {
	    	        kdvratio = 0.24;
              }
                  double kdv = newbat * kdvratio;                                              // The same is true what I wrote in other months.
                  double price = newbat + kdv;
      
                
              //----------------------------------------- 2.month(2.ay) --------------------------------------//	
                
        		
	
                double month2 = 0.55;
            	
        		double profitamount2 = (productioncost * month2);
        		
        		double bat2 = profitamount2 + productioncost;
        		
        		
        		
        		double newbat2 = 0;
        	   double otvratio2 = 0;
        			if (bat2 < 85000 && enginetype < 1600) { 
        				otvratio2 = 0.45;
        			 newbat2 = bat2 + (bat2 *otvratio2); 
        	    } else if (bat2 >= 85000 && enginetype < 1600 && bat2 < 130000) {
        			      otvratio2 = 0.50;
        			      newbat2 = bat2 + (bat2 *otvratio2);
        		} else if (bat2 >= 130000  && enginetype < 1600) {
        			     otvratio2 = 0.80;
        			     newbat2 = bat2 +(bat2 *otvratio2);
        		} else if  (bat2 >= 0 && enginetype >=1600 && enginetype < 2000 && bat2 < 170000) {
        			   otvratio2 = 1.30;
        			   newbat2 = bat2 +(bat2 *otvratio2);
        		} else if (bat2 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
        			    otvratio2 = 1.50;
        			    newbat2 = bat2 +(bat2 *otvratio2);
        		} else if (bat2 > 0 && enginetype >= 2000) {
        			    otvratio2 = 2.20;
        			    newbat2 = bat2 +(bat2 *otvratio2);
        		}
        		double otv2 = (bat2  * otvratio2);	
        		
        		
        		
        		
        		
        		double kdvratio2 = 0;
        		      if ( (newbat2) < 85000) {
        		    	        kdvratio2 = 0.10;
        		      } else if ( (newbat2) >=85000 && (newbat2) < 130000) {
        		    	        kdvratio2 = 0.12;
        		      } else if ( (newbat2) >= 130000) {
        	    	        kdvratio2 = 0.18;
        		      } else if ( (newbat2) >=0 && (newbat2) < 170000) {
        	    	        kdvratio2 = 0.18;
        		      } else if ( (newbat2) >=170000) {
        	    	        kdvratio2 = 0.20;
                      } else if ( (newbat2) > 0) {
        	    	        kdvratio2 = 0.24;
                      }
                          double kdv2 = newbat2 * kdvratio2;
                          double price2 = newbat2 + kdv2;
                     
                        
                        //----------------------------------------- 3.month(3.ay) --------------------------------------//	
                   
                		
        	
                        double month3 = 0.50;
                    	
                		double profitamount3 = (productioncost * month3);
                		
                		double bat3 = profitamount3 + productioncost;
                		
                		
                		
                		double newbat3 = 0;
                	   double otvratio3 = 0;
                			if (bat3 < 85000 && enginetype < 1600) { 
                				otvratio3 = 0.45;
                			 newbat3 = bat3 + (bat3 *otvratio3); 
                	    } else if (bat3 >= 85000 && enginetype < 1600 && bat3 < 130000) {
                			      otvratio3 = 0.50;
                			      newbat3 = bat3 + (bat3 *otvratio3);
                		} else if (bat3 >= 130000  && enginetype < 1600) {
                			     otvratio3 = 0.80;
                			     newbat3 = bat3 +(bat3 *otvratio3);
                		} else if  (bat3 >= 0 && enginetype >=1600 && enginetype < 2000 && bat3 < 170000) {
                			   otvratio3 = 1.30;
                			   newbat3 = bat3 +(bat3 *otvratio3);
                		} else if (bat3 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                			    otvratio3 = 1.50;
                			    newbat3 = bat3 +(bat3 *otvratio3);
                		} else if (bat3 > 0 && enginetype >= 2000) {
                			    otvratio3 = 2.20;
                			    newbat3 = bat3 +(bat3 *otvratio3);
                		}
                		double otv3 = (bat3  * otvratio3);	
                		
                		
                		
                		
                		
                		double kdvratio3 = 0;
                		      if ( (newbat3) < 85000) {
                		    	        kdvratio3 = 0.10;
                		      } else if ( (newbat3) >=85000 && (newbat3) < 130000) {
                		    	        kdvratio3 = 0.12;
                		      } else if ( (newbat3) >= 130000) {
                	    	        kdvratio3 = 0.18;
                		      } else if ( (newbat3) >=0 && (newbat3) < 170000) {
                	    	        kdvratio3 = 0.18;
                		      } else if ( (newbat3) >=170000) {
                	    	        kdvratio3 = 0.20;
                              } else if ( (newbat3) > 0) {
                	    	        kdvratio3 = 0.24;
                              }
                                  double kdv3 = newbat3 * kdvratio3;
                                  double price3 = newbat3 + kdv3;
                                
                                
                              //----------------------------------------- 4.month(4.ay) --------------------------------------//	
                              
                	
                                double month4 = 0.45;
                            	
                        		double profitamount4 = (productioncost * month4);
                        		
                        		double bat4 = profitamount4 + productioncost;
                        		
                        		
                        		
                        		double newbat4 = 0;
                        	   double otvratio4 = 0;
                        			if (bat4 < 85000 && enginetype < 1600) { 
                        				otvratio4 = 0.45;
                        			 newbat4 = bat4 + (bat4 *otvratio4); 
                        	    } else if (bat4 >= 85000 && enginetype < 1600 && bat4 < 130000) {
                        			      otvratio4 = 0.50;
                        			      newbat4 = bat4 + (bat4 *otvratio4);
                        		} else if (bat4 >= 130000  && enginetype < 1600) {
                        			     otvratio4 = 0.80;
                        			     newbat4 = bat4 +(bat4 *otvratio4);
                        		} else if  (bat4 >= 0 && enginetype >=1600 && enginetype < 2000 && bat4 < 170000) {
                        			   otvratio4 = 1.30;
                        			   newbat4 = bat4 +(bat4 *otvratio4);
                        		} else if (bat4 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                        			    otvratio4 = 1.50;
                        			    newbat4 = bat4 +(bat4 *otvratio4);
                        		} else if (bat4 > 0 && enginetype >= 2000) {
                        			    otvratio4 = 2.20;
                        			    newbat4 = bat4 +(bat4 *otvratio4);
                        		}
                        		double otv4 = (bat4  * otvratio4);	
                        		
                        		
                        		
                        		
                        		
                        		double kdvratio4 = 0;
                        		      if ( (newbat4) < 85000) {
                        		    	        kdvratio4 = 0.10;
                        		      } else if ( (newbat4) >=85000 && (newbat4) < 130000) {
                        		    	        kdvratio4 = 0.12;
                        		      } else if ( (newbat4) >= 130000) {
                        	    	        kdvratio4 = 0.18;
                        		      } else if ( (newbat4) >=0 && (newbat4) < 170000) {
                        	    	        kdvratio4 = 0.18;
                        		      } else if ( (newbat4) >=170000) {
                        	    	        kdvratio4 = 0.20;
                                      } else if ( (newbat4) > 0) {
                        	    	        kdvratio4 = 0.24;
                                      }
                                          double kdv4 = newbat4 * kdvratio4;
                                          double price4 = newbat4 + kdv4;
                                      
        	
                                        
                                      //----------------------------------------- 5.month(5.ay) --------------------------------------//	
                                     
                        	
                                        double month5 = 0.40;
                                    	
                                		double profitamount5 = (productioncost * month5);
                                		
                                		double bat5 = profitamount5 + productioncost;
                                		
                                		
                                		
                                		double newbat5 = 0;
                                	   double otvratio5 = 0;
                                			if (bat5 < 85000 && enginetype < 1600) { 
                                				otvratio5 = 0.45;
                                			 newbat5 = bat5 + (bat5 *otvratio5); 
                                	    } else if (bat5 >= 85000 && enginetype < 1600 && bat5 < 130000) {
                                			      otvratio5 = 0.50;
                                			      newbat5 = bat5 + (bat5 *otvratio5);
                                		} else if (bat5 >= 130000  && enginetype < 1600) {
                                			     otvratio5 = 0.80;
                                			     newbat5 = bat5 +(bat5 *otvratio5);
                                		} else if  (bat5 >= 0 && enginetype >=1600 && enginetype < 2000 && bat5 < 170000) {
                                			   otvratio5 = 1.30;
                                			   newbat5 = bat5 +(bat5 *otvratio5);
                                		} else if (bat5 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                                			    otvratio5 = 1.50;
                                			    newbat5 = bat5 +(bat5 *otvratio5);
                                		} else if (bat5 > 0 && enginetype >= 2000) {
                                			    otvratio5 = 2.20;
                                			    newbat5 = bat5 +(bat5 *otvratio5);
                                		}
                                		double otv5 = (bat5  * otvratio5);	
                                		
                                		
                                		
                                		
                                		
                                		double kdvratio5 = 0;
                                		      if ( (newbat5) < 85000) {
                                		    	        kdvratio5 = 0.10;
                                		      } else if ( (newbat5) >=85000 && (newbat5) < 130000) {
                                		    	        kdvratio5 = 0.12;
                                		      } else if ( (newbat5) >= 130000) {
                                	    	        kdvratio5 = 0.18;
                                		      } else if ( (newbat5) >=0 && (newbat5) < 170000) {
                                	    	        kdvratio5 = 0.18;
                                		      } else if ( (newbat5) >=170000) {
                                	    	        kdvratio5 = 0.20;
                                              } else if ( (newbat5) > 0) {
                                	    	        kdvratio5 = 0.24;
                                              }
                                                  double kdv5 = newbat5 * kdvratio5;
                                                  double price5 = newbat5 + kdv5;
                                               
                                                
                                                
                                              //----------------------------------------- 6.month(6.ay) --------------------------------------//	
                                              
                                                double month6 = 0.35;
                                            	
                                        		double profitamount6 = (productioncost * month6);
                                        	
                                        		double bat6 = profitamount6 + productioncost;
                                        		
                                        		
                                        		
                                        		double newbat6 = 0;
                                        	   double otvratio6 = 0;
                                        			if (bat6 < 85000 && enginetype < 1600) { 
                                        				otvratio6 = 0.45;
                                        			 newbat6 = bat6 + (bat6 *otvratio6); 
                                        	    } else if (bat6 >= 85000 && enginetype < 1600 && bat6 < 130000) {
                                        			      otvratio6 = 0.50;
                                        			      newbat6 = bat6 + (bat6 *otvratio6);
                                        		} else if (bat6 >= 130000  && enginetype < 1600) {
                                        			     otvratio6 = 0.80;
                                        			     newbat6 = bat6 +(bat6 *otvratio6);
                                        		} else if  (bat6 >= 0 && enginetype >=1600 && enginetype < 2000 && bat6 < 170000) {
                                        			   otvratio6 = 1.30;
                                        			   newbat6 = bat6 +(bat6 *otvratio6);
                                        		} else if (bat6 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                                        			    otvratio6 = 1.50;
                                        			    newbat6 = bat6 +(bat6 *otvratio6);
                                        		} else if (bat6 > 0 && enginetype >= 2000) {
                                        			    otvratio6 = 2.20;
                                        			    newbat6 = bat6 +(bat6 *otvratio6);
                                        		}
                                        		double otv6 = (bat6  * otvratio6);	
                                        	
                                        		
                                        		
                                        		
                                        		double kdvratio6 = 0;
                                        		      if ( (newbat6) < 85000) {
                                        		    	        kdvratio6 = 0.10;
                                        		      } else if ( (newbat6) >=85000 && (newbat6) < 130000) {
                                        		    	        kdvratio6 = 0.12;
                                        		      } else if ( (newbat6) >= 130000) {
                                        	    	        kdvratio6 = 0.18;
                                        		      } else if ( (newbat6) >=0 && (newbat6) < 170000) {
                                        	    	        kdvratio6 = 0.18;
                                        		      } else if ( (newbat6) >=170000) {
                                        	    	        kdvratio6 = 0.20;
                                                      } else if ( (newbat6) > 0) {
                                        	    	        kdvratio6 = 0.24;
                                                      }
                                                          double kdv6 = newbat6 * kdvratio6;
                                                          double price6= newbat6 + kdv6;
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        //----------------------------------------- 7.month(7.ay) --------------------------------------//	
                                               
                                                          double month7 = 0.30;
                                                      	
                                                  		double profitamount7 = (productioncost * month7);
                                                  	;
                                                  		double bat7 = profitamount7 + productioncost;
                                                  		
                                                  		
                                                  		
                                                  		double newbat7 = 0;
                                                  	   double otvratio7 = 0;
                                                  			if (bat7 < 85000 && enginetype < 1600) { 
                                                  				otvratio7 = 0.45;
                                                  			 newbat7 = bat7 + (bat7 *otvratio7); 
                                                  	    } else if (bat7 >= 85000 && enginetype < 1600 && bat7 < 130000) {
                                                  			      otvratio7 = 0.50;
                                                  			      newbat7 = bat7 + (bat7 *otvratio7);
                                                  		} else if (bat7 >= 130000  && enginetype < 1600) {
                                                  			     otvratio7 = 0.80;
                                                  			     newbat7 = bat7 +(bat7 *otvratio7);
                                                  		} else if  (bat7 >= 0 && enginetype >=1600 && enginetype < 2000 && bat7 < 170000) {
                                                  			   otvratio7 = 1.30;
                                                  			   newbat7 = bat7 +(bat7 *otvratio7);
                                                  		} else if (bat7 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                                                  			    otvratio7 = 1.50;
                                                  			    newbat7 = bat7 +(bat7 *otvratio7);
                                                  		} else if (bat7 > 0 && enginetype >= 2000) {
                                                  			    otvratio7 = 2.20;
                                                  			    newbat7 = bat7 +(bat7 *otvratio7);
                                                  		}
                                                  		double otv7 = (bat7  * otvratio7);	
                                                  		
                                                  		
                                                  		

                                                		double kdvratio7 = 0;
                                                		      if ( (newbat7) < 85000) {
                                                		    	        kdvratio7 = 0.10;
                                                		      } else if ( (newbat7) >=85000 && (newbat7) < 130000) {
                                                		    	        kdvratio7 = 0.12;
                                                		      } else if ( (newbat7) >= 130000) {
                                                	    	        kdvratio7 = 0.18;
                                                		      } else if ( (newbat7) >=0 && (newbat7) < 170000) {
                                                	    	        kdvratio7 = 0.18;
                                                		      } else if ( (newbat7) >=170000) {
                                                	    	        kdvratio7 = 0.20;
                                                              } else if ( (newbat7) > 0) {
                                                	    	        kdvratio7 = 0.24;
                                                              }
                                                                  double kdv7 = newbat7 * kdvratio7;
                                                                  double price7= newbat7 + kdv7;
                                                              
                                                  		
                                                  		
                                                  		 //----------------------------------------- 8.month(8.ay) --------------------------------------//	
                                                      
                                                        double month8 = 0.25;
                                                    	
                                                		double profitamount8 = (productioncost * month8);
                                                	
                                                		double bat8 = profitamount8 + productioncost;
                                                		
                                                		
                                                		
                                                		double newbat8 = 0;
                                                	   double otvratio8 = 0;
                                                			if (bat8 < 85000 && enginetype < 1600) { 
                                                				otvratio8 = 0.45;
                                                			 newbat8 = bat8 + (bat8 *otvratio8); 
                                                	    } else if (bat8 >= 85000 && enginetype < 1600 && bat8 < 130000) {
                                                			      otvratio8 = 0.50;
                                                			      newbat8 = bat8 + (bat8 *otvratio8);
                                                		} else if (bat8 >= 130000  && enginetype < 1600) {
                                                			     otvratio8 = 0.80;
                                                			     newbat8 = bat8 +(bat8 *otvratio8);
                                                		} else if  (bat8 >= 0 && enginetype >=1600 && enginetype < 2000 && bat8 < 170000) {
                                                			   otvratio8 = 1.30;
                                                			   newbat8 = bat8 +(bat8 *otvratio8);
                                                		} else if (bat8 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                                                			    otvratio8 = 1.50;
                                                			    newbat8 = bat8 +(bat8 *otvratio8);
                                                		} else if (bat8 > 0 && enginetype >= 2000) {
                                                			    otvratio8 = 2.20;
                                                			    newbat8 = bat8 +(bat8 *otvratio8);
                                                		}
                                                		double otv8 = (bat8  * otvratio8);	
                                                		                                      		
                                                  		
                                                  		
                                                  		double kdvratio8 = 0;
                                                  		      if ( (newbat8) < 85000) {
                                                  		    	        kdvratio8 = 0.10;
                                                  		      } else if ( (newbat8) >=85000 && (newbat8) < 130000) {
                                                  		    	        kdvratio8 = 0.12;
                                                  		      } else if ( (newbat8) >= 130000) {
                                                  	    	        kdvratio8 = 0.18;
                                                  		      } else if ( (newbat8) >=0 && (newbat8) < 170000) {
                                                  	    	        kdvratio8 = 0.18;
                                                  		      } else if ( (newbat8) >=170000) {
                                                  	    	        kdvratio8 = 0.20;
                                                                } else if ( (newbat8) > 0) {
                                                  	    	        kdvratio8 = 0.24;
                                                                }
                                                                    double kdv8 = newbat8 * kdvratio8;
                                                                    double price8= newbat8 + kdv8;
                                                             
          	              
	
	
                                                                  //----------------------------------------- 9.month(9.ay) --------------------------------------//	
                                                           
                                                                  double month9 = 0.20;
                                                              	
                                                          		double profitamount9 = (productioncost * month9);
                                                          		
                                                          		double bat9 = profitamount9 + productioncost;
                                                          		
                                                          		
                                                          		
                                                          		double newbat9 = 0;
                                                          	   double otvratio9 = 0;
                                                          			if (bat9 < 85000 && enginetype < 1600) { 
                                                          				otvratio9 = 0.45;
                                                          			 newbat9 = bat9 + (bat9 *otvratio9); 
                                                          	    } else if (bat9 >= 85000 && enginetype < 1600 && bat9 < 130000) {
                                                          			      otvratio9 = 0.50;
                                                          			      newbat9 = bat9 + (bat9 *otvratio9);
                                                          		} else if (bat9 >= 130000  && enginetype < 1600) {
                                                          			     otvratio9 = 0.80;
                                                          			     newbat9 = bat9 +(bat9 *otvratio9);
                                                          		} else if  (bat9 >= 0 && enginetype >=1600 && enginetype < 2000 && bat9 < 170000) {
                                                          			   otvratio9 = 1.30;
                                                          			   newbat9 = bat9 +(bat9 *otvratio9);
                                                          		} else if (bat9 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                                                          			    otvratio9 = 1.50;
                                                          			    newbat9 = bat9 +(bat9 *otvratio9);
                                                          		} else if (bat9 > 0 && enginetype >= 2000) {
                                                          			    otvratio9 = 2.20;
                                                          			    newbat9 = bat9 +(bat9 *otvratio9);
                                                          		}
                                                          		double otv9 = (bat9  * otvratio9);	
                                                
                                                            		
                                                            		double kdvratio9 = 0;
                                                            		      if ( (newbat9) < 85000) {
                                                            		    	        kdvratio9 = 0.10;
                                                            		      } else if ( (newbat9) >=85000 && (newbat9) < 130000) {
                                                            		    	        kdvratio9 = 0.12;
                                                            		      } else if ( (newbat9) >= 130000) {
                                                            	    	        kdvratio9 = 0.18;
                                                            		      } else if ( (newbat9) >=0 && (newbat9) < 170000) {
                                                            	    	        kdvratio9 = 0.18;
                                                            		      } else if ( (newbat9) >=170000) {
                                                            	    	        kdvratio9 = 0.20;
                                                                          } else if ( (newbat9) > 0) {
                                                            	    	        kdvratio9 = 0.24;
                                                                          }
                                                                              double kdv9 = newbat9 * kdvratio9;
                                                                              double price9= newbat9 + kdv9;
                                                                           
	
	
	
                       //----------------------------------------- 10.month(10.ay) --------------------------------------//	
                     
                                                            	
                          double month10 = 0.15;
                                                                        	
                         double profitamount10 = (productioncost * month10);
                          
                          double bat10 = profitamount10 + productioncost;
                                                                    		
                                                                    		
                                                                    		
                       double newbat10 = 0;
                        double otvratio10 = 0;
                        if (bat10 < 85000 && enginetype < 1600) { 
                        otvratio10 = 0.45;
                        newbat10 = bat10 + (bat10 *otvratio10); 
                          } else if (bat10 >= 85000 && enginetype < 1600 && bat10 < 130000) {
                           otvratio10 = 0.50;
                            newbat10 = bat10 + (bat10 *otvratio10);
                        } else if (bat10 >= 130000  && enginetype < 1600) {
                       otvratio10 = 0.80;
                        newbat10 = bat10 +(bat10 *otvratio10);
                       } else if  (bat10 >= 0 && enginetype >=1600 && enginetype < 2000 && bat10 < 170000) {
                       otvratio10 = 1.30;
                         newbat10 = bat10 +(bat10 *otvratio10);
                       } else if (bat10 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                        otvratio10 = 1.50;
                          newbat10 = bat10 +(bat10 *otvratio10);
                          } else if (bat10 > 0 && enginetype >= 2000) {
                        otvratio10 = 2.20;
                           newbat10 = bat10 +(bat10 *otvratio10);
                           }
                         double otv10 = (bat10  * otvratio10);	
                                                           		
                                                                      		
                                                                      		
                 double kdvratio10 = 0;
                if ( (newbat10) < 85000) {
                   kdvratio10 = 0.10;
                   } else if ( (newbat10) >=85000 && (newbat10) < 130000) {
                  kdvratio10 = 0.12;
                 } else if ( (newbat10) >= 130000) {
                 kdvratio10 = 0.18;  
                 } else if ( (newbat10) >=0 && (newbat10) < 170000) {
                 kdvratio10 = 0.18;
                   } else if ( (newbat10) >=170000) {
                 kdvratio10 = 0.20;
                   } else if ( (newbat10) > 0) {
                 kdvratio10 = 0.24;
                 }
                double kdv10 = newbat10 * kdvratio10;
                 double price10= newbat10 + kdv10;
              
                  
                  
                  
                //----------------------------------------- 11.month(11.ay) --------------------------------------//	
           
                                                     	
                   double month11 = 0.10;
                                                                 	
                  double profitamount11 = (productioncost * month11);
                  
                   double bat11 = profitamount11 + productioncost;
                                                             		
                                                             		
                                                             		
                double newbat11 = 0;
                 double otvratio11 = 0;
                 if (bat11 < 85000 && enginetype < 1600) { 
                 otvratio11 = 0.45;
                 newbat11 = bat11 + (bat11 *otvratio11); 
                   } else if (bat11 >= 85000 && enginetype < 1600 && bat11 < 130000) {
                    otvratio11 = 0.50;
                     newbat11 = bat11 + (bat11 *otvratio11);
                 } else if (bat11 >= 130000  && enginetype < 1600) {
                otvratio11 = 0.80;
                 newbat11 = bat11 +(bat11 *otvratio11);
                } else if  (bat11 >= 0 && enginetype >=1600 && enginetype < 2000 && bat11 < 170000) {
                otvratio11 = 1.30;
                  newbat11 = bat11 +(bat11 *otvratio11);
                } else if (bat11 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
                 otvratio11 = 1.50;
                   newbat11 = bat11 +(bat11 *otvratio11);
                   } else if (bat11 > 0 && enginetype >= 2000) {
                 otvratio11 = 2.20;
                    newbat11 = bat11 +(bat11 *otvratio11);
                    }
                  double otv11 = (bat11  * otvratio11);	
                    		
                                                               		
          double kdvratio11 = 0;
         if ( (newbat11) < 85000) {
            kdvratio11 = 0.10;
            } else if ( (newbat11) >=85000 && (newbat11) < 130000) {
           kdvratio11 = 0.12;
          } else if ( (newbat11) >= 130000) {
          kdvratio11 = 0.18;  
          } else if ( (newbat11) >=0 && (newbat11) < 170000) {
          kdvratio11 = 0.18;
            } else if ( (newbat11) >=170000) {
          kdvratio11 = 0.20;
            } else if ( (newbat11) > 0) {
          kdvratio11 = 0.24;
          }
         double kdv11 = newbat11 * kdvratio11;
          double price11= newbat11 + kdv11;
          
           
           
         //----------------------------------------- 12.month(12.ay) --------------------------------------//	
    
                                              	
            double month12 = 0.05;
                                                          	
           double profitamount12 = (productioncost * month12);
            
            double bat12 = profitamount12 + productioncost;
                                                      		
                                                      		
                                                      		
         double newbat12 = 0;
          double otvratio12 = 0;
          if (bat12 < 85000 && enginetype < 1600) { 
          otvratio12 = 0.45;
          newbat12 = bat12 + (bat12 *otvratio12); 
            } else if (bat12 >= 85000 && enginetype < 1600 && bat12 < 130000) {
             otvratio12 = 0.50;
              newbat12 = bat12 + (bat12 *otvratio12);
          } else if (bat12 >= 130000  && enginetype < 1600) {
         otvratio12 = 0.80;
          newbat12 = bat12 +(bat12 *otvratio12);
         } else if  (bat12 >= 0 && enginetype >=1600 && enginetype < 2000 && bat12 < 170000) {
         otvratio12 = 1.30;
           newbat12 = bat12 +(bat12 *otvratio12);
         } else if (bat12 >= 170000 && enginetype >= 1600 && enginetype < 2000) {
          otvratio12 = 1.50;
            newbat12 = bat12 +(bat12 *otvratio12);
            } else if (bat12 > 0 && enginetype >= 2000) {
          otvratio12 = 2.20;
             newbat12 = bat12 +(bat12 *otvratio12);
             }
           double otv12 = (bat12  * otvratio12);	
                                                		
                                                        		
                                                        		
   double kdvratio12 = 0;
  if ( (newbat12) < 85000) {
     kdvratio12 = 0.10;
     } else if ( (newbat12) >=85000 && (newbat12) < 130000) {
    kdvratio12 = 0.12;
   } else if ( (newbat12) >= 130000) {
   kdvratio12 = 0.18;  
   } else if ( (newbat12) >=0 && (newbat12) < 170000) {
   kdvratio12 = 0.18;
     } else if ( (newbat12) >=170000) {
   kdvratio12 = 0.20;
     } else if ( (newbat12) > 0) {
   kdvratio12 = 0.24;
   }
  double kdv12 = newbat12 * kdvratio12;
   double price12= newbat12 + kdv12;
  
        System.out.println( "           ");
        System.out.println( "           ");
        System.out.println( "           ");
        System.out.println( "           ***************************************************************************************");
        System.out.println( "           *                                                                                     *");
        System.out.println( "           *                         ANNUALLY AMOUNT TABLE FOR THE CAR                           *");
        System.out.println( "           *                                                                                     *");
        System.out.println( "           ***************************************************************************************");
   
   System.out.println("*==Month==" + "==Produciton cost==="  + "=====Profit Amount====="  + "=====OTV=====" + "=====KDV=====" + "=====Car Price Amount=====*");
   System.out.println("*   1        "+productioncost+"                "+profitamount+"             "+otv+"      "+kdv+"               "+price+"      *");
   System.out.println("*   2        "+productioncost+"                "+profitamount2+"             "+otv2+"      "+kdv2+"               "+price2+"      *");
   System.out.println("*   3        "+productioncost+"                "+profitamount3+"             "+otv3+"      "+kdv3+"               "+price3+"      *");
   System.out.println("*   4        "+productioncost+"                "+profitamount4+"             "+otv4+"      "+kdv4+"               "+price4+"      *");
   System.out.println("*   5        "+productioncost+"                "+profitamount5+"             "+otv5+"      "+kdv5+"               "+price5+"      *");
   System.out.println("*   6        "+productioncost+"                "+profitamount6+"             "+otv6+"      "+kdv6+"               "+price6+"      *");
   System.out.println("*   7        "+productioncost+"                "+profitamount7+"             "+otv7+"      "+kdv7+"               "+price7+"      *");
   System.out.println("*   8        "+productioncost+"                "+profitamount8+"             "+otv8+"      "+kdv8+"               "+price8+"      *");
   System.out.println("*   9        "+productioncost+"                "+profitamount9+"             "+otv9+"      "+kdv9+"               "+price9+"      *");
   System.out.println("*   10       "+productioncost+"                "+profitamount10+"             "+otv10+"      "+kdv10+"               "+price10+"      *");
   System.out.println("*   11       "+productioncost+"                "+profitamount11+"              "+otv11+"      "+kdv11+"               "+price11+"      *");
   System.out.println("*   12       "+productioncost+"                "+profitamount12+"              "+otv12+"      "+kdv12+"               "+price12+"      *");
   System.out.println(   "**********************************************************************************************************");
	
	}
	
}
