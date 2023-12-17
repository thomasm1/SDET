import Link from "next/link";
import React, { useState, useEffect } from "react";
import News_item from "../../components/blog/news_item";
import { news_data } from "../../data/news_data";
import Meta from "../../components/Meta";

const Blog = () => {
  const [userDetailsBtn, setUserDetailsBtn] = useState(true);
  const [name, setName] = useState("");

  const [loadMoreBtn, setLoadMoreBtn] = useState(true);
  const [data, setdata] = useState(news_data.slice(0, 6));
  let showDetails = false;
  let userId_local = "432" ; 
  // localStorage.setItem("email", "thomasm1.maestas@gmail.com");
  let email_local = "thomasm1.maestas@gmail.com"  ;
  // localStorage.setItem(`address`, "0x900bE021E38B8d08435A03c05657C8cFA837cAeF");
  let address_local = "0x900bE021E38B8d08435A03c05657C8cFA837cAeF";

  const handleLoadMore = () => {
    setdata(news_data);
    setLoadMoreBtn(false);
  };

  const toggleUserDetails = () => {
    if (showDetails === false) {
      userId_local = localStorage.getItem("userId");
      email_local = localStorage.getItem("email");
      address_local = localStorage.getItem("address");
      console.log("userId_local: ", userId_local);
      console.log("email_local: ", email_local);
      console.log("address_local: ", address_local);
      showDetails = true;
    } else {
      localStorage.removeItem("userId");
      localStorage.removeItem("email");
      localStorage.removeItem("address");
      userId_local = localStorage.getItem("userId");
      email_local = localStorage.getItem("email");
      address_local = localStorage.getItem("address");
      console.log("userId_local is removed: ", userId_local);
      console.log("email_localis removed: ", email_local);
      console.log("address_local is removed: ", address_local);
      showDetails = false;
    }
    setUserDetailsBtn(true);

  };
  useEffect(() => {
    // storing input name
    localStorage.setItem("userId", JSON.stringify(userId_local));
    localStorage.setItem("email", JSON.stringify(email_local));
    localStorage.setItem("address", JSON.stringify(address_local));
  }, [userId_local, email_local, address_local]);
  return (
    <>
      <Meta title="Blog || i3-Earth | NFT Marketplace Next.js Template" />
      {/* <!-- Blog --> */}
      <section className="relative  pt-[5.5rem] lg:pt-24">
        <div className="py-16 md:py-24">
          <picture className="pointer-events-none absolute inset-0 -z-10 dark:hidden">
            <img
              src="/images/gradient_light.jpg"
              alt="gradient"
              className="h-full w-full"
            />
          </picture>

          <div className="container">

            {/* <!-- Load User Details from Local Storage--> */}
            {userDetailsBtn && (
              <div className="mt-10 text-left">
             <code className="ml-30" style={{backgroundColor:"steelblue",width:"300px"}}>
             <h2 className="text-center">User Details</h2>
                <p><span className="mr-2 ml-30 " >userId_local:&nbsp;  </span>{userId_local}</p>
                <p><span className="mr-2 ml-30" >email_local:&nbsp;&nbsp;  </span>{email_local}</p>
                <p><span className="mr-2 ml-30" >address_local:   </span>{address_local}</p>
<hr></hr>
<br />
                <button
                  onClick={toggleUserDetails}
                  className="bg-accent shadow-accent-volume hover:bg-accent-dark inline-block rounded-full py-3 px-8 text-center font-semibold text-white transition-all"
                >
                  Show User Details
                </button>

             </code>
              </div>
            )}

            <h1 className="font-display text-jacarta-700 py-16 text-center text-4xl font-medium dark:text-white">
              Blog
            </h1>

            {/* <!-- Featured Post --> */}
            <article className="mb-[1.875rem] md:mb-16">
              <div className="rounded-2xl flex flex-col overflow-hidden transition-shadow hover:shadow-lg md:flex-row">
                <figure className="group overflow-hidden md:w-1/2">
                  <Link href="/single_post/post_1">
                    <a>
                      <img
                        src="/images/blog/post_1.jpg"
                        alt="post 1"
                        className="h-full w-full object-cover transition-transform duration-[1600ms] will-change-transform group-hover:scale-105"
                      />
                    </a>
                  </Link>
                </figure>

                {/* <!-- Body --> */}
                <div className="dark:border-jacarta-600 dark:bg-jacarta-700 border-jacarta-100 rounded-b-[1.25rem] border bg-white p-[10%] md:w-1/2 md:rounded-none md:rounded-r-[1.25rem]">
                  {/* <!-- Meta --> */}
                  <div className="mb-3 flex flex-wrap items-center space-x-1 text-xs">
                    <Link href="#">
                      <a className="dark:text-jacarta-200 text-jacarta-700 font-display hover:text-accent">
                        Deothemes
                      </a>
                    </Link>
                    <span className="dark:text-jacarta-400">in</span>
                    <span className="text-accent inline-flex flex-wrap items-center space-x-1">
                      <a href="#">{"NFT's"}</a>
                      <a href="#">DIGITAL_NFT_ART</a>
                    </span>
                  </div>

                  <h2 className="font-display text-jacarta-700 dark:hover:text-accent hover:text-accent mb-4 text-xl dark:text-white sm:text-3xl">

                    {/*  Updating Post_1 for this in /pages/single_post/[single_post].jsx  ! .... tmm */}
                    <Link href="/single_post/post_1">
                      <a> List your collection for secondary sales </a>
                    </Link>
                  </h2>
                  <p className="dark:text-jacarta-200 mb-8">
                    Since we launched <i3-earth>_i3-earth_</i3-earth> at the end of 2021, Jil and team in Germany. Thomas joined in 2022, and Colin n Michael joined in 2023. To the many awesome
                    creators...
                  </p>

                  {/* <!-- Date / Time --> */}
                  <div className="text-jacarta-400 flex flex-wrap items-center space-x-2 text-sm">
                    <span>
                      <p>Published on:</p>

                      {/*  Adding live date and time to blog view  tmm */}
                      <time>
                        {new Date().toLocaleDateString("en-US", {}
                        )}

                      </time>
                    </span>
                    <span>•</span>
                    <span>3 min read</span>
                  </div>
                </div>
              </div>
            </article>

            <News_item data={data} />

            {/* <!-- Load More --> */}
            {loadMoreBtn && (
              <div className="mt-10 text-center">
                <button
                  onClick={handleLoadMore}
                  className="bg-accent shadow-accent-volume hover:bg-accent-dark inline-block rounded-full py-3 px-8 text-center font-semibold text-white transition-all"
                >
                  Load More
                </button>
              </div>
            )}
          </div>
        </div>
      </section>
      {/* <!-- end blog --> */}
    </>
  );
};

export default Blog;