<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=220&section=header&text=Spring%3A%20Birth%20to%20Boot&fontSize=52&fontColor=ffffff&fontAlignY=38&desc=A%20Living%20Learning%20Journey%20from%20Zero%20to%20Spring%20Hero&descAlignY=60&descSize=18&animation=fadeIn" width="100%" alt="Header Banner"/>
</p>

<p align="center">
  <a href="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=22&pause=1000&color=38BDF8&center=true&vCenter=true&width=700&lines=Welcome+to+Spring+%3A+Birth+to+Boot+%F0%9F%8C%B1;Learn+Spring+from+absolute+Zero...;Core+Concepts+%E2%86%92+Spring+Boot+%E2%86%92+Real+Projects;Built+for+Absolute+Beginners+%F0%9F%9A%80;By+ADV+Indian+Coder+%7C+Vinay+Kumar+Mahato">
    <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=22&pause=1000&color=38BDF8&center=true&vCenter=true&width=700&lines=Welcome+to+Spring+%3A+Birth+to+Boot+%F0%9F%8C%B1;Learn+Spring+from+absolute+Zero...;Core+Concepts+%E2%86%92+Spring+Boot+%E2%86%92+Real+Projects;Built+for+Absolute+Beginners+%F0%9F%9A%80;By+ADV+Indian+Coder+%7C+Vinay+Kumar+Mahato" alt="Typing Banner"/>
  </a>
</p>

<p align="center">
  <a href="https://github.com/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot/stargazers">
    <img src="https://img.shields.io/github/stars/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot?style=for-the-badge&logo=starship&color=f9c74f&labelColor=0d1117" alt="Stars"/>
  </a>
  <a href="https://github.com/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot/forks">
    <img src="https://img.shields.io/github/forks/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot?style=for-the-badge&logo=git&color=43aa8b&labelColor=0d1117" alt="Forks"/>
  </a>
  <a href="https://github.com/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot/issues">
    <img src="https://img.shields.io/github/issues/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot?style=for-the-badge&logo=github&color=f3722c&labelColor=0d1117" alt="Issues"/>
  </a>
  <img src="https://img.shields.io/badge/Java-21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white&labelColor=0d1117" alt="Java"/>
  <img src="https://img.shields.io/badge/Spring-Framework-6DB33F?style=for-the-badge&logo=spring&logoColor=white&labelColor=0d1117" alt="Spring"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white&labelColor=0d1117" alt="Spring Boot"/>
  <img src="https://komarev.com/ghpvc/?username=Vinaykumarmahato&label=Repository+Views&color=38bdf8&style=for-the-badge&labelColor=0d1117" alt="Visitors"/>
</p>

---

## 🌱 About This Repository

> **This is not a finished course. This is a living, breathing journey.**

This repository is a **personal and public learning log** that documents an end-to-end exploration of the **Spring ecosystem** — starting from the very first concept of what Spring even is, all the way through Spring Core internals and Spring Boot mastery.

Every commit here represents a real learning milestone. Every file added is a step taken. Whether you are a **complete beginner who has never written a single line of Java** or someone who wants to understand Spring properly from first principles — this space is built for you.

---

## 🗺️ Learning Roadmap Overview

