// Method 3: Using pg-promise
import pgPromise from 'pg-promise';
const pgp = pgPromise({});
const db = pgp(process.env.DATABASE_URL);
export default db;

// import postgres from 'postgres';
// export const sql = postgres({ connectionString: process.env.DATABASE_URL, ssl:true });


// import { Client } from 'pg';

// export const client = new Client({ connectionString: process.env.DATABASE_URL, ssl:true });
// client.connect();