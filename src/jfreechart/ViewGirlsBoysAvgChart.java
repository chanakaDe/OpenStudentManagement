/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import dakmainstitute.model.TestMarks;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Shashi
 */
public class ViewGirlsBoysAvgChart {

    public static void viweGirlsAvgChart(List<String> testId,ArrayList<Double> totAvg,ArrayList<Double> girlsAvg,ArrayList<Double> boysAvg) throws SQLException, ClassNotFoundException {
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewEachStudentChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultCategoryDataset objDataset = new DefaultCategoryDataset();
        
        

        for (Double marks : totAvg) {
            //Double mark = tstId;
            //String tetId = tstId.split(",")[3];
            objDataset.addValue(marks, "Line1", marks);
            
        }
        for (Double marks : girlsAvg) {
            //Double mark = tstId;
            //String tetId = tstId.split(",")[3];
            objDataset.addValue(marks, "Line2", marks);
            
        }
//        for (Double testMark : bAvgList) {
//            Double mark = testMark;
//            //String tstId = testId.split(",")[3];
//            objDataset.setValue(mark, "", mark);
//            
//            
//        }
        JFreeChart objChart = ChartFactory.createLineChart(
                "Marks Chart", //Chart title
                "Test", //Domain axis label
                "Marks", //Range axis label
                objDataset, //Chart Data 
                PlotOrientation.VERTICAL, // orientation
                true, // include legend?
                true, // include tooltips?
                false // include URLs?
        );

        ChartFrame frame = new ChartFrame("Dakma Higher Education Center", objChart);
        frame.setLocationRelativeTo(frame);
        frame.pack();
        frame.setVisible(true);
    }
    
   
}
