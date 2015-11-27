package negocio;

import java.awt.TextField;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sistema.bean.UsuarioBean;

public class ManagerEditarUsuario {

    public static void preencherBusca(UsuarioBean usuarioBean, JTextField textField_Nome, JTextField textField_Nome_completo, JTextField textField_Dt_nascimento, JPasswordField passSenha, JComboBox comboBox_Perfil, JComboBox comboBox_Sexo, JButton btnAlterar, JButton btnLimpar ){
	
	textField_Nome.setText(usuarioBean.getNome());
	textField_Nome.setEditable(true);
	textField_Nome_completo.setText(usuarioBean.getNomeCompleto());
	textField_Nome_completo.setEditable(true);
	textField_Dt_nascimento.setText(usuarioBean.getDt_nascimento());
	textField_Dt_nascimento.setEditable(true);
	passSenha.setText(usuarioBean.getSenha());
	passSenha.setEditable(true);
	comboBox_Perfil.setSelectedIndex(usuarioBean.getPerfil_Usuario_idPerfil_Usuario());
	comboBox_Perfil.setEnabled(true);
	comboBox_Sexo.setSelectedIndex(usuarioBean.getSexo_idSexo());
	comboBox_Sexo.setEnabled(true);
	btnAlterar.setEnabled(true);
	btnLimpar.setEnabled(true);
	
    }
}
