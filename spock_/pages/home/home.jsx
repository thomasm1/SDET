import React from "react";
import {
  Hero,
  Bids,
  Top_collection,
  Tranding_category,
  NewseLatter,
} from "../../components/component";
import Meta from "../../components/Meta";
import CoverflowCarousel from "../../components/carousel/coverflowCarousel";
import Browse_category from "../../components/categories/Browse_category";
import Feature_collections from "../../components/collectrions/Feature_collections";


const Home = async () => {
  // method 1 - using knex
  // const knex = require('knex');
  // const client = knex({
  //   client: 'pg',
  //   connection: {
  //     host: '
  // 'localhost',
  //.... 
// }
// const tweetsSql = await sql<Tweet[]> `SELECT * FROM tweets`; // SELECT * /FROM tweets

// method 2 - using formData
// async function sendTweet(formData:FormData) {
//   "use server"
//   const text = formData.get('tweet');// as string;
//   const userId = formData.get('userId') || 123; 
//   await sql`INSERT INTO tweets (tweet_text, user_id) VALUES (${text},${userId})`;

// method 3 - using knex
// import knex from "knex";
//
// export const client = knex({
//   client: "pg",
//   connection: {
//     host: "localhost",
//     ... // other connection details
//   },
// });

// method 3 cont'd - using knex
// export default async function Home() {
//   const tweets = await client('tweets').select('*')
//   .where('user_id',123); // SELECT * /FROM tweets
// }
// method 3 cont'd - using knex - send formdata
// async function sendTweet(formData:FormData) {
//   "use server"
// await client('tweets').insert({
//   tweet_text: formData.get('tweet'),
//   user_id: formData.get('userId') || 123,
// });

  const rows = await client.select().from('users'); // SELECT * /FROM users
  const queries = await client.select('user_id', 'tweet_id', 'name').from('tweets'); // SELECT id, name FROM tweets
  const q = await client.query<any>('SELECT * FROM tweets'); // SELECT * FROM Tweets (raw query)
  const tweets = q.rows;
  console.log(rows);
  
  const page = async () => {
    const { data } = await axios.get("https://jsonplaceholder.typicode.com/posts");
   console.log(data);
  };
  page();
  
  return (
    <main>
      <Meta title="Home" />
      <Hero />
      <CoverflowCarousel />
      <Top_collection />``
      <Browse_category bgWhite={true} />
      <NewseLatter bgWhite={true} />
      <Feature_collections />
      <h2>tweets on crypto ...</h2>
      <ul>
        {tweets.map((tweet) => (
          <li key={tweet.tweet_id}>
            <p>{tweet.name}</p>
          </li>
        ))}
      </ul>
    </main>
  );
};

export default Home;
