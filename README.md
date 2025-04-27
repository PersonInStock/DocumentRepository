# DocumentRepository API

This API provides endpoints for managing documents, including saving, retrieving, and listing documents.

## Endpoints

### 1. Save Document

**Description:**

Saves a document if it doesn't already exist. Returns a conflict if a document with the same ID already exists.

**Request Body Example:**

```json
{
  "id": "12345",
  "name": "Sample Document",
  "description": "This is a sample document",
  "documentType": "PDF",
  "version": "1.0"
}
```

**Success Response Example:**

- **Code:** 201 CREATED
- **Content:** `Document with ID 12345 created successfully`

**Conflict Response Example:**

- **Code:** 409 CONFLICT
- **Content:** `Document with ID 12345 already exists`

**cURL Command:**

```sh
curl -X POST http://localhost:8080/tmf-api/document/v4/saveDocument \
     -H "Content-Type: application/json" \
     -d '{"id": "12345", "name": "Sample Document", "description": "This is a sample document", "documentType": "PDF", "version": "1.0"}'
```

### 2. Retrieve All Documents

**Description:**

Retrieves a list of all documents.

**Success Response Example:**

- **Code:** 200 OK
- **Content:** List of documents in JSON format

**cURL Command:**

```sh
curl -X GET 'http://localhost:8080/tmf-api/document/v4/getDocuments?page=1&size=20'
```

### 3. Retrieve A Document

**Description:**

Retrieves a document by its ID.

**Path Parameters:**

- `id` (required): The ID of the document to retrieve.

**Success Response Example:**

- **Code:** 200 OK
- **Content:** The document in JSON format

**Not Found Response Example:**

- **Code:** 404 NOT FOUND
- **Content:** Not implemented

**cURL Command:**

```sh
curl -X GET http://localhost:8080/tmf-api/document/v4/document/12345
```

### 4. Delete A Document

**Description:**

Deletes a document by its ID.

**Path Parameters:**

- `id` (required): The ID of the document to retrieve.

**Success Response Example:**

- **Code:** 200 OK
- **Content:** The document in JSON format

**Not Found Response Example:**

- **Code:** 404 NOT FOUND
- **Content:** Not implemented

**cURL Command:**

```sh
curl -X DELETE http://localhost:8080/tmf-api/document/v4/document/12345
```
