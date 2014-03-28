/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import beans.Frequencia;
import beans.Funcionario;
import dao.FrequenciaDao;
import dao.FuncionarioDao;
import gui.ListarFrequencia;
import gui.NovoUsuario;
import gui.ProcurarUsuario;
import gui.ProcurarUsuarioFrequencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import service.relatorios.RelatorioFrequenciaFuncionario;
import service.relatorios.UtilFrequencia;

/**
 *
 * @author Gilmar
 */
public class SelecionarUsuarioFrequenciaHandler implements ActionListener {

    ProcurarUsuarioFrequencia procurarUsuario;

    public SelecionarUsuarioFrequenciaHandler(ProcurarUsuarioFrequencia procurarUsuario) {

        this.procurarUsuario = procurarUsuario;
    }

    public void actionPerformed(ActionEvent e) {

        TableModel model = procurarUsuario.getTable().getModel();
        String idString = (String) model.getValueAt(procurarUsuario.getTable().getSelectedRow(), 4);

        Integer id = new Integer(idString);
                
        String[] split = new String[2];
        Integer mes;
        Integer ano;
        split = procurarUsuario.getData().split("/");
        mes = new Integer(split[0]);
        ano = new Integer(split[1]);
        
        Integer idUsuario = new Integer(id);
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        FrequenciaDao frequenciaDao = new FrequenciaDao();
        Funcionario funcionario = null;
        List<Frequencia> frequencias = new ArrayList<Frequencia>();
        UtilFrequencia utilFrequencia = new UtilFrequencia();
        try {
            funcionario = funcionarioDao.getfuncionario(idUsuario);
            frequencias = frequenciaDao.getFrequenciaFuncionario(mes, ano, idUsuario);
            frequencias = utilFrequencia.getFrequenciaMes(mes, ano, idUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(SelecionarUsuarioFrequenciaHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        procurarUsuario.dispose();
       
        ListarFrequencia.main(null, frequencias);


        
    }
}