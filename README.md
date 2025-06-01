# 🎯 Belajar Design Pattern - Strategy Pattern dan Lainnya

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Design Patterns](https://img.shields.io/badge/Design_Patterns-FF6F00?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/github/license/textualdreadlia/belajar-strategyPattern?style=for-the-badge)

Repositori ini berisi contoh implementasi berbagai design pattern dalam Java, khususnya **Strategy Pattern**, sebagai bahan pembelajaran untuk mata kuliah Design Pattern.

## 📚 Daftar Pattern yang Dicakup
1. **Strategy Pattern** - chapter01-strategy
2. **Observer Pattern** - chapter02-Observerr
3. **Builder Pattern** - chapter03-builder
4. **Konsep Dasar OOP** - chapter00_intro

## 🏗 Struktur Proyek
```plaintext
belajar-strategyPattern/
├── chapter00_intro/          - Pengenalan konsep dasar OOP
│   ├── src/
│   │   ├── Employee.java
│   │   ├── Kendaraan.java
│   │   ├── Main.java
│   │   ├── ShapeAbstract.java
│   │   ├── ShapeInterface.java
│   │   ├── hewan.java
│   │   └── user.java
│   └── chapter00_intro.iml
│
├── chapter01-strategy/       - Implementasi Strategy Pattern
│   ├── chapter_01/
│   │   ├── src/
│   │   └── analisa.md
│   └── untitled/
│
├── chapter02-Observerr/      - Implementasi Observer Pattern
│   ├── src/Observer/
│   │   ├── Channel.class
│   │   ├── Observable.class
│   │   ├── Observer.class
│   │   └── User.class
│   └── analisa.md
│
├── chapter03-builder/        - Implementasi Builder Pattern
│   ├── .gitignore
│   └── analisa.md
│
├── analisa.md                - Analisa implementasi pattern
└── hasil duck.png            - Diagram contoh implementasi
```

## 🚀 Cara Menggunakan
1. Clone repositori ini:
   ```bash
   git clone https://github.com/teukualdieaulia/belajar-strategyPattern.git
   ```
2. Buka proyek dengan IntelliJ IDEA atau IDE Java lainnya
3. Jalankan file Main.java di setiap chapter untuk melihat contoh implementasi

## 💡 Contoh Implementasi Strategy Pattern
```java
// Contoh interface strategy
public interface PaymentStrategy {
    void pay(int amount);
}

// Implementasi concrete strategy
public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// Context class
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
```

## 📊 Analisa Pattern
Setiap chapter dilengkapi dengan:
- Kode implementasi pattern
- File analisa.md berisi penjelasan konsep
- Diagram contoh implementasi (hasil duck.png)

## 🤝 Berkontribusi
Kontribusi sangat diterima! Untuk berkontribusi:
1. Fork repositori ini
2. Buat branch baru (`git checkout -b fitur-baru`)
3. Commit perubahan Anda (`git commit -am 'Menambahkan contoh baru'`)
4. Push ke branch (`git push origin fitur-baru`)
5. Buat Pull Request

---

<div align="center">
  <sub>Dibuat dengan ❤ oleh <a href="https://github.com/teukualdieaulia">aldi imub</a></sub>
</div>
