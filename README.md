# 🔗 REST API Automation Framework — RestAssured + Java

A comprehensive REST API testing framework built with **RestAssured**, **Java**, and **TestNG**, covering all major HTTP methods including GET, POST, PUT, PATCH, DELETE and JSON Schema Validation.

---

## 📊 Live Test Report

🔗 [View Live Test Report](https://hammadasif-997.github.io/RestAssurePractice/reports/index.html)

---

## 🚀 APIs Tested

| API | Base URL | Type |
|---|---|---|
| ReqRes API | https://reqres.in | Public REST API |
| RahulShetty Academy API | https://rahulshettyacademy.com | Practice REST API |

---

## 🛠️ Tech Stack

| Tool | Purpose |
|---|---|
| Java | Programming language |
| RestAssured | API test automation library |
| TestNG | Test execution & assertions |
| Maven | Dependency management |
| JSON Simple | JSON request payload builder |
| Hamcrest | Assertion library |
| JSON Schema Validator | Schema validation |

---

## 📁 Project Structure

```
├── src/test/java/
│   ├── GetandPost.java        # GET and POST request tests
│   ├── PutAndPatch.java       # PUT, PATCH and DELETE tests
│   ├── RestAssureTest.java    # Place API — POST with query params
│   ├── TestExample.java       # Response extraction examples
│   └── ValidationCheck.java  # JSON Schema validation tests
├── src/test/resources/
│   └── schema.json            # JSON Schema for validation
├── reports/                   # Test execution reports
├── testng.xml                 # TestNG suite configuration
└── pom.xml                    # Maven dependencies
```

---

## ⚙️ Prerequisites

- Java JDK 11+
- Maven 3.6+
- Internet connection (for API calls)

---

## ▶️ How to Run

**Clone the repository:**
```bash
git clone https://github.com/HammadAsif-997/RestAssurePractice.git
cd RestAssurePractice
```

**Run all tests:**
```bash
mvn test
```

---

## 📊 Test Scenarios

### GetandPost.java
| # | Method | Endpoint | Description |
|---|---|---|---|
| 1 | GET | /api/users?page=2 | Fetch users, verify status 200, validate first_name values with Hamcrest |
| 2 | POST | /api/users | Create user with JSON payload, verify status 201 |

### PutAndPatch.java
| # | Method | Endpoint | Description |
|---|---|---|---|
| 1 | PUT | /api/users/2 | Full update of user with JSON body, verify status 200 |

### TestExample.java
| # | Method | Endpoint | Description |
|---|---|---|---|
| 1 | GET | /api/users?page=2 | Extract and print status code, response time, body, headers |
| 2 | GET | /api/users?page=2 | Verify status 200 with full response logging |

### ValidationCheck.java
| # | Method | Endpoint | Description |
|---|---|---|---|
| 1 | GET | /api/users?page=2 | Validate response against JSON Schema |

### RestAssureTest.java
| # | Method | Endpoint | Description |
|---|---|---|---|
| 1 | POST | /maps/api/place/add/json | Add a place with location, name, address and verify status 200 |

---

## 🔑 Key Highlights

- **Full CRUD coverage** — GET, POST, PUT, PATCH, DELETE all tested
- **JSON Schema Validation** — Response structure validated against schema.json
- **Hamcrest assertions** — Body fields validated with equalTo(), hasItems()
- **Response extraction** — Status code, response time, headers extracted and logged
- **Multiple APIs** — Tests cover both ReqRes and RahulShetty Academy APIs
- **Given-When-Then pattern** — Clean, readable RestAssured test structure

---

## 📈 Results

- **5 automated test cases** — all passing ✅
- All major HTTP methods tested — GET, POST, PUT
- JSON Schema validation ensuring API contract compliance

---

## 👤 Author

**Hammad Asif**
- 📧 hmmd97@gmail.com
- 🔗 [LinkedIn](https://linkedin.com/in/hammad-asif-26466a91)
- 💻 [GitHub](https://github.com/HammadAsif-997)
