import Footer from "./footer";
import Wallet_modal from "./modal/wallet_modal";
import BuyModal from "./modal/buyModal";
import Header from "./header/Header";

export default function Layout({ children }) {
  return (
      <>
        <Header />
        <Wallet_modal />
        <BuyModal />
        <main>{children}</main>
        <Footer />
      </>
  )
}
