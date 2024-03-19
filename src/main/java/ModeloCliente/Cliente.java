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

package ModeloCliente;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 19/03/2024
 * @brief Class Cliente
 */

public class Cliente extends Endereco {

    String nome;
    int telefone;

    public Cliente() {
    }

    public Cliente(String nome, int telefone, String rua, String bairro, String cidade, String estado, int numero, int cep) {
        super(rua, bairro, cidade, estado, numero, cep);
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Cliente [Nome do Cliente= " + nome + ", Telefone= " + telefone
                + "Nome da Rua= " + super.getRua() + ", Numero= " + super.getNumero()
                + ", CEP= " + super.getCep() + ", Bairro= " + super.getBairro() + ", Cidade= "
                + super.getCidade() + ", Estado= " + super.getEstado() + "]";
        
    }
}
