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

package ModeloEmpregado;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 19/03/2024
 * @brief Class Main
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Trabalho trabalho = new Trabalho();

        System.out.println("Digite o CNPJ do Empregado: ");
        trabalho.cnpj = ler.nextInt();
        
        System.out.println("Digite a Razzão Social do Trabalho: ");
        trabalho.razaoSocial = ler.next();
        
        System.out.println("Digite o nome da Rua: ");
        trabalho.rua = ler.next();
        
        System.out.println("Digite o numero da Rua: ");
        trabalho.numero = ler.nextInt();
        
        System.out.println("Digite o CEP da Rua: ");
        trabalho.cep = ler.nextInt();
        
        System.out.println("Digite o bairro da Rua: ");
        trabalho.bairro = ler.next();
        
        System.out.println("Digite a cidade da Rua: ");
        trabalho.cidade = ler.next();
        
        System.out.println("Digite o estado da Rua: ");
        trabalho.estado = ler.next();
        
        System.out.println(trabalho);
        
    }
}