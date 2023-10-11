
package br.com.designpatternModelGanharMassa;

import br.com.designpatternInterface.TextBox;


public class GanharMassaTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("GANHAR MASSA SELECIONADO");
    }
    
}
