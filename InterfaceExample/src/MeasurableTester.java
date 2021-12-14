/**
   This program demonstrates the measurable Country class.
*/

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class MeasurableTester
{
	
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 400;
	
   public static void main(String[] args)
   {
     
	   Scanner in = new Scanner(System.in);
	   
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println();
      double minData = Data.min(countries);
      System.out.println("Minimum area: " + minData);
      System.out.println("Expected: ");
      System.out.println();
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(176220);
      accounts[1] = new BankAccount(513120);
      accounts[2] = new BankAccount(30510);
      avg=Data.average(accounts);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(accounts);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
      minData = Data.min(accounts);
      System.out.println("Minimum balance: " + minData);
      System.out.println("Expected: ");
      System.out.println();

      //Quiz
      System.out.println("Quiz data");
      Measurable[] quiz = new Measurable[5];
      quiz[0] = new Quiz(95);
      quiz[1] = new Quiz(80);
      quiz[2] = new Quiz(90);
      quiz[3] = new Quiz(50);
      quiz[4] = new Quiz(75);
      avg = Data.average(quiz);
      System.out.println("Average Score: " + avg);
      System.out.println("Expected: 78.0");
      System.out.println("");
      maxData = Data.max(quiz);
      System.out.println("Highest Score: " + maxData);
      System.out.println("Expected: 95.0");
      System.out.println();
      minData = Data.min(accounts);
      System.out.println("Minimum balance: " + minData);
      System.out.println("Expected: ");
      System.out.println();

      
      System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average");
      int whichMetric = in.nextInt();
      String metricToUse = "average";
      if(whichMetric == 1)
      {
    	  metricToUse = "Maximum";
      }
      if(whichMetric == 2)
      {
    	  metricToUse = "Minimum";
      }
      if(whichMetric == 3)
      {
    	  metricToUse = "Average";
      }
      
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      frame.add(panel);


      JButton button = new JButton("Get " + metricToUse + " Balance");
      panel.add(button);
      ActionListener listener = new ButtonListener(accounts, metricToUse);
      button.addActionListener(listener);
      
      JButton button2 = new JButton("Get " + metricToUse + " Area");
      panel.add(button2);
      ActionListener listener2 = new ButtonListener(countries, metricToUse);
      button2.addActionListener(listener2);
      
      JButton button3 = new JButton("Get " + metricToUse + " Score");
      panel.add(button3);
      ActionListener listener3 = new ButtonListener(quiz, metricToUse);
      button3.addActionListener(listener3);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
