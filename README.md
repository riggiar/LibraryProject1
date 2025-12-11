# Library Management System

Мини-проект на Java: управление библиотекой.

## Описание
Программа позволяет управлять библиотекой:
- добавлять книги,
- регистрировать читателей,
- выдавать книги,
- просматривать список книг и читателей.

## Demo
Пример работы программы показан в `Main.java`:
```java
Library library = new Library();

library.addBook(new Book("Harry Potter", "J.K. Rowling"));
library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

library.addReader(new Reader("Arina"));
library.addReader(new Reader("Alex"));

library.printBooks();
library.printReaders();

library.borrowBook("Harry Potter", "Arina");

library.printBooks();
