// // IMPORTS (Ajuste os caminhos se necessário)
// import { Cliente } from "./cliente.js";
// import { Funcionario } from "./funcionario.js";
// import { TipoConta } from "./tipoConta.js";

// console.log("\n--- SISTEMA BANCÁRIO IFRN (TYPESCRIPT) ---\n");


// const funcionario = new Funcionario(); 

// const clienteGiovanna = new Cliente("Giovanna Santos", "10/05/1990", 5000, 12345678900, 8499999999);

// const clienteKaua = new Cliente("Kaua Henrique", "20/08/1995", 1500,98765432100, 8488888888);

// console.log("----------");

// const contaGiovanna = funcionario.criarConta(clienteGiovanna, 1000, TipoConta.CORRENTE);
// console.log("Conta Corrente criada para "+contaGiovanna.clienteTitular.nome+" Saldo: R$"+contaGiovanna.consultarSaldo());

// // Kaua quer conta POUPANCA
// const contaKaua = funcionario.criarConta(clienteKaua, 200, TipoConta.POUPANCA);
// console.log("Conta Poupanca criada para " + contaKaua.clienteTitular.nome + ". Saldo: R$ " + contaKaua.consultarSaldo());


// // 4. Testando Operacoes (DEPOSITAR / SACAR / TRANSFERIR)
// console.log("\n--- 2. OPERACOES BANCARIAS ---");

// // Deposito
// contaGiovanna.creditar(500);
// console.log("Giovanna depositou R$ 500. Saldo Atual: R$ " + contaGiovanna.consultarSaldo());

// const saqueSucesso = contaGiovanna.debitar(100);
// if (saqueSucesso) {
//     console.log("Giovanna sacou R$ 100. (Houve taxa?). Saldo Atual: R$ " + contaGiovanna.consultarSaldo());
// } else {
//     console.log("Saque da Giovanna falhou.");
// }

// console.log("\nTransferindo R$ 200 de Giovanna para Kaua");
// const transfSucesso = contaGiovanna.trasferir(contaKaua, 200);

// if (transfSucesso) {
//     console.log("Transferencia realizada!");
// } else {
//     console.log("Transferencia falhou (Saldo insuficiente).");
// }

// console.log("Saldo Final Giovanna: R$ " + contaGiovanna.consultarSaldo());
// console.log("Saldo Final Kaua: R$ " + contaKaua.consultarSaldo());


// console.log("\n--- 3. EMPRESTIMOS ---");

// console.log("Giovanna solicita emprestimo de R$ 1.500 (Renda: 5000)...");
// const resultGiovanna = funcionario.realizarEmprestimo(contaGiovanna, 1500);

// if (resultGiovanna) {
//     console.log("APROVADO! Novo saldo Giovanna: R$ " + contaGiovanna.consultarSaldo());
// } else {
//     console.log("NEGADO.");
// }

// console.log("\nKaua solicita emprestimo de R$ 10.000 (Renda: 1500)...");
// const resultKaua = funcionario.realizarEmprestimo(contaKaua, 10000);

// if (resultKaua) {
//     console.log("APROVADO! Novo saldo Kaua: R$ " + contaKaua.consultarSaldo());
// } else {
//     console.log("NEGADO. Limite excedido (30% da renda eh R$ " + (clienteKaua.renda_bruta * 0.3) + ")");
// }

// console.log("\nFIM DA EXECUCAO");

import { Cliente } from "./cliente.js";
import { Funcionario } from "./funcionario.js";
import { TipoConta } from "./tipoConta.js";
import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const lerDados = (pergunta: string): Promise<string> => {
    return new Promise(resolve => rl.question(pergunta, resolve));
};

