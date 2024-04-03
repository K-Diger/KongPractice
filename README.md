# 목표

## 1. 구축

- **Docker** + **Kong Gateway DB Less Mode**로 띄우기
- 마이크로서비스라고 가정한 Spring Boot App도 DockerCompose로 함께 띄우기

## 2. 라우팅

- `http://localhost:8000/api/v1/users` 로 요청 시 `http://localhost:8080/users` 로 라우팅

