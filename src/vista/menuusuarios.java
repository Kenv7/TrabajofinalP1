
package vista;

import controlador.frusuario;
import javax.swing.JOptionPane;
import modelo.usuarios;
import java.sql.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Francisco Rodriguez 2021-0403
 */
public class menuusuarios extends javax.swing.JPanel {
    
    usuarios u=new usuarios();
    frusuario fru=new frusuario();
    DefaultTableModel modelousuarios=new DefaultTableModel();
    


    public menuusuarios() {
        initComponents();
        
        listarusuarios();
        
        
    }
    
    private void listarusuarios(){  // metodo para colocar en la tabla a todos los usuarios
        List<usuarios> lista= fru.Listar(); // aqui se otiene la lista de usuarios desde el metodo listarvque es del objeto fru
        modelousuarios= (DefaultTableModel) tablausuarios.getModel(); // en esta parte se obtienen el modelo de la tabla ususarios
        Object[] ob=new Object[7]; // parte de lo antes menconado
        for(int i=0;i<lista.size();i++){ // iterar sobre la lista de usuarios y agrega cada usuario a la talba
            ob[0]=lista.get(i).getIdUser();
            ob[1]=lista.get(i).getUserName();
            ob[2]=lista.get(i).getNombre();
            ob[3]=lista.get(i).getApellido();
            ob[4]=lista.get(i).getTelefono();
            ob[5]=lista.get(i).getEmail();
            ob[6]=lista.get(i).getPassword();
            modelousuarios.addRow(ob); // agregar la fila al modelo de la talaba
        }
        tablausuarios.setModel(modelousuarios); // establecer el modelo actializado en la tabla
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jdatos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtutelefono = new javax.swing.JTextField();
        txtuusuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtunombre = new javax.swing.JTextField();
        txtuapellido = new javax.swing.JTextField();
        txtuemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtupassword = new javax.swing.JPasswordField();
        txtidUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        joperaciones = new javax.swing.JPanel();
        btnueliminar = new javax.swing.JButton();
        btnuactualizar = new javax.swing.JButton();
        btnuregistrar = new javax.swing.JButton();
        jbasedatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Usuarios");

        jdatos.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        txtutelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtutelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtuusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtuusuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        txtunombre.setBackground(new java.awt.Color(255, 255, 255));
        txtunombre.setForeground(new java.awt.Color(0, 0, 0));

        txtuapellido.setBackground(new java.awt.Color(255, 255, 255));
        txtuapellido.setForeground(new java.awt.Color(0, 0, 0));

        txtuemail.setBackground(new java.awt.Color(255, 255, 255));
        txtuemail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        txtupassword.setBackground(new java.awt.Color(255, 255, 255));
        txtupassword.setForeground(new java.awt.Color(0, 0, 0));

        txtidUser.setBackground(new java.awt.Color(255, 255, 255));
        txtidUser.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("idUser");

        javax.swing.GroupLayout jdatosLayout = new javax.swing.GroupLayout(jdatos);
        jdatos.setLayout(jdatosLayout);
        jdatosLayout.setHorizontalGroup(
            jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jdatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtutelefono))
                    .addGroup(jdatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuapellido))
                    .addGroup(jdatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtunombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtuemail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jdatosLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtuusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtupassword)
                    .addComponent(txtidUser))
                .addContainerGap())
        );
        jdatosLayout.setVerticalGroup(
            jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtunombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtuapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtutelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtuusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtupassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        joperaciones.setBackground(new java.awt.Color(0, 0, 0));

        btnueliminar.setBackground(new java.awt.Color(254, 182, 2));
        btnueliminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnueliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnueliminar.setText("Eliminar");
        btnueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnueliminarActionPerformed(evt);
            }
        });

        btnuactualizar.setBackground(new java.awt.Color(254, 182, 2));
        btnuactualizar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnuactualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnuactualizar.setText("Actualizar");
        btnuactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuactualizarActionPerformed(evt);
            }
        });

        btnuregistrar.setBackground(new java.awt.Color(254, 182, 2));
        btnuregistrar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnuregistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnuregistrar.setText("Registrar");
        btnuregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout joperacionesLayout = new javax.swing.GroupLayout(joperaciones);
        joperaciones.setLayout(joperacionesLayout);
        joperacionesLayout.setHorizontalGroup(
            joperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joperacionesLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(btnuregistrar)
                .addGap(52, 52, 52)
                .addComponent(btnuactualizar)
                .addGap(52, 52, 52)
                .addComponent(btnueliminar)
                .addGap(141, 141, 141))
        );
        joperacionesLayout.setVerticalGroup(
            joperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, joperacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(joperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuregistrar)
                    .addComponent(btnuactualizar)
                    .addComponent(btnueliminar))
                .addContainerGap())
        );

        jbasedatos.setBackground(new java.awt.Color(0, 0, 0));

        tablausuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablausuarios.setForeground(new java.awt.Color(0, 0, 0));
        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idUser", "UserName", "Nombre", "Apellido", "Telefono", "Email", "Password"
            }
        ));
        tablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablausuarios);

        javax.swing.GroupLayout jbasedatosLayout = new javax.swing.GroupLayout(jbasedatos);
        jbasedatos.setLayout(jbasedatosLayout);
        jbasedatosLayout.setHorizontalGroup(
            jbasedatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbasedatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jbasedatosLayout.setVerticalGroup(
            jbasedatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbasedatosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbasedatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(joperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(joperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbasedatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuregistrarActionPerformed

       // Obtener datos de los campos de texto y rear un objeto de la clase usuarios y establecer sus propiedades
    u.setNombre(txtunombre.getText());
    u.setApellido(txtuapellido.getText());
    u.setTelefono(txtutelefono.getText());
    u.setEmail(txtuemail.getText());
    u.setUserName(txtuusuario.getText());
    u.setPassword(txtupassword.getText());
    if(fru.insertar(u)){
    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
    limpiarcampos();
    limpiarTablausuarios();
    listarusuarios();
    
    }else{
            JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario");
    }
 
    }//GEN-LAST:event_btnuregistrarActionPerformed

    private void btnuactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuactualizarActionPerformed
                int fila = tablausuarios.getSelectedRow();
        if(fila==-1 && txtidUser.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Seleccione un usuario"); 
        }else{
            u.setIdUser(Integer.parseInt(txtidUser.getText()));
            u.setUserName(txtuusuario.getText());
            u.setNombre(txtunombre.getText());
            u.setApellido(txtuapellido.getText());
            u.setTelefono(txtutelefono.getText());
            u.setEmail(txtuemail.getText());
            u.setPassword(txtupassword.getText());
            if(fru.editar(u)){
                JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                limpiarcampos();
                limpiarTablausuarios();
                listarusuarios();
            }
        }
  
    }//GEN-LAST:event_btnuactualizarActionPerformed

    private void btnueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnueliminarActionPerformed
     if(!txtidUser.getText().isEmpty()){
         //Dialogo de confirmacion por pantalla el 2 quiere decir que sera del tipo de panel que se va a mostrar
            int confirmacion=JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar este usuario?","Confirmacion",2);
            if(confirmacion==0){ //si la confirmacion es 0 o sea "si" se va a eliminar. cancelar es valor 1
                u.setIdUser(Integer.parseInt(txtidUser.getText()));
                fru.eliminar(u);
                limpiarcampos();
                limpiarTablausuarios();
                listarusuarios();
                
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente"); // Si la confirmacion o valor es 1 no se eliminara el cliente
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una usuario"); // si la caja de texto esta vacia saldra este mensaje
        }
    }//GEN-LAST:event_btnueliminarActionPerformed

    private void tablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablausuariosMouseClicked
        // TODO add your handling code here:
                int fila=tablausuarios.getSelectedRow();
        txtidUser.setText(tablausuarios.getValueAt(fila, 0).toString());
        txtuusuario.setText(tablausuarios.getValueAt(fila, 1).toString());
        txtunombre.setText(tablausuarios.getValueAt(fila, 2).toString());
        txtuapellido.setText(tablausuarios.getValueAt(fila, 3).toString());
        txtutelefono.setText(tablausuarios.getValueAt(fila, 4).toString());
        txtuemail.setText(tablausuarios.getValueAt(fila, 5).toString());
        txtupassword.setText(tablausuarios.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tablausuariosMouseClicked
     
    void limpiarcampos(){ // metodo para simplemente dejar los campos en blanco
        txtidUser.setText("");
        txtuusuario.setText("");
        txtunombre.setText("");
        txtuapellido.setText("");
        txtutelefono.setText("");
        txtuemail.setText("");
        txtuusuario.setText("");
        txtupassword.setText("");
    
    }
    
    void limpiarTablausuarios(){ // metodo para limpiar la tabla
        for(int i=0;1<modelousuarios.getRowCount();i++){
            modelousuarios.removeRow(i);
            i=0-1;
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuactualizar;
    private javax.swing.JButton btnueliminar;
    private javax.swing.JButton btnuregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jbasedatos;
    private javax.swing.JPanel jdatos;
    private javax.swing.JPanel joperaciones;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JTextField txtidUser;
    private javax.swing.JTextField txtuapellido;
    private javax.swing.JTextField txtuemail;
    private javax.swing.JTextField txtunombre;
    private javax.swing.JPasswordField txtupassword;
    private javax.swing.JTextField txtutelefono;
    private javax.swing.JTextField txtuusuario;
    // End of variables declaration//GEN-END:variables
}
