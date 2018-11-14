/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author Tiago Oliveira
 */
public class Cliente {
    
    private String _nome;
    private String _idade;
    private String _cpf;
    private String _tel;
    private String _sex;
    private String _end;
    private String _usuario;
    private String _senha;

    public Cliente() {
    }
    
    public Cliente(String _nome, String _idade, String _cpf, String _tel, String _sex, String _end, String _usuario, String _senha) {
        this._nome = _nome;
        this._idade = _idade;
        this._cpf = _cpf;
        this._tel = _tel;
        this._sex = _sex;
        this._end = _end;
        this._usuario = _usuario;
        this._senha = _senha;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public String getIdade() {
        return _idade;
    }

    public void setIdade(String _idade) {
        this._idade = _idade;
    }

    public String getCpf() {
        return _cpf;
    }

    public void setCpf(String _cpf) {
        this._cpf = _cpf;
    }

    public String getTel() {
        return _tel;
    }

    public void setTel(String _tel) {
        this._tel = _tel;
    }

    public String getSex() {
        return _sex;
    }

    public void setSex(String _sex) {
        this._sex = _sex;
    }

    public String getEnd() {
        return _end;
    }

    public void setEnd(String _end) {
        this._end = _end;
    }

    public String getUsuario() {
        return _usuario;
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public String getSenha() {
        return _senha;
    }

    public void setSenha(String _senha) {
        this._senha = _senha;
    }
    
}
