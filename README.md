# Processing Template Project

> A Maven-based Java project template using the Processing libraries.

---

## What is this?

This template provides a Maven-based Java project skeleton for building Processing
sketches with a conventional project structure, dependency management, and
simple build/run commands.

---

## Prerequisites

Before you try to build or run the project, make sure you have:

- Java Development Kit (JDK) 17 or newer
- Apache Maven 3.9 or newer

---

## Quick Start

To get started clone this repository and `cd` to the project root:

```bash
git clone https://github.com/Maelkiz/processing-template-project.git
cd processing-template-project
```

### Basic Maven commands

Build (compile + package):

```bash
mvn clean package
```

Run via Maven (calls the `main` class):

```bash
mvn exec:java
```

Run the packaged JAR produced by the build:

```bash
java -jar target/processing-app.jar
```

Clean build artifacts:

```bash
mvn clean
```

---

## What now?

Where you take it next is up to you. This [repository](https://github.com/Maelkiz/spatial-index-visualizer) is an example of how the template can be adapted to a real project.

---
