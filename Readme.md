# API - email-service

Api para envio de email's utilizando o Amazon SES (AWS Ses).

## Tecnologias e Metodologias

* Clean Arquiteture
* Spring Boot 3.1.4
* Java 21 LTS
* Amazon SES

### Para a Versão do Java 21, fiz a opção pela Graalvm 21+
https://www.graalvm.org/release-notes/JDK_21/

### Variáveis de Ambiente a serem definidas:
#### Ambiente AWS

`` accessKeyId: ${AK} ``

``secretKey: ${SK}``

``region: ${REGION}``

#### Email de origem:

``email.source: ${EMAIL-SOURCE}`` 

### Endpoint

//localhost:8080/<strong>api/email</strong>

POST
```JSON
{
"to": "emailDestino@provider.com", 
"subject": "subject",
"body": "lorem ipsum"
}
```
Response 200 OK = "email sent sucessfully"

Response 500 Bad Request = "Error while sending email"

### Observações:
A opção pela distribuição da Graalvm é apenas pessoal, visando o menor tempo de <strong>Start</strong> da Aplicação. 