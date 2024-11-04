# Design Patterns em Java

Este repositório contém exemplos dos principais padrões de projeto (**Design Patterns**) em Java. O objetivo é consolidar o aprendizado e servir como uma referência prática para os conceitos estudados.

## Índice

1. [Entendendo os Princípios SOLID](#1-entendendo-os-princípios-solid)
2. [Padrões de Projeto - Criacional](#2-padrões-de-projeto---criacional)
   - [Factory Method](#21-factory-method)
   - [Abstract Factory](#22-abstract-factory)
   - [Builder](#23-builder)
3. [Padrões de Projeto - Estrutural](#3-padrões-de-projeto---estrutural)
   - [Adapter](#31-adapter)
   - [Bridge](#32-bridge)
4. [Padrões de Projeto - Comportamental](#4-padrões-de-projeto---comportamental)
   - [Chain of Responsibility](#41-chain-of-responsibility)

---

## 1. Entendendo os Princípios SOLID

Os princípios SOLID ajudam a criar sistemas mais organizados, escaláveis e fáceis de manter. Abaixo estão os cinco princípios:

- **S** - **Princípio da Responsabilidade Única (Single Responsibility Principle)**  
  Cada classe deve ter apenas uma razão para mudar.

- **O** - **Princípio Aberto/Fechado (Open/Closed Principle)**  
  Classes devem estar abertas para extensão, mas fechadas para modificação.

- **L** - **Princípio de Substituição de Liskov (Liskov Substitution Principle)**  
  Objetos de uma classe derivada devem poder substituir objetos da classe base sem afetar a corretude do programa.

- **I** - **Princípio da Segregação de Interface (Interface Segregation Principle)**  
  Clientes não devem ser forçados a depender de interfaces que não utilizam.

- **D** - **Princípio da Inversão de Dependência (Dependency Inversion Principle)**  
  Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.



## 2. Padrões de Projeto - Criacional

Os padrões criacionais tratam da criação de objetos de forma controlada e eficiente. Estes são os principais padrões:

### 2.1 Factory Method

O Factory Method define uma interface para criar objetos, mas permite que as subclasses decidam qual classe instanciar.

### 2.2 Abstract Factory

O Abstract Factory permite a criação de famílias de objetos relacionados sem especificar suas classes concretas.
### 2.3 Builder

O Builder é utilizado para construir objetos complexos passo a passo. Ele desacopla o código de construção do código da representação.

## 3. Padrões de Projeto - Estrutural

Os padrões estruturais dizem respeito à composição de classes e objetos para formar estruturas maiores.

### 3.1 Adapter

O Adapter permite que duas interfaces incompatíveis trabalhem juntas.

### 3.2 Bridge

O Bridge separa a abstração da implementação, permitindo que ambos evoluam independentemente.

## 4. Padrões de Projeto - Comportamental

Os padrões comportamentais focam nas interações entre os objetos, promovendo a comunicação e a flexibilidade.

### 4.1 Chain of Responsibility

O Chain of Responsibility permite que um pedido seja processado por uma cadeia de objetos, até que um deles possa tratá-lo. 


