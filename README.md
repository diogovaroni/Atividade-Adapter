# Atividade-Adapter

# 🧩 Sistema Unificado de Gerenciamento de Redes Sociais (Padrão Adapter)

## 🎯 Objetivo
Este projeto demonstra o uso do **Padrão de Projeto Adapter** para integrar múltiplas APIs de redes sociais em um sistema unificado.  
O objetivo é permitir o agendamento e publicação de conteúdos em diferentes plataformas (Twitter, Instagram, LinkedIn e TikTok) através de uma **interface única**.

---

## 🧠 Conceito de Adapter
O **Adapter** é um padrão estrutural que permite que classes com interfaces incompatíveis trabalhem juntas.  
No contexto deste projeto, ele atua como um **tradutor** entre o sistema central (`gerenciadorMidiaSocial`) e as diferentes APIs das redes sociais.

---

## 🏗️ Estrutura do Projeto
📦 redes-sociais-adapter
├── iPublicador.java
├── TwitterAPI.java
├── InstagramAPI.java
├── LinkedInAPI.java
├── TikTokAPI.java
├── TwitterAdapter.java
├── InstagramAdapter.java
├── LinkedInAdapter.java
├── TikTokAdapter.java
├── gerenciadorMidiaSocial.java
└── cliente.java

## Diagrama de Classes
<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/d991a395-3a95-449e-8f35-c9a64429eb06" />
