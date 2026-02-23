# Mini Projet : Dependency Injection

Ce projet illustre le concept de **Dependency Injection** en Java.  
Il est structuré pour séparer la **logique métier**, l’**accès aux données**, et la **présentation**, favorisant le **découplage** et la **testabilité**.

---

## 📁 Structure du projet
```text
src/main/java/net/noureddine
├── dao
│   ├── IDao.java         # Interface pour l'accès aux données
│   └── DaoImpl.java      # Implémentation concrète
├── ext
│   └── DaoImplV2.java    # Variante de l'implémentation DAO
├── metier
│   ├── IMetier.java      # Interface pour la logique métier
│   └── MetierImpl.java   # Implémentation concrète de la logique métier
└── presentation
    ├── Pres1.java        # Classe de présentation 1
    ├── Pres2.java
    ├── Pres3.java
    └── Pres4.java


---

## 🚀 Fonctionnalités

- Séparation claire des responsabilités : **DAO**, **Métier**, **Présentation**
- Injection des dépendances
- Possibilité de changer facilement l’implémentation DAO (`DaoImpl` ou `DaoImplV2`) sans modifier la logique métier
- Exemples de présentation via les classes `Pres1` à `Pres4`
- Suivi de l’évolution du projet avec des commits toutes les 30 minutes

---
