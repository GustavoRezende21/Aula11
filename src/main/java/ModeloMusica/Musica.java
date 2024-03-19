/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ModeloMusica;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 19/03/2024
 * @brief Class Musica
 */

public class Musica extends Compositores {

    String nomeMusica, tipo;
    int ano;

    public Musica() {

    }

    public Musica(String nomeCompositor, String nacionalidade, String nomeMusica, String tipo, int ano) {
        super(nomeCompositor, nacionalidade);
        this.nomeMusica = nomeMusica;
        this.tipo = tipo;
        this.ano = ano;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Musica [Nome do Compositor= " + super.getNomeCompositor()
                + ", Nacionalidade= " + super.getNacionalidade() + "Nome da Musica= " + nomeMusica
                + ", Tipo= " + tipo + ", Ano= " + ano + "]"; // Retorna uma string representando o objeto Musica
    }
}