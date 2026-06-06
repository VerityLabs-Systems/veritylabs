# VerityLabs Modules

This document defines the module boundaries used by the repository. The boundaries are package-level first and can become Maven modules later if the codebase needs independent build, test, or release cycles.

## Boundary Rules

- Business code belongs to exactly one product module: LIMS, CQ Hub, Analytics, or Integration.
- Cross-cutting infrastructure belongs in `br.net.veritylabs.shared`.
- Modules should communicate through services, DTOs, events, or explicit integration contracts.
- Persistence models should stay inside the owning module unless there is a deliberate shared model.
- Web controllers should live inside the module that owns the user workflow.

## LIMS

Package root: `br.net.veritylabs.lims`

LIMS owns the operational laboratory workflow. It is the source of truth for routine records that other modules consume.

Current and planned areas:

- Inventory: reagents, supplies, batches, expiration dates, entries, exits, and stock balances.
- Patients: patient registration and demographic records.
- Samples: sample collection, identification, handling, and traceability.
- Exams: exam catalog and operational definitions.
- Orders: laboratory requests and work orders.
- Results: result records and release workflow.
- Users: local user domain support when authentication is introduced.

## CQ Hub

Package root: `br.net.veritylabs.cqhub`

CQ Hub owns analytical quality control workflows.

Planned areas:

- QC materials and lots.
- Analytical runs.
- Control results.
- Levey-Jennings charts.
- Westgard-style rule evaluation.
- Nonconformance and corrective action records.

CQ Hub should consume operational and analytical data without taking ownership of LIMS source records.

## Analytics

Package root: `br.net.veritylabs.analytics`

Analytics owns reporting, dashboards, metrics, and exploratory analysis.

Planned areas:

- Operational dashboards.
- Inventory consumption indicators.
- Turnaround time metrics.
- QC trend views.
- Anomaly detection and decision-support experiments.

Analytics should prefer read models, projections, and aggregates instead of embedding operational write logic.

## Integration

Package root: `br.net.veritylabs.integration`

Integration owns external system boundaries.

Planned areas:

- REST APIs.
- Import and export jobs.
- Instrument connector adapters.
- Interoperability formats.
- Webhook and event delivery.

Integration code should translate external protocols into internal commands, DTOs, or events. Product modules should not depend on vendor-specific adapter code.
