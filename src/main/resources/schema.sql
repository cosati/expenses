CREATE TABLE ENTRY(
    ENTRY_ID BIGSERIAL PRIMARY KEY,
    DESCRIPTION VARCHAR(16) NOT NULL,
    ENTRY_DATE DATE,
    TOTAL NUMERIC(19,2),
    CATEGORY_ID BIGINT NOT NULL,
    ENTRY_TYPE VARCHAR(16) NOT NULL
)

CREATE TABLE CATEGORY(
    CATEGORY_ID BIGSERIAL PRIMARY KEY,
    NAME VARCHAR(16) NOT NULL
)

CREATE TABLE TAG(
    HASHTAG_ID BIGSERIAL PRIMARY KEY,
    NAME VARCHAR(16) NOT NULL
)

CREATE TABLE ENTRY_TAG(
    ENTRY_ID BIGINT NOT NULL,
    TAG_ID BIGINT NOT NULL
)