| Module # | Directory Name | Concept Covered | Key Concepts / Annotations |
| :---: | :--- | :--- | :--- |
| **01** | [`01-java-tight-coupling`](./01-java-tight-coupling) | **Tight Coupling in Java** | Hardcoded dependencies (`new Service()`), high rigidity |
| **02** | [`02-java-dependency-injection`](./02-java-dependency-injection) | **Manual Dependency Injection** | Interfaces, loose coupling, constructor injection in pure Java |
| **03** | [`03-maven-project-basics`](./03-maven-project-basics) | **Maven Build System** | `pom.xml`, dependencies (MySQL, Hibernate), custom properties, JAR packaging |
| **04** | [`04-maven-template-setup`](./04-maven-template-setup) | **Maven Directory Archetype** | Standard Maven directory layouts (`src/main/java`, `src/test/java`) |
| **05** | [`05-spring-core-ioc-beans`](./05-spring-core-ioc-beans) | **Spring IoC & Java Config** | `ApplicationContext`, `@Configuration`, `@Bean`, `@Qualifier`, `@Primary` |
| **06** | [`06-spring-core-component-scan`](./06-spring-core-component-scan) | **Spring Component Scanning** | `@Component`, `@Autowired`, automated bean creation |
| **07** | [`07-spring-bean-scopes`](./07-spring-bean-scopes) | **Spring Bean Scopes** | `Singleton` (default container scope) vs `Prototype` (new instance per request) |
| **08** | [`08-spring-bean-lifecycle-lazy`](./08-spring-bean-lifecycle-lazy) | **Bean Lifecycle & Lazy Loading** | `@Lazy` initialization, container startup vs bean usage |
| **09** | [`09-spring-circular-dependencies`](./09-spring-circular-dependencies) | **Circular Dependency Resolution** | Cyclic bean references (A → B → A), `@Lazy` injection resolution |
| **10** | [`10-spring-boot-starter-setup`](./10-spring-boot-starter-setup) | **Spring Boot Starter Intro** | Transition from manual Spring Core POM dependencies to Spring Boot Starters |
| **11** | [`11-spring-boot-config-yaml`](./11-spring-boot-config-yaml) | **Spring Boot YAML Configuration** | `microservice.yaml`, external configuration properties, app entrypoint |
| **12** | [`12-spring-boot-web-rest-controller`](./12-spring-boot-web-rest-controller) | **Spring Boot Web REST API** | `@RestController`, `@GetMapping`, Spring Web MVC, HTTP request endpoints |

---

## 📘 Detailed Module Guide

### Section 1: Java OOP & Dependency Injection Fundamentals
- **`01-java-tight-coupling`**: Demonstrates the traditional problem of tight coupling where a class (`OrderSomething`) directly instantiates its concrete dependency (`new EmailServices()`).
- **`02-java-dependency-injection`**: Resolves tight coupling by injecting dependencies through interface abstractions (`NotificationServices`) into class constructors.

### Section 2: Build Tools (Maven)
- **`03-maven-project-basics`**: Teaches Maven project structure, dependency management (Hibernate, MySQL connector), build profiles, and JAR packaging.
- **`04-maven-template-setup`**: Starter project layout for Java/Maven applications.

### Section 3: Spring Core Framework (IoC Container & Beans)
- **`05-spring-core-ioc-beans`**: Introduces Spring IoC container (`AnnotationConfigApplicationContext`). Configures beans using `@Configuration` and explicit `@Bean` methods with `@Qualifier` and `@Primary` resolution.
- **`06-spring-core-component-scan`**: Demonstrates `@ComponentScan` and `@Component` for automatic bean discovery and injection.
- **`07-spring-bean-scopes`**: Explores Spring bean lifecycle scopes—comparing Singleton instances against Prototype creation.
- **`08-spring-bean-lifecycle-lazy`**: Illustrates bean creation timing and `@Lazy` initialization to defer bean instantiation until requested.
- **`09-spring-circular-dependencies`**: Focuses on circular dependency issues between beans and how to resolve them cleanly using `@Lazy` constructor parameter annotations.

### Section 4: Spring Boot & Web REST Microservices
- **`10-spring-boot-starter-setup`**: Introduces Spring Boot's opinionated dependency management with `spring-boot-starter-parent`.
- **`11-spring-boot-config-yaml`**: Demonstrates Spring Boot application startup with YAML configuration (`microservice.yaml`).
- **`12-spring-boot-web-rest-controller`**: Builds an active RESTful web microservice using `@RestController`, `@GetMapping`, returning HTTP web responses.

---

## 🛠️ Tech Stack

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,spring,maven,gradle,idea,vscode,git,github,postman,mysql&theme=dark&perline=10" alt="Tech Stack Icons"/>
</p>

