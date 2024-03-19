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
 * @brief Class Main
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Cliente cliente = new Cliente();

        System.out.println("Digite o nome do Cliente: ");
        cliente.nome = ler.next();
        
        System.out.println("Digite o telefone do Cliente: ");
        cliente.telefone = ler.nextInt();
        
        System.out.println("Digite o nome da Rua: ");
        cliente.rua = ler.next();
        
        System.out.println("Digite o numero da Rua: ");
        cliente.numero = ler.nextInt();
        
        System.out.println("Digite o CEP da Rua: ");
        cliente.cep = ler.nextInt();
        
        System.out.println("Digite o bairro da Rua: ");
        cliente.bairro = ler.next();
        
        System.out.println("Digite a cidade da Rua: ");
        cliente.cidade = ler.next();
        
        System.out.println("Digite o estado da Rua: ");
        cliente.estado = ler.next();
        
        System.out.println(cliente);
        
    }
}
