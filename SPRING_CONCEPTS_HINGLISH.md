# 🍃 Spring Core & Spring Boot - Easy Hinglish Learning Guide

Yeh document repository ke **01 se 12 tak ke sabhi folders** aur unme sikhaye gaye concepts ko **ekdam sadharan aur aasan Hinglish** me samjhaata hai.

---

## 📌 Index / Folder Wise Quick Table

| Series # | Folder Name | Core Concept (Siddha Hindi/Hinglish Me) |
| :---: | :--- | :--- |
| **01** | `01-java-tight-coupling` | **Tight Coupling**: Direct `new` keyword se object banana (Bad Practice) |
| **02** | `02-java-dependency-injection` | **Loose Coupling & Manual DI**: Interface + Constructor Injection (Good Practice) |
| **03** | `03-maven-project-basics` | **Maven & `pom.xml`**: Libraries/JARs manage karne ka tool |
| **04** | `04-maven-template-setup` | **Maven Directory Layout**: `src/main/java`, `src/main/resources` structure |
| **05** | `05-spring-core-ioc-beans` | **Spring IoC Container**: `@Configuration`, `@Bean`, `@Qualifier`, `@Primary` |
| **06** | `06-spring-core-component-scan` | **Automatic Scanning**: `@Component` aur `@ComponentScan` |
| **07** | `07-spring-bean-scopes` | **Bean Lifetime Scopes**: `Singleton` vs `Prototype` |
| **08** | `08-spring-bean-lifecycle-lazy` | **Bean Lifecycle & `@Lazy`**: Deferred (der se) bean instantiation |
| **09** | `09-spring-circular-dependencies` | **Circular Dependency**: A → B aur B → A loop ko `@Lazy` se solve karna |
| **10** | `10-spring-boot-starter-setup` | **Spring Boot Basics**: `spring-boot-starter-parent` aur version management |
| **11** | `11-spring-boot-config-yaml` | **Spring Boot Config**: Entry point & external YAML (`microservice.yaml`) |
| **12** | `12-spring-boot-web-rest-controller` | **Spring Web REST API**: `@RestController` aur `@GetMapping` endpoints |

---

## 📁 Detailed Folder-Wise Explanations

---

### 01. `01-java-tight-coupling`
* **Concept**: Tight Coupling (Kada Jod / Rigid Dependencies)
* **Kya Code Banaya Gaya Hai?**:
  `OrderSomething` class ke andar hi direct `notificationservice notification = new EmailServices();` likha gaya hai.
* **Aasan Bhasa Me Samjho**:
  Jab ek Class apne andar doosri Class ka object `new` keyword se khud hi bana leti hai, toh use **Tight Coupling** bolte hain.
* **Iska Nuksan Kya Hai?**:
  1. **Fixed Dependency**: Kal ko agar Email ki jagah SMS notification bhejni ho, toh hume `OrderSomething` class ka code modify karna padega.
  2. **Testing Mushkil**: Unit testing ke waqt hum fake object inject nahi kar sakte.

---

### 02. `02-java-dependency-injection`
* **Concept**: Loose Coupling & Manual Dependency Injection (Pure Java Me)
* **Kya Code Banaya Gaya Hai?**:
  `Orderservice` class ab khud `new EmailServices()` nahi karti, balki Interface (`NotificationServices`) ka reference constructor ke dwara accept karti hai:
  `public Orderservice(NotificationServices notification)`
* **Aasan Bhasa Me Samjho**:
  "Agar ek class ko koi doosri class chahiye, toh wo khud se na banaye balki bahar se mangwa le (Inject karwaye)."
* **Fayda**:
  Ab hum `Orderservice` ko Email, SMS ya FakeEmail koi bhi service pass kar sakte hain bina `Orderservice` ka code change kiye! Isiko **Dependency Injection (DI)** aur **Inversion of Control (IoC)** ka basic foundation kehte hain.

---

### 03. `03-maven-project-basics`
* **Concept**: Maven Build Tool & `pom.xml` Dependency Management
* **Kya File Banai Gai Hai?**: `pom.xml` jisme MySQL Connector, Hibernate dependencies aur `<properties>` configured hain.
* **Aasan Bhasa Me Samjho**:
  Java me jab hume external libraries (jaise Database Driver ya Hibernate ORM) chahiye hoti hain, toh internet se manually `.jar` download karke attach karne ke bajaye **Maven** ka use kiya jata hai.
