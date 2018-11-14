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
    private int _ano;
    private float _valor;

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

    public int getAno() {
        return _ano;
    }

    public void setAno(int _ano) {
        this._ano = _ano;
    }

    public float getValor() {
        return _valor;
    }

    public void setValor(float _valor) {
        this._valor = _valor;
    }
}
