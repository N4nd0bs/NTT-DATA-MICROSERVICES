# 🧩 Sistema de Microserviços — Spring Boot + Java + Gradle

Este projeto é uma arquitetura distribuída baseada em microserviços, construída com **Spring Boot**, **Java 17**, **Gradle Kotlin DSL**, e **Eureka Service Discovery**. Ele simula um sistema de pedidos com catálogo de produtos, roteamento via API Gateway e validação entre serviços.

---

## 📦 Módulos

```plaintext
NTT-DATA-MICROSERVICES/
├── server/         # Registro de serviços (Service Discovery)
├── produtos/       # CRUD de produtos com banco H2
├── pedidos/        # Simulação de pedidos com validação de produtos
├── gateway/        # Entrada única com roteamento via Eureka
```
---

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.3.x
- Spring Cloud Gateway 4.3.x
- Spring Cloud Netflix Eureka
- Spring Data JPA + H2 Database
- Gradle Kotlin DSL

---

## ⚙️ Como executar

1. Clone o projeto

2. Execute os serviços
   ./gradlew :eureka-server:bootRun
   ./gradlew :catalogo-produtos:bootRun
   ./gradlew :simulador-pedidos:bootRun
   ./gradlew :api-gateway:bootRun
3. Acesse
    -Eureka: http://localhost:8761
    -Gateway: http://localhost:8080
    -H2 Console: http://localhost:8100/h2-console

---

## 🔗 Endpoints via Gateway


Serviço	            | Endpoint
Catálogo            | GET /produtos
Simulador de Pedido	| POST /pedidos

---

## ✅ Regras de Negócio

- O serviço de pedidos valida os produtos via catálogo.
- Comunicação entre serviços via Feign + Eureka.

---

## 🛠️ Melhorias futuras

- Autenticação JWT
- Implantação de um HUD (interface visual) utilizando HTML para:
    - Exibir os produtos disponíveis
    - Realizar pedidos diretamente pela interface

---

## 👨‍💻 Autor

Projeto criado por Fernando com apoio da documentação do Spring Boot e do Copilot 