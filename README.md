# Springboot CRUD with JWT Security

## CRUD

CRUD stands for Create, Read, Update, and Delete. These are the four basic operations for managing persistent data:
Create: Adding new records to the database.
Read: Retrieving existing records from the database.
Update: Modifying existing records in the database.
Delete: Removing records from the database.

## JWT

JWT (JSON Web Token) is a secure, compact, URL-safe token format used for transmitting information between parties as a JSON object. Commonly used for authentication and authorization in web applications, a JWT is composed of three parts:
Header: Specifies the token type and signing algorithm.
Payload: Contains the claims, which are statements about an entity (typically the user) and additional data.
Signature: Ensures the token’s integrity and authenticity.

### 1.Generating Secret key
<img width="1440" alt="Screenshot 2024-07-09 at 8 43 16 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/560f7640-1a5a-4cc6-b11a-c4dd30535068">

### 2.Registring User
<img width="1440" alt="Screenshot 2024-07-09 at 10 34 22 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/5c157ad2-fa25-42fd-9fee-5e011896bd8f">

### 3.Authenticating User/Generating JWT Token
#### a) Correct User
<img width="1440" alt="Screenshot 2024-07-09 at 10 43 11 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/1a91f449-f74f-415a-a6a5-ed13e7dd248a">

#### b) Incorrect User
<img width="1440" alt="Screenshot 2024-07-09 at 10 44 11 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/f4538581-938f-4574-8ef0-c22a2be7d4c6">

#### c)Verifying Token
<img width="1440" alt="Screenshot 2024-07-09 at 11 49 55 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/c7307ec8-1ba1-4be1-851b-28fed67ba6b9">

<img width="1440" alt="Screenshot 2024-07-09 at 11 50 14 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/0e7894ab-f478-4b12-94a7-fd55c1152c92">

### 4.


