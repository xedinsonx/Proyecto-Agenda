
package miventana;

import javax.swing.JOptionPane;


public class Data {
    
    public Data(){
        
    }
    
    Integer[] age=new Integer[15];
    String[] nombre=new String[15];
    String[] apellidos=new String[15];
    Integer[] cell=new Integer[15];
    Integer posicion=0;
    
    public void capturaDatos(){
        
        if (posicion<15){
                         
        nombre[posicion]=ventana.name.getText();
        apellidos[posicion]=ventana.apellido.getText();
        age[posicion]=Integer.parseInt(ventana.edad.getText());
        cell[posicion]=Integer.parseInt(ventana.celular.getText());
        posicion++;
        String pos=String.valueOf(posicion);
        ventana.contador.setText(pos);
        }else{
            JOptionPane.showMessageDialog(null,"Error, ya no se pueden capturar mas registros","Error al añadir Registros",JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void ImprimirDatos(){
        for (int i=0; i<posicion; i++){
        
      JOptionPane.showMessageDialog(null, " nombre: "+nombre[i]+"\napellido:" +apellidos[i]+"\nedad:"  +age[i]+"\nTelefono:"  +cell[i] ,"Mensaje", JOptionPane.PLAIN_MESSAGE); 
    
}
}
}