* **Important Terms**:
  - `pom.xml`: Project Object Model (sabzi ki receipt/list jisme bataya jata hai ki project ko kaun-kaun se tools chahiye).
  - `<groupId>`: Company/Organization ka naam (e.g. `org.example`).
  - `<artifactId>`: Project ka naam (e.g. `03-maven-project-basics`).
  - `<version>`: Project ka current version (e.g. `1.0-SNAPSHOT`).

---

### 04. `04-maven-template-setup`
* **Concept**: Standard Maven Project Folder Structure
* **Aasan Bhasa Me Samjho**:
  Maven duniya ke sabhi Java developers ke liye ek standard folder structure fix karta hai:
  - `src/main/java` ➡️ Saara main Java Source Code (.java files).
  - `src/main/resources` ➡️ Config files, properties, XML, YAML.
  - `src/test/java` ➡️ Unit test cases (.java test files).
  - `target/` ➡️ Compile hone ke baad bani `.class` aur `.jar` files (ye git me upload nahi hoti).

---

### 05. `05-spring-core-ioc-beans`
* **Concept**: Spring IoC Container & Java Configuration (`@Configuration`, `@Bean`, `@Qualifier`, `@Primary`)
* **Kya Code Banaya Gaya Hai?**:
  `AppConfig.java` me `@Configuration` lagakar `@Bean` methods se Beans create kiye gaye hain. `Main.java` me `AnnotationConfigApplicationContext` ka object banakar Spring Container ko initialize kiya gaya hai.
* **Aasan Bhasa Me Samjho**:
  Ab tak manual dependency injection kar rahe the (`new Orderservice(notification)`). Par **Spring Core** aane ke baad, Object banana aur Inject karna **Spring Container (IoC Container)** khud handle karta hai!
* **Important Annotations**:
  - `@Configuration`: Spring ko batata hai ki ye class Spring configuration file hai (IoC container ka blueprint).
  - `@Bean`: Jab Spring container start hota hai, is method ko chala kar return hone wale object ko **Spring Bean** ke roop me container me save kar leta hai.
  - `@Qualifier("UPI")`: Jab ek hi Interface ke multiple beans hote hain (jaise `CardPayment` aur `UPIpayment`), toh Spring container ko specific bean batane ke liye `@Qualifier` use karte hain.
  - `@Primary`: Direct call hone par kaunsa bean first priority hoga, use batata hai.

---

### 06. `06-spring-core-component-scan`
* **Concept**: Component Scanning (`@Component` & `@ComponentScan`)
* **Kya Code Banaya Gaya Hai?**: `CartServices.java` ke upar `@Component` lagaya gaya hai.
* **Aasan Bhasa Me Samjho**:
  Baar-baar `AppConfig` class me `@Bean` methods likhna tiring hota hai. Isliye Spring ne **Component Scan** ka feature diya:
  - Class ke upar `@Component` lagao.
  - `AppConfig` par `@ComponentScan("in.vinaymahato")` lagao.
  - Spring container automatically us package ke saare `@Component` annotated classes ko dhoond kar unka Bean khud bana deta hai!

---

### 07. `07-spring-bean-scopes`
* **Concept**: Spring Bean Scopes (Singleton vs Prototype)
* **Kya Code Banaya Gaya Hai?**: `AppConfig.java` me `@Bean` setup aur `Main.java` me beans mangwa kar unke references check kiye gaye hain.
* **Aasan Bhasa Me Samjho**:
  Spring Container me object (Bean) ka lifetime/behavior kaisa hoga?
* **Two Main Scopes**:
  1. **Singleton (Default Scope)**: Container pure application me sirf **EK HI OBJECT** banata hai. Kitni baar bhi `context.getBean()` call karo, wahi same instance return hoga (`bean1 == bean2` is `true`). Memory save hoti hai.
  2. **Prototype Scope (`@Scope("prototype")`)**: Har baar jab aap `context.getBean()` call karte ho, Spring Container ek **NAYA (Fresh)** object bana kar deta hai.

---

