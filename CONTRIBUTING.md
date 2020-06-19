# Contributor guide

This guide is for contributors.

### Contributing

Follow the [fork and pull](https://help.github.com/articles/using-pull-requests/) model.
[Required status checks](https://help.github.com/en/github/administering-a-repository/about-required-status-checks) are enabled for merging PRs.

### Testing
Mezzo follows [TDD](https://en.wikipedia.org/wiki/Test-driven_development).

### Building the project
Run `sbt`, and then use any of the following commands:
 * `run`: run main
 * `compile`: compile
 * `console`: repl
 * `test`: unit test
 * `coverage`: Turns coverage on
 * `coverageOff`: Turns coverage off
 * `coverageReport`: Creates coverage report
 * `scalafmtAll/scalafmtSbt`: lint
 * `dependencyUpdates`: check for dependency updates
 * `microsite`: build static documentation page
 * `publishMicrosite`: build and publish documentation to gh-pages (proper ssh keys must be set up)