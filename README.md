# Moscow Stock Portfolio API

Spring Boot приложение для управления портфелями ценных бумаг Московской биржи.

## Функциональность

- CRUD операции с инструментами (акции, облигации, фьючерсы)
- Управление портфелями и позициями
- Финансовые калькуляторы (депозит, кредит, Black-Scholes, анализ акций)
- Асинхронная обработка через RabbitMQ
- Поддержка PostgreSQL

## Запуск

### Разработка (H2)
```bash
./mvnw spring-boot:run
```

### Продакшн (PostgreSQL + RabbitMQ)
```bash
docker-compose up --build
```

## Тестирование

### Unit тесты
```bash
./mvnw test
```

### Интеграционные тесты
```bash
./mvnw verify
```

## API Документация

Swagger UI: http://localhost:8080/swagger-ui.html

## Базы данных

- **H2** (по умолчанию): http://localhost:8080/h2-console
- **PostgreSQL** (prod профиль): localhost:5432

## RabbitMQ

Management UI: http://localhost:15672 (guest/guest)

## Профили

- `default`: H2 для разработки
- `prod`: PostgreSQL для продакшна
