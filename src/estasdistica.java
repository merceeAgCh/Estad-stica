import javax.swing.*;


public class estadistica extends JFrame {
    JPanel panel;
    public estadistica(){
        setTitle("Como Hacer Graficos con Java");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }

    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();

        defaultpiedataset.setValue("Programacion", new Double(41.200000000000003D));
        defaultpiedataset.setValue("Electronica", new Double(11D));
        defaultpiedataset.setValue("Hacking", new Double(19.5D));
        defaultpiedataset.setValue("SEO", new Double(30.5D));
        defaultpiedataset.setValue("Redes", new Double(2.0D));

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Tematicas Blog", defaultpiedataset, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
        pieplot3d.setDepthFactor(0.5);
        pieplot3d.setStartAngle(290D);
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F);

        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }

    public static void main(String args[]){
        new Ventana().setVisible(true);
    }
}

}
