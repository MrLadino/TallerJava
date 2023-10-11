import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    JPanel miPanel;
    JLabel miTitulo, miBase, miAltura, miResultado;
    JButton btnCalcular, btnLimpiar;
    JTextField txtBase, txtAltura;

    public Ventana() {
        iniciarComponentes();
        setTitle("Área de Triángulo Rectángulo");
        setSize(700, 500);
        setLocationRelativeTo(null);
    }

    private void iniciarComponentes() {
        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.GRAY);

        miTitulo = new JLabel();
        miTitulo.setText("Cálculo del Área de Triángulo Rectángulo");
        miTitulo.setBounds(230, 30, 340, 30);

        miBase = new JLabel("Base:");
        miBase.setBounds(50, 120, 60, 30);
        txtBase = new JTextField();
        txtBase.setBounds(110, 120, 150, 30);

        miAltura = new JLabel("Altura:");
        miAltura.setBounds(350, 120, 60, 30);
        txtAltura = new JTextField();
        txtAltura.setBounds(410, 120, 150, 30);

        miResultado = new JLabel("Área del Triángulo:");
        miResultado.setBounds(50, 220, 500, 30);

        btnCalcular = new JButton();
        btnCalcular.setText("Calcular");
        btnCalcular.setBounds(140, 280, 150, 30);
        btnCalcular.addActionListener(this);

        btnLimpiar = new JButton();
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBounds(400, 280, 150, 30);
        btnLimpiar.addActionListener(this);

        miPanel.add(miTitulo);
        miPanel.add(miBase);
        miPanel.add(txtBase);
        miPanel.add(miAltura);
        miPanel.add(txtAltura);
        miPanel.add(miResultado);
        miPanel.add(btnCalcular);
        miPanel.add(btnLimpiar);

        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLimpiar) {
            txtBase.setText("");
            txtAltura.setText("");
            miResultado.setText("Área del Triángulo:");
        } else if (e.getSource() == btnCalcular) {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double area = (base * altura) / 2;
            miResultado.setText("Área del Triángulo: " + area);
        }
    }
}
