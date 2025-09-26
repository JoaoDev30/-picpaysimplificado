# PicPay Simplificado – Backend  

> Projeto desenvolvido com base no desafio oficial da PicPay.  
> Repositório original: https://github.com/PicPay/picpay-desafio-backend  
> Projeto open source para toda comunidade.  

---

## 🧠 Sobre  

PicPay Simplificado é uma aplicação backend construída em **Java + Spring Boot**, com banco de dados **H2 em memória**.  
O objetivo é simular operações de usuários comuns e lojistas, com depósito e transferência de valores, seguindo regras de negócio típicas de um serviço financeiro.  



---

## 🚀 Tecnologias  

<div align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="50" alt="Java"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="50" alt="Spring Boot"/>
</div>  

| Ferramenta         | Versão / Observações   |
|---------------------|--------------------------|
| Java                | 21                       |
| Spring Boot         | 3.5.5                       |
| Banco H2 (em memória) | dados resetam ao reiniciar |
| Insomnia / Postman   | para testar endpoints    |

---

## ✅ Funcionalidades  

- Criação de usuário (tipo **COMUM** ou **LOJISTA**).  
- Depósito em conta de usuário.  
- Transferência de valor entre usuários ou de usuário para lojista.  
- Validações:  
- Verificar saldo suficiente.  
- Impedir que lojistas façam transferências.  
- Checar existência de usuários pagador e recebedor.  
- Tratamento de erros para campos faltantes ou dados inválidos.  

---

## 🛠️ Como executar localmente  

1. Clone o repositório:  
   ```bash
   git clone https://github.com/JoaoDev30/-picpaysimplificado.git
   cd -picpaysimplificado
Build do projeto:

bash
Copy code
./mvnw clean install
Executar aplicação:

bash
Copy code
./mvnw spring-boot:run
Acesse pontos de teste via Insomnia ou Postman:

arduino
Copy code
http://localhost:8080
Console do H2 para visualizar dados:

bash
Copy code
http://localhost:8080/h2-console
🔌 Endpoints principais
Método	Rota	Descrição
POST	/users	Cria novo usuário
POST	/deposit	Depositar em conta de usuário
POST	/transfer	Fazer transferência
GET	/users	Listar usuários

Exemplos
Criar usuário
  
{
  "nome": "João Silva",
  "document": "12345678901",
  "email": "joao@exemplo.com",
  "password": "senha123",
  "tipo": "COMUM"
}
bash
Transferência
{
  "payer": 1,
  "payee": 2,
  "value": 50.0
}
Copy code
bash
## ⚠️ Observações
O banco de dados é em memória (H2) — tudo é zerado quando a aplicação é reiniciada.

Não há testes unitários implementados nesta versão.

É necessário usar Insomnia ou Postman para testar/validar os endpoints.

A aplicação já conta com tratamento de erros (saldo insuficiente, usuário inexistente, dados inválidos).

## 🔭 Possíveis melhorias
Adicionar testes unitários e de integração.

Usar banco de dados persistente (PostgreSQL, MySQL, etc.).

Implementar autenticação/autorização (JWT).

Histórico de transações com paginação.

Logs e monitoramento.

## 📄 Licença
Projeto open source, baseado no desafio PicPay, disponível para toda comunidade.
Use, estude, copie e contribua à vontade.



