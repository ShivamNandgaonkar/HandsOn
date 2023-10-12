//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
package Jdbc;
public class EvenOddPrinter {

	public static void main(String[] args) {
		
		        // Create two threads
		        Thread evenThread = new Thread(new EvenNumberPrinter());
		        Thread oddThread = new Thread(new OddNumberPrinter());

		        // Start the threads
		        evenThread.start();
		        oddThread.start();
		    }
		}

		class EvenNumberPrinter implements Runnable {
		    @Override
		    public void run() {
		        for (int i = 2; i <= 20; i += 2) {
		            System.out.println("Even Number: " + i);
		        }
		    }
		}

		class OddNumberPrinter implements Runnable {
		    @Override
		    public void run() {
		        for (int i = 1; i <= 19; i += 2) {
		            System.out.println("Odd Number: " + i);
		        }
		    }
		


	}


