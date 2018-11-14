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
public class Livro {
    
    private String _titulo;
    private String _autor;
    private String _genero;
    private String _ano;
    private String _valor;

    public Livro() {
    }

    public Livro(String _titulo, String _autor, String _genero, String _ano, String _valor) {
        this._titulo = _titulo;
        this._autor = _autor;
        this._genero = _genero;
        this._ano = _ano;
        this._valor = _valor;
    }

    
    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String _titulo) {
        this._titulo = _titulo;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }

    public String getGenero() {
        return _genero;
    }

    public void setGenero(String _genero) {
        this._genero = _genero;
    }

    public String getAno() {
        return _ano;
    }

    public void setAno(String _ano) {
        this._ano = _ano;
    }

    public String getValor() {
        return _valor;
    }

    public void setValor(String _valor) {
        this._valor = _valor;
    }
}
