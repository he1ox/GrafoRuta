package UIDesign;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GrafosPkg.*;
import GrafosPkg.Departamentos.Departamento;

public class GoogleMapsSuperLite extends JFrame{
    private JPanel panelPrincipal;
    private JLabel tituloApp;
    private JComboBox puntoDePartida;
    private JComboBox puntoDeLlegada;
    private JButton btnCalcularDistancia;
    private static final Grafo g = new Grafo(Departamento.DEPARTAMENTOS);


    public GoogleMapsSuperLite() {
        btnCalcularDistancia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                char inicio = Departamento.getChar(puntoDePartida.getSelectedItem().toString());
                char fin = Departamento.getChar(puntoDeLlegada.getSelectedItem().toString());

                String respuesta = g.encontrarRutaMinimaDijkstra(inicio,fin);
                JOptionPane.showMessageDialog(btnCalcularDistancia, respuesta);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Google Maps Super Lite");
        frame.setContentPane(new GoogleMapsSuperLite().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);

        //Petén
        g.agregarRuta(Departamento.PETEN,Departamento.ALTA_VERAPAZ,147);
        g.agregarRuta(Departamento.PETEN,Departamento.IZABAL,327);

        //Alta Verapaz
        g.agregarRuta(Departamento.ALTA_VERAPAZ, Departamento.BAJA_VERAPAZ, 58);

        //Izabal
        g.agregarRuta(Departamento.IZABAL, Departamento.ZACAPA, 117);

        //Zacapa
        g.agregarRuta(Departamento.ZACAPA, Departamento.EL_PROGRESO, 71);
        g.agregarRuta(Departamento.ZACAPA, Departamento.CHIQUIMULA, 26);

        //Baja Verapaz
        g.agregarRuta(Departamento.BAJA_VERAPAZ, Departamento.EL_PROGRESO, 69);

        //El Progreso
        g.agregarRuta(Departamento.EL_PROGRESO, Departamento.GUATEMALA, 93);
        g.agregarRuta(Departamento.EL_PROGRESO, Departamento.JALAPA, 86);

        //Guatemala
        g.agregarRuta(Departamento.GUATEMALA, Departamento.CHIMALTENANGO, 56);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.SACATEPEQUEZ, 43);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.ESCUINTLA, 48);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.SANTA_ROSA, 82);

        //Jalapa
        g.agregarRuta(Departamento.JALAPA, Departamento.JUTIAPA, 39);

        //Chiquimula
        g.agregarRuta(Departamento.CHIQUIMULA, Departamento.JUTIAPA, 72);

        //Jutiapa
        g.agregarRuta(Departamento.JUTIAPA, Departamento.SANTA_ROSA, 71);

        //Santa Rosa
        g.agregarRuta(Departamento.SANTA_ROSA, Departamento.ESCUINTLA, 86);

        //Escuintla
        g.agregarRuta(Departamento.ESCUINTLA, Departamento.SACATEPEQUEZ, 22);
        g.agregarRuta(Departamento.ESCUINTLA, Departamento.SUCHITEPEQUEZ, 95);

        //Sacatepequez
        g.agregarRuta(Departamento.SACATEPEQUEZ, Departamento.CHIMALTENANGO, 26);

        //Chimaltenango
        g.agregarRuta(Departamento.CHIMALTENANGO, Departamento.SOLOLA, 70);

        //Solola
        g.agregarRuta(Departamento.SOLOLA, Departamento.QUICHE, 158);
        g.agregarRuta(Departamento.SOLOLA, Departamento.TOTONICAPAN, 58);
        g.agregarRuta(Departamento.SOLOLA, Departamento.QUETZALTENANGO, 76);

        //Suchitepequez
        g.agregarRuta(Departamento.SUCHITEPEQUEZ, Departamento.RETALHUEU, 55);

        //Retalhueu
        g.agregarRuta(Departamento.RETALHUEU, Departamento.QUETZALTENANGO, 56);

        //Quetzaltenango
        g.agregarRuta(Departamento.QUETZALTENANGO, Departamento.SAN_MARCOS, 51);

        //San Marcos
        g.agregarRuta(Departamento.SAN_MARCOS, Departamento.HUEHUETENANGO, 105);

    }
}
