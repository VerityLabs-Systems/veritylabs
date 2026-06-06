# VerityLabs Roadmap

This roadmap is organized by module. It is intentionally outcome-based so GitHub issues can be linked to product increments instead of scattered technical tasks.

## Phase 1: LIMS Foundation

Goal: make the existing inventory workflow persistent and traceable.

- Define the inventory database schema with Flyway.
- Implement inventory entities, repositories, services, and DTOs.
- Persist inventory entries and exits.
- Calculate stock balance by item, batch, and expiration date.
- Add validation and user-facing error messages.
- Add controller and service tests for inventory flows.
- Introduce authentication and role-based access.

## Phase 2: LIMS Operational Expansion

Goal: expand from inventory to core laboratory operations.

- Define patient, sample, exam, order, and result models.
- Link samples and orders to exam requests.
- Track sample status transitions.
- Build result entry and review screens.
- Add audit fields to operational entities.
- Create a consistent navigation structure across LIMS areas.

## Phase 3: CQ Hub

Goal: add analytical quality control workflows on top of reliable operational data.

- Model QC materials, lots, levels, and analytical methods.
- Register QC runs and control results.
- Implement Levey-Jennings chart data preparation.
- Add rule evaluation for QC alerts.
- Track nonconformance records and corrective actions.
- Connect QC indicators to Analytics dashboards.

## Phase 4: Analytics

Goal: provide decision-support views for laboratory operations and quality.

- Build operational dashboards from LIMS data.
- Add inventory consumption and expiration-risk indicators.
- Add turnaround time and workload metrics.
- Add QC trend dashboards.
- Prepare read models for analytics queries.
- Explore anomaly detection on inventory consumption and QC trends.

## Phase 5: Integration

Goal: expose and consume data through stable integration boundaries.

- Define internal API contracts for LIMS records.
- Add import/export jobs for operational data.
- Prepare instrument connector abstractions.
- Add integration audit logs.
- Add webhook or event publication for key workflow changes.
- Document external API authentication and versioning.

## Cross-Cutting Work

- Improve automated test coverage as each module gains behavior.
- Add CI checks for build and tests.
- Document architecture decisions in `docs/adr`.
- Add seed data for local development.
- Review Java version requirements before onboarding contributors.
