package br.com.designpatternModelPerderPeso;

import br.com.designpatternInterface.Button;
import br.com.designpatternInterface.TextBox;
import br.com.designpatternInterface.WidgetFactory;


public class PerderPesoFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new PerderPesoButton();
    }

    @Override
    public TextBox createTextBox() {
        return new PerderPesoTextBox();
    }
    
    
    
}
