# Moscow Stock Portfolio API

Spring Boot приложение для управления портфелями ценных бумаг Московской биржи.

## Функциональность

- CRUD операции с инструментами (акции, облигации, фьючерсы)
- Управление портфелями и позициями
- Финансовые калькуляторы (депозит, кредит, Black-Scholes, анализ акций)
- Асинхронная обработка через RabbitMQ
- Поддержка PostgreSQL и H2

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

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs
- **OpenAPI YAML**: http://localhost:8080/v3/api-docs.yaml

## Базы данных

- **H2** (по умолчанию): http://localhost:8080/h2-console
- **PostgreSQL** (prod профиль): localhost:5432

## RabbitMQ

Management UI: http://localhost:15672 (guest/guest)

## Профили

- `default`: H2 для разработки
- `prod`: PostgreSQL для продакшна

## Логирование

### Разработка (Dev)
- **Уровень**: DEBUG для приложения, INFO для остальных
- **Файлы**: `logs/application.log` (ротация по 10MB, 30 дней)
- **Вывод**: Console + File
- **Детали**: Полная информация о запросах, SQL, RabbitMQ

### Продакшн (Docker)
- **Уровень**: WARN для остального, INFO для приложения
- **Файлы**: `/var/log/application.log` (ротация по 50MB, 7 дней)
- **Вывод**: Только File
- **Docker**: JSON-file driver с ограничением 100MB
- **Логирование**: Сервисы помечены labels (stock-app, rabbitmq, postgres)

### Просмотр логов в Docker
```bash
# Логи приложения
docker-compose logs app

# Логи RabbitMQ
docker-compose logs rabbitmq

# Логи PostgreSQL
docker-compose logs postgres

# Реальное время с 100 строк
docker-compose logs -f --tail=100 app

# Из volume
docker inspect $(docker-compose ps -q app) | grep LogPath
```
