/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jfreechart;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import dakmainstitute.model.TestMarks;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class ViewEachStudentChart {

    public static void viweChart(ArrayList<TestMarks> list) throws SQLException, ClassNotFoundException {

        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ViewEachStudentChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultCategoryDataset objDataset = new DefaultCategoryDataset();


        for (TestMarks testMark : list) {
            int mark = Integer.parseInt(testMark.getMarks());

            String tstId = testMark.getTestId().split(",")[3];
            objDataset.setValue(mark, "", tstId);
        }
        JFreeChart objChart = ChartFactory.createLineChart3D(
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
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
