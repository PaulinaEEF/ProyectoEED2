package proyecto;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CampoRenderer extends JLabel implements ListCellRenderer<Campo> {
    
    CampoRenderer() {
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Campo> list, Campo value, int index, boolean isSelected, boolean cellHasFocus) {
        setFont(new Font("Arial", Font.PLAIN, 14));
        String data = "<html><center><b>" + value.getNombre() + "</b>";
        data += String.format(" | %5s", value.getTipo());
        data += String.format(" | Longitud:%3d", value.getLongitud());
        setText(data);
        if (value.isLprimaria()) {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/key_list.png"))); 
        } else {
            setIcon(null);
        }
        setBackground(index % 2 == 0 ? new Color(0, 100, 255, 15) : list.getBackground());
        setHorizontalTextPosition(JLabel.LEFT);
        
        return this;
    }
    
}
