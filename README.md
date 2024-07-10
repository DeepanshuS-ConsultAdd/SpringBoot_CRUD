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
#### a)Role: User
<img width="1440" alt="Screenshot 2024-07-09 at 10 34 22 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/5c157ad2-fa25-42fd-9fee-5e011896bd8f">

#### b) Role: Admin
<img width="1440" alt="Screenshot 2024-07-10 at 8 43 09 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/def7760b-293a-4fc5-9173-6fc9f86d15e5">

### 3.Authenticating User/Generating JWT Token
#### a) Generating Token with Authenticate User
<img width="1440" alt="Screenshot 2024-07-09 at 10 43 11 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/1a91f449-f74f-415a-a6a5-ed13e7dd248a">

#### b) Generating Token with Non-Authenticated User
<img width="1440" alt="Screenshot 2024-07-09 at 10 44 11 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/f4538581-938f-4574-8ef0-c22a2be7d4c6">

#### c)Verifying Token
<img width="1440" alt="Screenshot 2024-07-09 at 11 50 14 PM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/0e7894ab-f478-4b12-94a7-fd55c1152c92">

### 4. CRUD Operation
#### a) GET Operation
<img width="1440" alt="Screenshot 2024-07-10 at 8 43 32 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/d9ac73e4-fa47-44b4-822a-8518c9a8aaa3">

#### b) POST Operation
<img width="1440" alt="Screenshot 2024-07-10 at 8 44 04 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/c17d6d0c-01dd-4889-b905-ffcf70dbb4fe">
##### OUTPUT
<img width="1440" alt="Screenshot 2024-07-10 at 8 44 13 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/6ad6fbeb-155f-4225-9334-a3ae7e44a330">

#### c) PUT Operation
<img width="1440" alt="Screenshot 2024-07-10 at 8 45 00 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/658b3f27-5408-47cc-a409-b18502474dc8">
##### OUTPUT
<img width="1440" alt="Screenshot 2024-07-10 at 8 45 07 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/3cee0539-66db-4892-9588-426542b0a599">

#### d) PATCH Operation
<img width="1440" alt="Screenshot 2024-07-10 at 8 45 51 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/40e62b9e-ff19-46bd-a9e6-6a99eea66702">
##### OUTPUT
<img width="1440" alt="Screenshot 2024-07-10 at 8 45 59 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/19cf79aa-08b1-44e8-af9e-3f2778088171">

#### e) Delete Operation
<img width="1440" alt="Screenshot 2024-07-10 at 8 46 16 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/0df44265-fb02-4221-9eca-94872e5dad8c">

### 5. Table's
#### a) User-Password Table
<img width="1440" alt="Screenshot 2024-07-10 at 8 53 24 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/85fade1f-bf34-4a13-ae9b-eced7b227bfe">


#### b) Employee Table
<img width="1440" alt="Screenshot 2024-07-10 at 8 51 30 AM" src="https://github.com/DeepanshuS-ConsultAdd/SpringBoot_CRUD/assets/174502313/ae8ebfc4-5b4f-492c-81eb-62a9fe16df29">




