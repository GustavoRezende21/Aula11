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

package ModeloAluno;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 19/03/2024
 * @brief Class Cadastro
 */

public class Cadastro extends Aluno {

    String curso, sigla, duracao, nomeDepartamento, siglaDepartamento;
    int anoIngresso, matricula;

    public Cadastro() {
    }

    public Cadastro(String curso, String sigla, String duracao, String nomeDepartamento, String siglaDepartamento, int anoIngresso, int matricula, String nomeAluno) {
        super(nomeAluno);
        this.curso = curso;
        this.sigla = sigla;
        this.duracao = duracao;
        this.nomeDepartamento = nomeDepartamento;
        this.siglaDepartamento = siglaDepartamento;
        this.anoIngresso = anoIngresso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getSiglaDepartamento() {
        return siglaDepartamento;
    }

    public void setSiglaDepartamento(String siglaDepartamento) {
        this.siglaDepartamento = siglaDepartamento;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String toString() {
        return "Compositor \n Nome do Aluno= " + nomeAluno + "\n Matricula= " + matricula +
                "\n Nome do Aluno= " + anoIngresso + "\n Nome do curso= " + curso +
                 "\n Sigla do curso= " + sigla + "\n Duração do curso= " + duracao +
                "\n Nome do Departamento= " + nomeDepartamento + "\n Sigla do Departamento= " + siglaDepartamento + "]";
    }

}