async function main() {
    console.log("--- SISTEMA BANCARIO IFRN (TYPESCRIPT) ---");

    const funcionario = new Funcionario();

    console.log("\n--- CADASTRO CLIENTE 1 ---");
    const nome1 = await lerDados("Nome do Cliente 1: ");
    const rendaInput1 = await lerDados("Renda Bruta do Cliente 1: ");
    const renda1 = parseFloat(rendaInput1);
    
    const cliente1 = new Cliente(nome1, "01/01/1990", renda1, 11111111111, 999999999);

    console.log("\n--- CADASTRO CLIENTE 2 ---");
    const nome2 = await lerDados("Nome do Cliente 2: ");
    const rendaInput2 = await lerDados("Renda Bruta do Cliente 2: ");
    const renda2 = parseFloat(rendaInput2);

    const cliente2 = new Cliente(nome2, "01/01/1995", renda2, 22222222222, 888888888);

    console.log("\nClientes aguardando atendimento: " + cliente1.nome + " e " + cliente2.nome + ".");

    console.log("\n----------");
    
    const saldoIni1Input = await lerDados("Saldo Inicial Conta Corrente (" + nome1 + "): ");
    const saldoIni1 = parseFloat(saldoIni1Input);
    const conta1 = funcionario.criarConta(cliente1, saldoIni1, TipoConta.CORRENTE);
    console.log("Conta Corrente criada para " + conta1.clienteTitular.nome + " Saldo: R$" + conta1.consultarSaldo());

    const saldoIni2Input = await lerDados("Saldo Inicial Conta Poupanca (" + nome2 + "): ");
    const saldoIni2 = parseFloat(saldoIni2Input);
    const conta2 = funcionario.criarConta(cliente2, saldoIni2, TipoConta.POUPANCA);
    console.log("Conta Poupanca criada para " + conta2.clienteTitular.nome + ". Saldo: R$ " + conta2.consultarSaldo());

    console.log("\n--- 2. OPERACOES BANCARIAS ---");

    const depositoInput = await lerDados("Valor deposito para " + nome1 + ": ");
    const deposito = parseFloat(depositoInput);
    conta1.creditar(deposito);
    console.log(cliente1.nome + " depositou R$ " + deposito + ". Saldo Atual: R$ " + conta1.consultarSaldo());

    const saqueInput = await lerDados("Valor saque para " + nome1 + ": ");
    const saque = parseFloat(saqueInput);
    const saqueSucesso = conta1.debitar(saque);
    if (saqueSucesso) {
        console.log(cliente1.nome + " sacou R$ " + saque + ". (Houve taxa?). Saldo Atual: R$ " + conta1.consultarSaldo());
    } else {
        console.log("Saque falhou.");
    }

    const transfInput = await lerDados("Valor transferencia de " + nome1 + " para " + nome2 + ": ");
    const valTransf = parseFloat(transfInput);
    
    console.log("\nTransferindo R$ " + valTransf + " de " + nome1 + " para " + nome2);
    const transfSucesso = conta1.trasferir(conta2, valTransf);

    if (transfSucesso) {
        console.log("Transferencia realizada!");
    } else {
        console.log("Transferencia falhou (Saldo insuficiente).");
    }

    console.log("Saldo Final " + nome1 + ": R$ " + conta1.consultarSaldo());
    console.log("Saldo Final " + nome2 + ": R$ " + conta2.consultarSaldo());

    console.log("\n--- 3. EMPRESTIMOS ---");

    const emp1Input = await lerDados("Valor emprestimo para " + nome1 + ": ");
    const emp1 = parseFloat(emp1Input);
    console.log(nome1 + " solicita emprestimo de R$ " + emp1 + " (Renda: " + renda1 + ")...");
    const result1 = funcionario.realizarEmprestimo(conta1, emp1);
    if (result1) {
        console.log("APROVADO! Novo saldo " + nome1 + ": R$ " + conta1.consultarSaldo());
    } else {
        console.log("NEGADO.");
    }

    const emp2Input = await lerDados("\nValor emprestimo para " + nome2 + ": ");
    const emp2 = parseFloat(emp2Input);
    console.log(nome2 + " solicita emprestimo de R$ " + emp2 + " (Renda: " + renda2 + ")...");
    const result2 = funcionario.realizarEmprestimo(conta2, emp2);
    if (result2) {
        console.log("APROVADO! Novo saldo " + nome2 + ": R$ " + conta2.consultarSaldo());
    } else {
        console.log("NEGADO. Limite excedido (30% da renda eh R$ " + (cliente2.renda_bruta * 0.3) + ")");
    }

    console.log("\nFIM DA EXECUCAO");
    rl.close();
}

main();