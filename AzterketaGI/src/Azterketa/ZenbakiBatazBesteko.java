package Azterketa;

import java.util.ArrayList;
import java.util.Scanner;

public class ZenbakiBatazBesteko {


		    public static void main(String[] args) {
		        ArrayList<Double> zenbakiak = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            try {
		                System.out.print("Sartu zenbakiak gero guztien bataz bestekoa kalkulatzeko (0 sartu bukatzeko): ");
		                double zenbaki = scanner.nextDouble();
		                
		                if (zenbaki == 0) {
		                    break;
		                }
		                
		                zenbakiak.add(zenbaki);
		            } catch (Exception e) {
		                System.out.println("Errorea! Zenbaki bat sartu behar duzu.");
		                scanner.nextLine(); 
		            }
		        }

		        if (zenbakiak.size() > 0) {
		            double batazbeste = 0;
		            for (double zenbaki : zenbakiak) {
		                batazbeste += zenbaki;
		            }
		            batazbeste /= zenbakiak.size();
		            
		            System.out.println("Zenbaki guztien bataz bestekoa: " + batazbeste + " da.");
		        } else {
		            System.out.println("Ez zenbaki sartu.");
		        }

		        scanner.close();
		    }
		}


