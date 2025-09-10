<p align="center">
  <img src="https://raw.githubusercontent.com/gilbarbara/logos/main/logos/spring-icon.svg" alt="Spring Boot Logo" width="200"/>
</p>

# Spring Product Service 🚀

## 📌 About the Project
This is a **very simple Spring Boot project** created only for **testing and practice purposes**.  
- No real database is connected ❌  
- Instead, a **fake in-memory database** is used (just an `ArrayList` inside the service).  
- Project built and tested in both **VS Code** and **IntelliJ IDEA**.  

---

## ⚡ Features
- Exposes a REST endpoint:  
  - **`/products`** → Returns a list of products (hardcoded inside the service).  
- Uses `@Service`, `@RestController`, and `@Autowired` for basic Spring Boot practice.  
- Shows how to structure a minimal **Spring Boot application**.  

---

## 🛠️ Tech Stack
- **Java 17+** (Java 11 bhi chalega)  
- **Spring Boot** (3.x latest)  
- **Maven** for build management  
- **IDE:**  

<p align="left">
  <img src="https://raw.githubusercontent.com/gilbarbara/logos/main/logos/visual-studio-code.svg" alt="VS Code" width="100" style="margin-right:40px"/>
  <img src="https://raw.githubusercontent.com/gilbarbara/logos/main/logos/intellij-idea.svg" alt="IntelliJ IDEA" width="100"/>
</p>

---

## ▶️ How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/ibadBargir/spring-product-service.git
   cd spring-product-service


## 📖 Example Output
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 80000
  },
  {
    "id": 2,
    "name": "Smartphone",
    "price": 50000
  }
]
