**FocusTimer** é um aplicativo de foco e produtividade desenvolvido em grupo com **Java**, **Python** e **JavaScript (HTML/CSS)**.  
O sistema permite registrar sessões de foco (como estudo, trabalho, leitura ou academia), armazenar o histórico localmente via backend em Java e gerar relatórios analíticos com Python.

---

## 🚀 Tecnologias Utilizadas

- **Frontend:** HTML, CSS e JavaScript  
- **Backend:** Java  
- **Análise de Dados:** Python  
- **IDE Recomendada:** Visual Studio Code  

---

## 🧩 Estrutura do Projeto

```
FocusTimer/
│
├── frontend/
│   ├── index.html
│   ├── style.css
│   ├── script.js
│   └── assets/
│       └── icons/
│
├── backend-java/
│   ├── src/
│   │   └── FocusServer.java
│   ├── data/
│   │   └── historico.json
│   └── README.md
│
├── analytics-python/
│   ├── relatorio.py
│   ├── requirements.txt
│   └── output/
│       └── relatorio.txt
│
├── .gitignore
└── README.md
```

---

## 🧠 Funcionalidades

- ⏲️ Iniciar, pausar e resetar o temporizador de foco.  
- 📦 Registrar sessões concluídas (tipo de foco, tempo e data).  
- 💾 Salvar os dados localmente via backend em Java.  
- 📊 Gerar relatórios com estatísticas de uso via Python.

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Frontend
Na pasta `frontend`, abra o **index.html** com o **Live Server**:
```
# VS Code → Botão direito em index.html → "Open with Live Server"
```
Acesse no navegador:
```
http://127.0.0.1:5500
```

---

### 2️⃣ Backend (Java)
Na pasta `backend-java`:
```bash
javac src/FocusServer.java
java -cp src FocusServer
```
O servidor escutará na porta **8080**.

---

### 3️⃣ Analytics (Python)
Na pasta `analytics-python`:
```bash
python -m venv venv
venv\Scripts\activate  # ou source venv/bin/activate no Linux/Mac
pip install -r requirements.txt
python relatorio.py
```
O relatório será salvo em `output/relatorio.txt`.

---

## 💡 Extensões Recomendadas (VS Code)

- Live Server  
- Java Extension Pack  
- Python  
- Prettier – Code Formatter  
- GitLens  

---

## 🕒 Duração do Projeto

⏳ **1 a 2 semanas**  
Cada integrante trabalha em uma parte independente e sincroniza via GitHub.

---

**Feito com dedicação pelo grupo FocusTimer 💻**
