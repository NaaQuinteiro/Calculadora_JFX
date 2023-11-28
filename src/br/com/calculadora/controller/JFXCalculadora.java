package br.com.calculadora.controller;

import br.com.calculadora.model.Calculos;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXCalculadora {


    public TextField tfNumero1;
    public TextField tfNumero2;
    public Button bCalcular;

    public Button bSair;
    public TextField tfResultado;

    // criando o objeto para executar a classe dos calculos
    Calculos calculos = new Calculos();
    public void calcular(ActionEvent actionEvent) {
        //comando que pega o que foi escrito na entrada
        //converter o valor de string para double
        double n1 = Double.parseDouble(tfNumero1.getText());
        double n2 = Double.parseDouble(tfNumero2.getText());

        //Comando para mudar ow estpa na caixa de texto e converter o que queremos adicionar lá em string
        tfResultado.setText(String.valueOf(calculos.somar(n1,n2)));

//        JOptionPane.showMessageDialog(null, "Resultado: " + r);
    }

    public void sair(ActionEvent actionEvent) {
        //Comando que finaliza a aplicação no JFX
        System.exit(0);
    }
}
