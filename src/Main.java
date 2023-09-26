import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Double horadeentrada, horadesalida, valorapagar,resta, multi, pagoporvehiculo;
        String placa, nombre;

        JOptionPane.showMessageDialog(null,"Bienvenidos al parqueadero cristian \n"+
                "Valor hora o fraccion \n"+
                "Carro: $2000 Moto: $1000"+ "\n");

       nombre = JOptionPane.showInputDialog("ingrese su nombre");
       placa = JOptionPane.showInputDialog("ingresa placa");
       horadeentrada = Double.parseDouble(JOptionPane.showInputDialog("ingrese la hora de entrada"));

       JOptionPane.showMessageDialog(null,"su nombre es:" + nombre + "\n" +
               "suplaca es:" + placa + "\n" +
               "su hora de entrada es:" + horadeentrada +"\n");
       horadesalida=Double.parseDouble(JOptionPane.showInputDialog("ingresa la hora de salida"));
       resta=horadesalida-horadeentrada;
       pagoporvehiculo=Double.parseDouble(JOptionPane.showInputDialog("ingresa 2000 si es carro o 1000 si es moto"));
       multi=Math.ceil(resta)*pagoporvehiculo;
       JOptionPane.showMessageDialog(null,"tine que pagar"+multi);

    }


}

