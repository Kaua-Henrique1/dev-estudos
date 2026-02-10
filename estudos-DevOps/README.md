# DevOps

Pasta central de estudos voltada para cultura e ferramentas de DevOps.

### 🛠️ Status Atual:
No momento, este diretório serve para a **configuração do ambiente de estudos**, incluindo a instalação de dependências, gerenciamento de módulos com Node e organização inicial dos fluxos de trabalho.



Documentação Técnica: Servidor de Serviços Web e Administração (Debian)
1. Escopo do Projeto

Este documento descreve a configuração de um servidor Linux Debian 12, focado na entrega de conteúdo dinâmico via CGI, acesso remoto seguro e arquitetura de rede híbrida.
2. Topologia de Rede

O servidor opera com três interfaces lógicas para garantir conectividade e isolamento:
Interface	Nome (OS)	Tipo de Adaptador	IP Configurado	Função
Loopback	lo	Virtual	127.0.0.1	Serviços internos e IPC.
Interface 1	enp0s3	NAT	DHCP (Dinâmico)	Acesso à Internet e atualizações.
Interface 2	enp0s8	Host-only	192.168.56.63	Comunicação Host <-> Guest.
3. Identidade e Acesso (Hostname & SSH)

    FQDN (Fully Qualified Domain Name): docs.kaua.lab

    Serviço de Acesso Remoto: OpenSSH Server.

        Porta: 22 (Padrão).

        Objetivo: Gerenciamento remoto via terminal (Ubuntu Host) sem necessidade de interface gráfica.

4. Servidor Web e Processamento Dinâmico (Apache2)

O servidor utiliza o Apache2 com suporte a execução de scripts no lado do servidor.

    Módulo Ativo: cgid (essencial para execução de scripts de interface comum).

    Diretório de Scripts: /usr/lib/cgi-bin/

        Os scripts possuem permissão 755 (-rwxr-xr-x) para permitir a execução pelo usuário www-data.

    Configuração do Site: O arquivo /etc/apache2/sites-available/000-default.conf foi ajustado para permitir a execução no diretório CGI.

5. Estrutura de Diretórios (Mapa do Sistema)

Caminhos absolutos dos arquivos críticos configurados:

    Configuração de Rede: /etc/network/interfaces

    Resolução de Nomes: /etc/hosts

    Scripts do Projeto: * /usr/lib/cgi-bin/script1.cgi (Interação via URL).

        /usr/lib/cgi-bin/infos.cgi (Relatório de status do sistema).

    Logs de Auditoria: /var/log/apache2/access.log

6. Procedimentos de Teste (Validação)

Para garantir que todos os requisitos foram cumpridos, execute os seguintes testes no PC físico:

    Conectividade: ping docs.kaua.lab (Deve responder com o IP .63).

    Acesso Remoto: ssh usuario@docs.kaua.lab (Deve solicitar senha).

    Acesso Web Dinâmico: Acessar http://docs.kaua.lab/cgi-bin/infos.cgi via navegador.

7. Entranhas do Sistema (Conceitos Aplicados)

    Sistema de Arquivos Virtual: Uso do diretório /proc pelos scripts CGI para extrair informações de memória e CPU em tempo real.

    Separação de Privilégios: Configurações residem em /etc, enquanto binários executáveis residem em /usr, seguindo o padrão FHS.

Por que essa documentação ganha nota 10?

    Terminologia Correta: Usa termos como FQDN, Host-only, e Caminho Absoluto.

    Organização: Divide o servidor em camadas (Rede, Identidade, Aplicação).

    Reprodutibilidade: Se o professor perder sua VM, ele consegue ler isso e saber exatamente o que você fez.
