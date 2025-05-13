# 💰 Budget Manager

**Budget Manager** est une application web développée par la startup **ENAA TECH** permettant aux utilisateurs de gérer efficacement leurs finances personnelles. Elle permet de suivre les transactions, définir des budgets personnalisés, et organiser ses dépenses et revenus par catégories.

---

## 🚀 Fonctionnalités

### 🔄 Gestion des Transactions
- Ajouter une transaction (revenu ou dépense) avec **montant**, **catégorie**, **date**, et **description**
- Consulter toutes les transactions avec **filtrage** et **tri** (date, montant, catégorie)
- Modifier une transaction existante
- Supprimer une transaction
### 💸 Gestion de Budget
- Créer un **budget par catégorie** avec une limite de dépense (ex: alimentation, logement)
- Afficher les budgets avec **limite** et **dépenses réalisées**
- Modifier les limites de budget
- Supprimer un budget

### 🗂️ Gestion des Catégories
- Créer des **catégories personnalisées** de dépenses ou revenus
- Modifier ou supprimer des catégories

---

## 🧰 Technologies Utilisées

### Backend
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Lombok](https://projectlombok.org/)
- [MapStruct](https://mapstruct.org/)
- [JUnit](https://junit.org/junit5/)

### Frontend
- [Angular 16+](https://angular.io/)
- [RxJS](https://rxjs.dev/)
- [Angular Reactive Forms](https://angular.io/guide/reactive-forms)
- [Bootstrap](https://getbootstrap.com/) / [Tailwind CSS](https://tailwindcss.com/)
- [HttpClient](https://angular.io/guide/http)
- [Angular Router](https://angular.io/guide/router)

---

## 📁 Architecture du Projet

```bash
budget-manager/
│
├── backend/
│   ├── src/main/java/com/enaatech/budgetmanager
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── dto/
│   │   ├── entity/
│   │   └── mapper/
│   └── ...
│
├── frontend/
│   ├── src/app/
│   │   ├── components/
│   │   ├── services/
│   │   ├── models/
│   │   └── pages/
│   └── ...
│
└── README.md

![Capture d’écran 2025-05-13 170822.png](../../../Downloads/Capture%20d%E2%80%99%C3%A9cran%202025-05-13%20170822.png)

![Capture d’écran 2025-05-13 170924.png](../../../Downloads/Capture%20d%E2%80%99%C3%A9cran%202025-05-13%20170924.png)