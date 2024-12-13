import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;


public class Screem1 {
    private JButton btnCirculo;
    private JTextField textRadioCirculo;
    public JPanel mainPanel;
    public JLabel lbCirculoA;
    private JLabel lbCirculoP;
    private JPanel panelCuadrado;
    private JButton btnCuadrado;
    private JLabel lbCuadradoA;
    private JLabel lbCuadradoP;
    private JTextField textladoCuadrado;
    private JButton btnRectangulo;
    private JLabel lbRectanguloA;
    private JLabel lbRectanguloP;
    private JTextField textLongitudRec;
    private JTextField textAlturaRec;
    private JLabel lbCilindroA;
    private JLabel lbCilindroP;
    private JTextField textRadioCilindro;
    private JButton btnCilindro;
    private JButton btnParalelogramo;
    private JLabel lbParaleloA;
    private JLabel lbParaleloP;
    private JTextField textLadoaParalelo;
    private JTextField textLadobParalelo;
    private JTextField textAlturaParalelo;

    public Screem1() {
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double radioCirculo = Double.parseDouble(textRadioCirculo.getText());
                Double areaCirculo = Math.round((2 * radioCirculo * 3.14) * 100.0) / 100.0;
                Double perimetroCirculo = Math.round((3.14 * Math.pow(radioCirculo, 2)) * 100.0) / 100.0;
                lbCirculoA.setText(String.valueOf(areaCirculo));
                lbCirculoP.setText(String.valueOf(perimetroCirculo));
            }
        });
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double ladoCuadrado = Double.parseDouble(textladoCuadrado.getText());
                Double perimetroCuadrado = Math.round((ladoCuadrado * 4) * 100.0) / 100.0;
                Double areaCuadrado = Math.round((Math.pow(ladoCuadrado, 2)) * 100.0) / 100.0;
                lbCuadradoA.setText(String.valueOf(areaCuadrado));
                lbCuadradoP.setText(String.valueOf(perimetroCuadrado));
            }
        });
        btnRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double longitud = Double.parseDouble(textLongitudRec.getText());
                Double altura = Double.parseDouble(textAlturaRec.getText());
                Double perimetroRec = Math.round((2*(longitud + altura)) * 100.0) / 100.0;
                Double areaRec = Math.round((longitud * altura) * 100.0) / 100.0;
                lbRectanguloA.setText(String.valueOf(areaRec));
                lbRectanguloP.setText(String.valueOf(perimetroRec));
            }
        });
        btnCilindro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double radioCilindro = Double.parseDouble(textRadioCilindro.getText());
                Double perimetroCilindro = Math.round((2 * radioCilindro * 3.14) * 100.0) / 100.0;
                Double areaCilindro = Math.round((2*(3.14 * Math.pow(radioCilindro, 2))) * 100.0) / 100.0;
                lbCilindroA.setText(String.valueOf(areaCilindro));
                lbCilindroP.setText(String.valueOf(perimetroCilindro));
            }
        });
        btnParalelogramo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double ladoA = Double.parseDouble(textLadoaParalelo.getText());
                Double ladoB = Double.parseDouble(textLadobParalelo.getText());
                Double alturaParalelo = Double.parseDouble(textAlturaParalelo.getText());
                Double perimetroParalelogramo = Math.round((2 * (ladoA + ladoB)) * 100.0) / 100.0;
                Double areaParalelogramo = Math.round((ladoA * alturaParalelo) * 100.0) / 100.0;
                lbParaleloA.setText(String.valueOf(areaParalelogramo));
                lbParaleloP.setText(String.valueOf(perimetroParalelogramo));
            }
        });
    }


}
