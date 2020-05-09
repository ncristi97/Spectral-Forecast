import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

public class Plotting extends ApplicationFrame{

    public Plotting(final String title, double[] S ) {

        super(title);
        final XYSeries series = new XYSeries("");
        for(int i = 0; i < S.length; i++){
            series.add(i, S[i]);
        }
        final XYSeriesCollection data = new XYSeriesCollection(series);
        final JFreeChart chart = ChartFactory.createXYLineChart(
                "Similarity Forecast Simulator",
                "Step",
                "Similarity",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        chartPanel.setZoomAroundAnchor(true);
        setContentPane(chartPanel);

    }
}
