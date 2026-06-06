# GitHub Projects Setup

Use one GitHub Project board named `VerityLabs Product Roadmap`.

## Board Views

Recommended views:

- Roadmap: grouped by `Module`, sorted by `Priority`.
- Sprint Board: grouped by `Status`, filtered to current milestone.
- Module Backlog: grouped by `Module`.
- Release Readiness: filtered by milestone and grouped by `Type`.

## Fields

Create these custom fields:

| Field | Type | Values |
| --- | --- | --- |
| Status | Single select | Backlog, Ready, In progress, In review, Blocked, Done |
| Module | Single select | LIMS, CQ Hub, Analytics, Integration, Shared |
| Type | Single select | Feature, Bug, Chore, Documentation, Research |
| Priority | Single select | P0, P1, P2, P3 |
| Target Phase | Single select | Phase 1, Phase 2, Phase 3, Phase 4, Phase 5 |
| Effort | Single select | S, M, L, XL |

## Labels

Create these repository labels:

- `module:lims`
- `module:cqhub`
- `module:analytics`
- `module:integration`
- `module:shared`
- `type:feature`
- `type:bug`
- `type:chore`
- `type:documentation`
- `type:research`
- `priority:p0`
- `priority:p1`
- `priority:p2`
- `priority:p3`

## Initial Project Items

Seed the project with these issues:

| Title | Module | Type | Priority | Target Phase |
| --- | --- | --- | --- | --- |
| Define inventory schema and Flyway migration | LIMS | Feature | P0 | Phase 1 |
| Implement inventory domain model | LIMS | Feature | P0 | Phase 1 |
| Persist inventory entries and exits | LIMS | Feature | P0 | Phase 1 |
| Add inventory balance calculation | LIMS | Feature | P0 | Phase 1 |
| Add authentication and roles | Shared | Feature | P1 | Phase 1 |
| Define patient, sample, exam, order, and result models | LIMS | Feature | P1 | Phase 2 |
| Model QC materials and control results | CQ Hub | Feature | P1 | Phase 3 |
| Prepare Levey-Jennings chart data | CQ Hub | Feature | P2 | Phase 3 |
| Build operational dashboard read models | Analytics | Feature | P2 | Phase 4 |
| Define public API contract strategy | Integration | Research | P2 | Phase 5 |

## GitHub CLI Notes

After `gh` is authenticated with access to `VerityLabs-Systems`, the board can be created from the terminal:

```bash
gh project create --owner VerityLabs-Systems --title "VerityLabs Product Roadmap"
```

GitHub Projects v2 field configuration is still easier to finish in the GitHub UI unless the repository already has a scripted organization standard.