### 08. `08-spring-bean-lifecycle-lazy`
* **Concept**: Bean Lifecycle & Lazy Initialization (`@Lazy`)
* **Kya Code Banaya Gaya Hai?**: `OrderServices` constructor me `@Lazy PaymentServices paymentServices` inject kiya gaya hai.
* **Aasan Bhasa Me Samjho**:
  - **Eager Loading (Default)**: Spring Application jab start hota hai, toh saare Singleton Beans startup ke time par hi turant initialize ho jaate hain (bhale unki urghatna/jarurat turant ho ya na ho).
  - **Lazy Loading (`@Lazy`)**: Agar kisi Bean ya Dependency par `@Lazy` laga ho, toh Spring use startup par nahi banata. Jab pehli baar koi us bean ko actually demand/call karta hai, tabhi wo object memory me banta hai. Isse app ka startup time fast ho jata hai.

---

### 09. `09-spring-circular-dependencies`
* **Concept**: Circular Dependency Problem & Solution using `@Lazy`
* **Kya Code Banaya Gaya Hai?**:
  `orderService` ko `paymentService` chahiye, aur `paymentService` ko `orderService` chahiye.
* **Aasan Bhasa Me Samjho**:
  - **Problem**: Class A bolti hai "mujhse pehle B banao", aur Class B bolti hai "mujhse pehle A banao". Isse Spring loop me phans jata hai aur `BeanCurrentlyInCreationException` error deta hai.
  - **Solution**: Constructor me `@Lazy` annotation lagane se Spring ek temporary **Proxy Object** create kar deta hai, jisse circular dependency ka loop break ho jata hai aur app bina error ke chal jaati hai.

---

### 10. `10-spring-boot-starter-setup`
* **Concept**: Spring Boot Fundamentals & Starter Dependencies
* **Kya Code Banaya Gaya Hai?**: `pom.xml` jisme `spring-boot-starter-parent` aur starter dependencies include hain.
* **Aasan Bhasa Me Samjho**:
  Spring Core me hume har library ki compatibility aur XML/Config khud handle karni padti thi. **Spring Boot** ne aakar "Convention over Configuration" diya.
* **Key Features**:
  - `spring-boot-starter-parent`: Dependecies ke exact versions yaad rakhne ki jarurat nahi, Spring Boot parent POM sabhi version conflicts ko automatically manage kar leta hai.
  - **Starters**: Single dependency se related saari jaruri libraries ek saath import ho jaati hain.

---

### 11. `11-spring-boot-config-yaml`
* **Concept**: Spring Boot Entry Point & External YAML Configuration
* **Kya Code Banaya Gaya Hai?**: `Application.java` entry point, `HelloConsumer.java`, aur `microservice.yaml` configuration file.
* **Aasan Bhasa Me Samjho**:
  - Spring Boot app ko start karne ke liye `@SpringBootApplication` annotation aur `SpringApplication.run(Application.class, args);` use hota hai.
  - Configuration ke liye traditional `.properties` ke alawa `.yaml` (jaise `microservice.yaml`) file use ki jaati hai jo indentation-based readable formatting deti hai.

---

### 12. `12-spring-boot-web-rest-controller`
* **Concept**: Spring Boot Web MVC & REST APIs (`@RestController`, `@GetMapping`)
* **Kya Code Banaya Gaya Hai?**:
  `Hellocontroller.java` me `@RestController` aur `@GetMapping("hello")` & `@GetMapping("bye")` endpoints hain.
* **Aasan Bhasa Me Samjho**:
  Real-world Web APIs aur REST Services banana!
* **Key Components**:
  - `@RestController`: Class ko HTTP Web Controller banata hai jo JSON ya Text Response directly client/browser ko bhejta hai.
  - `@GetMapping("hello")`: Jab browser me `http://localhost:8080/hello` open karte hain, toh ye method execute hota hai.
  - **Embedded Tomcat Server**: Spring Boot app run karte hi internal Tomcat web server (Port 8080) par app live ho jaati hai!

---

## 💡 Summary Checklist

1. **`01` ➡️ `02`**: Tight Coupling se nikal kar Interface-based Dependency Injection sikha.
2. **`03` ➡️ `04`**: Manual Java se nikal kar Maven build tool aur `pom.xml` sikha.
3. **`05` ➡️ `09`**: Spring Core IoC Container, Beans, Component Scan, Scopes, Lazy Loading, aur Circular Dependency Resolution seekha.
4. **`10` ➡️ `12`**: Spring Core se Spring Boot Web REST Microservices banana seekha!
