/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raisa
 */
public class testscore {
  
  //varaibles
    private int[] grades;
    private int average;
    
//consructor
    public testscore(int [] testScores) throws
    IllegalArgumentException
    {
        average = validScore(testScores);
        grades = testScores;
        
    }
    private int validScore(int[] testScores)
    {
        int avg = 0;
        
        for(int i = 0; i < testScores.length; i++)
        {
            if (testScores[i] < 0 || testScores[i] > 100)
                throw new IllegalArgumentException
                        ("Score for test" + (i+1) + "is out of range. \nNumber can't " + "be less than 0 or greater than 100");
            avg += testScores[i];
        }
        return (avg/testScores.length);
    }
    public int getAvg()
    {
        return average;
                        
        }
    }