<p align="center">
  <b>Java &nbsp;|&nbsp; Spring Framework &nbsp;|&nbsp; Spring Boot &nbsp;|&nbsp; Maven &nbsp;|&nbsp; Gradle &nbsp;|&nbsp; IntelliJ IDEA &nbsp;|&nbsp; Git &nbsp;|&nbsp; GitHub &nbsp;|&nbsp; Postman &nbsp;|&nbsp; MySQL</b>
</p>

---

## 🚀 Getting Started

You don't need to be an expert to get started. If you have Java installed, you're ready.

**Clone this repository to your local machine:**

```bash
git clone https://github.com/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot.git
cd springBirthToSpringCoreAndSpringBoot
```

**Running Any Module:**

```bash
# Navigate to desired module
cd 05-spring-core-ioc-beans

# Build project with Maven
mvn clean compile

# Run Java Main class
mvn exec:java -Dexec.mainClass="in.vinaymahato.Main"
```

For Spring Boot Web controller (`12-spring-boot-web-rest-controller`):
```bash
cd 12-spring-boot-web-rest-controller
./mvnw spring-boot:run
```
Then visit `http://localhost:8080/hello` or `http://localhost:8080/bye` in your browser!

---

## 📊 Learning Progress

<p align="center">
  <img src="https://streak-stats.demolab.com?user=Vinaykumarmahato&theme=tokyonight-duo&hide_border=true&background=0d1117&stroke=38bdf8&ring=38bdf8&fire=f9c74f&currStreakLabel=38bdf8&sideLabels=38bdf8&dates=8b949e" alt="GitHub Streak Stats"/>
</p>

---

## 🤝 Contributions Welcome

This is an open learning repository. If you are also on a Spring learning journey, your contributions are genuinely welcome.

- 🐛 **Found a bug or incorrect explanation?** Open an [Issue](https://github.com/Vinaykumarmahato/springBirthToSpringCoreAndSpringBoot/issues)
- 💬 **Have a better way to explain something?** Open a Pull Request
- ⭐ **Enjoy this repo?** Star it — it keeps the motivation going!

---

## 🌐 Connect With Me

<p align="center">
  <a href="https://advindiancoder.com" target="_blank">
    <img src="https://img.shields.io/badge/Website-ADV%20Indian%20Coder-38bdf8?style=for-the-badge&logo=googlechrome&logoColor=white&labelColor=0d1117" alt="Website"/>
  </a>
  &nbsp;
  <a href="https://www.youtube.com/@ADVIndianCoder" target="_blank">
    <img src="https://img.shields.io/badge/YouTube-ADV%20Indian%20Coder-FF0000?style=for-the-badge&logo=youtube&logoColor=white&labelColor=0d1117" alt="YouTube"/>
  </a>
  &nbsp;
  <a href="https://www.linkedin.com/in/vinaykumar860964/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-Vinay%20Kumar%20Mahato-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white&labelColor=0d1117" alt="LinkedIn"/>
  </a>
  &nbsp;
  <a href="https://www.instagram.com/vinaymahato.in/" target="_blank">
    <img src="https://img.shields.io/badge/Instagram-vinaymahato.in-E4405F?style=for-the-badge&logo=instagram&logoColor=white&labelColor=0d1117" alt="Instagram"/>
  </a>
  &nbsp;
  <a href="https://github.com/Vinaykumarmahato" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-Vinaykumarmahato-ffffff?style=for-the-badge&logo=github&logoColor=white&labelColor=0d1117" alt="GitHub"/>
  </a>
</p>

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,50:203a43,100:0f2027&height=120&section=footer&animation=fadeIn" width="100%" alt="Footer Wave"/>
</p>

<p align="center">
  <sub>Made with ❤️ by <strong>Vinay Kumar Mahato</strong> &nbsp;|&nbsp; <a href="https://advindiancoder.com">ADV Indian Coder</a></sub>
</p>
