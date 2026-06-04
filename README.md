# VerityLabs

VerityLabs é uma plataforma em desenvolvimento para apoiar fluxos operacionais e analíticos de laboratório. A proposta é construir uma base técnica para gestão laboratorial com rastreabilidade, organização de processos e, em fases futuras, suporte a controle de qualidade e análise de dados.

O projeto ainda está em fase inicial. A primeira entrega está concentrada em um WMS laboratorial, usado como base para validar arquitetura, navegação e fluxos operacionais antes da evolução para módulos analíticos mais complexos.

## Objetivo

O foco inicial é estruturar um sistema web para o contexto de laboratórios, cobrindo principalmente:

- organização de estoque laboratorial;
- registro de entradas, saídas e consulta de itens;
- base para rastreabilidade de reagentes, lotes, validade e consumo;
- fundação para futuros módulos de amostras, exames, resultados, pacientes e usuários.

Essa abordagem permite que os módulos analíticos sejam construídos sobre dados operacionais confiáveis, em vez de ficarem isolados da rotina real do laboratório.

## Estado Atual

Status: desenvolvimento inicial.

Implementado até o momento:

- aplicação Spring Boot com renderização server-side via Thymeleaf;
- dashboard inicial;
- telas iniciais do módulo de inventário;
- estrutura de pacotes para domínios futuros;
- configuração de PostgreSQL;
- configuração de Flyway para migrações de banco;
- assets de interface baseados em Bootstrap, Font Awesome, Chart.js e DataTables.

Ainda em desenvolvimento:

- modelo de dados do inventário;
- regras de negócio;
- persistência dos fluxos de entrada e saída;
- autenticação e autorização;
- módulos de pacientes, amostras, exames, resultados e usuários.

## Stack

- Java 17
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- Thymeleaf
- Bean Validation
- Flyway
- PostgreSQL 16
- Maven Wrapper
- Docker Compose

## Requisitos

Para executar o projeto localmente, instale:

- JDK 17 ou superior;
- Docker e Docker Compose;
- Git.

Não é necessário instalar Maven globalmente, pois o projeto inclui o Maven Wrapper.

## Como Executar

Suba o banco PostgreSQL:

```bash
docker compose up -d
```

Execute a aplicação:

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

Rotas disponíveis nesta fase:

- `/` e `/dashboard`
- `/inventory/index`
- `/inventory/entry`
- `/inventory/list`
- `/inventory/exit`

## Configuração

A aplicação usa variáveis de ambiente com valores padrão para desenvolvimento local:

| Variável | Padrão |
| --- | --- |
| `DB_URL` | `jdbc:postgresql://localhost:5432/verity_lims` |
| `DB_USERNAME` | `verity_lims` |
| `DB_PASSWORD` | `verity_lims` |

O banco definido em `compose.yaml` usa as mesmas credenciais padrão.

## Testes

Execute os testes com:

```bash
./mvnw test
```

Atualmente há um teste básico de carga de contexto da aplicação.

## Estrutura do Projeto

```text
src/main/java/br/net/veritylabs
+-- controllers/        # controllers MVC atualmente implementados
+-- inventory/          # estrutura planejada para o módulo de inventário
+-- patients/           # estrutura planejada para pacientes
+-- samples/            # estrutura planejada para amostras
+-- exams/              # estrutura planejada para exames
+-- results/            # estrutura planejada para resultados
+-- orders/             # estrutura planejada para ordens/solicitações
+-- users/              # estrutura planejada para usuários
`-- shared/             # configurações e componentes compartilhados
```

```text
src/main/resources
+-- db/migration/       # migrações Flyway
+-- static/             # CSS, JS, imagens e bibliotecas frontend
`-- templates/          # templates Thymeleaf
```

## Roadmap

Próximas frentes previstas:

- consolidar o domínio de inventário laboratorial;
- criar entidades, repositórios, serviços e DTOs do WMS;
- implementar migrações Flyway para o schema inicial;
- adicionar validações e mensagens de erro;
- evoluir as telas para operações reais;
- introduzir autenticação;
- preparar a base para controle de qualidade analítico.

Fases futuras podem incluir controle de qualidade com gráficos de Levey-Jennings, ingestão de dados analíticos, visualização exploratória e suporte à detecção de anomalias.

## Observações

VerityLabs é uma iniciativa técnica e de pesquisa em evolução. O README deve acompanhar apenas funcionalidades implementadas ou planejadas com clareza, evitando tratar como pronto aquilo que ainda está em desenho.
