
package br.com.designpatternModelPerderPeso;

import br.com.designpatternInterface.TextBox;

public class PerderPesoTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("PERDA DE PESO SELECIONADA");
    }
    
}
