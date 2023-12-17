CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR ( 255 ) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP
);

CREATE TABLE posts (
    post_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    title VARCHAR ( 255 ) NOT NULL,
    body TEXT NOT NULL,
    created_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE tweets (   
    tweet_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL,
    tweet_text VARCHAR ( 255 ) ,
    created_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULt CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
)