# Transportadora Jamapara - Aplicativo de Controle de Viagens e Finanças

Este projeto é um aplicativo Android desenvolvido para facilitar o gerenciamento de viagens e controle financeiro para a Transportadora Jamapara. A aplicação permite que os usuários acompanhem as viagens realizadas, gerenciem despesas e acessem relatórios financeiros em uma interface simples e intuitiva.

## Funcionalidades

    Login: Acesso seguro com tela de autenticação.
    Gerenciamento de Viagens: Registro e visualização de viagens realizadas.
    Mapas e Rotas: Visualização de rotas de entrega no Google Maps.
    Controle de Finanças: Gerenciamento de despesas e receitas com relatórios financeiros detalhados.
    Relatórios: Acesso a relatórios de viagens e finanças para facilitar a análise.

## Estrutura do Projeto

A estrutura do projeto segue as boas práticas de organização de pacotes para Android, com separação clara entre a camada de dados, lógica de negócios, e interface do usuário.

## Configuração e Instalação
Pré-requisitos

    Android Studio 4.0 ou superior
    Android SDK 21 (Lollipop) ou superior
    Conexão com a internet para acessar o Google Maps API

## Passos para Rodar o Projeto

    Clone este repositório para o seu ambiente local:

git clone https://github.com/kennylima/ControleDeEntregas

Abra o projeto no Android Studio.

Obtenha uma chave de API do Google Maps:

    Acesse o Google Cloud Console.

    Crie um novo projeto e ative a API do Google Maps.

    Gere uma chave de API e adicione-a no arquivo AndroidManifest.xml dentro da tag <meta-data>:

        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="SUA_CHAVE_DE_API" />

    Sincronize o projeto e execute-o em um emulador ou dispositivo físico.

Como Usar

    Login: Acesse o aplicativo usando as credenciais fornecidas.
    Gerenciamento de Viagens: Na tela principal, selecione "Viagens" para visualizar e adicionar novas viagens.
    Mapa e Rotas: Navegue para a tela de mapa para visualizar as rotas das entregas.
    Financeiro: Acesse a tela de finanças para adicionar despesas e receitas, com um resumo de relatórios financeiros.
    Relatórios: Acesse relatórios mensais para análise de viagens e finanças.

Dependências

    Google Maps API: Para visualização de rotas.
    Room: Biblioteca de persistência de dados.
    Material Components: Para UI e consistência visual.

Licença

Este projeto está licenciado sob a MIT License.

## Contato

Para mais informações, entre em contato com a equipe de desenvolvimento no email: kennylima@hotmail.com.