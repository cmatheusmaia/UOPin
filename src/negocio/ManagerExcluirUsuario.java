package negocio;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sistema.bean.UsuarioBean;

public class ManagerExcluirUsuario {

    public static void preencherBusca(UsuarioBean usuarioBean, JTextField textField_Nome,
	    JTextField textField_Nome_completo, JTextField textField_Dt_nascimento, JPasswordField passSenha,
	    JComboBox comboBox_Perfil, JComboBox comboBox_Sexo, JButton btnAlterar, JButton btnLimpar) {

	textField_Nome.setText(usuarioBean.getNome());
	textField_Nome_completo.setText(usuarioBean.getNomeCompleto());
	textField_Dt_nascimento.setText(usuarioBean.getDt_nascimento());
	passSenha.setText(usuarioBean.getSenha());
	comboBox_Perfil.setSelectedIndex(usuarioBean.getPerfil_Usuario_idPerfil_Usuario());
	comboBox_Sexo.setSelectedIndex(usuarioBean.getSexo_idSexo());
	btnAlterar.setEnabled(true);
	btnLimpar.setEnabled(true);

    }

    public static void limparDados(UsuarioBean usuarioBean, JTextField textField_Nome,
	    JTextField textField_Nome_completo, JTextField textField_Dt_nascimento, JPasswordField passSenha,
	    JComboBox comboBox_Perfil, JComboBox comboBox_Sexo, JButton btnAlterar, JButton btnLimpar) {

	textField_Nome.setText("");
	textField_Nome_completo.setText("");
	textField_Dt_nascimento.setText("");
	passSenha.setText("");
	comboBox_Perfil.setSelectedIndex(0);
	comboBox_Sexo.setSelectedIndex(0);
	btnAlterar.setEnabled(false);
	btnLimpar.setEnabled(false);

    }

    public static void limparDados(UsuarioBean usuarioBean, JTextField textField_Nome,
	    JTextField textField_Nome_completo, JTextField textField_Dt_nascimento, JPasswordField passSenha,
	    JComboBox comboBox_Perfil, JComboBox comboBox_Sexo) {
	textField_Nome.setText("");
	textField_Nome_completo.setText("");
	textField_Dt_nascimento.setText("");
	passSenha.setText("");
	comboBox_Perfil.setSelectedIndex(0);
	comboBox_Sexo.setSelectedIndex(0);
    }

}
