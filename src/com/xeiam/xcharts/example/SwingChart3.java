/**
 * Copyright 2011 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.xcharts.example;

import com.xeiam.swing.SwingHelper;
import com.xeiam.xcharts.Chart;
import com.xeiam.xcharts.series.Series;

/**
 * Demonstrated/Tests plotting horizontal and vertical lines
 * 
 * @author timmolter
 */
public class SwingChart3 {

    private static void createAndShowGUI() {

        // generates linear data
        double[] xData1 = new double[] { 0.0, 1.0, 2.0 };
        double[] yData1 = new double[] { 0.0, 0.0, 0.0 };
        double[] xData2 = new double[] { 0.0, 0.0, 0.0 };
        double[] yData2 = new double[] { 0.0, 1.0, 2.0 };

        // Create Chart
        Chart chart = new Chart(800, 600);

        // Customize Chart
        chart.setChartTitle("Sample Chart");
        chart.setXAxisTitle("X");
        chart.setYAxisTitle("Y");
        // chart.setChartTitleVisible(false);
        // chart.setChartLegendVisible(false);
        // chart.setAxisTitlesVisible(false);

        // Series
        Series series1 = chart.addSeries("y=0", xData1, yData1);
        Series series2 = chart.addSeries("x=0", xData2, yData2);

        SwingHelper swingHelper = new SwingHelper(chart);
        swingHelper.displayChart();
    }

    public static void main(String[] args) {

        createAndShowGUI();

    }
}